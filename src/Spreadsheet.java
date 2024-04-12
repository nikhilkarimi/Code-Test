import java.util.HashMap;

public class Spreadsheet {

    HashMap<String,Object> hashMap = new HashMap<>();

    public void setCellValue(String cellId,Object value){
        hashMap.put(cellId,value);
    }

    public Object getCellValue(String cellId){
        Object value = hashMap.get(cellId);
        if(value instanceof String && ((String) value).startsWith("=")){
            String str = (String) value;
            String[] parts = str.substring(1).split("\\+");
            int sum =0;
            for (String part:parts){
                String trimValue = part.trim();
                if (trimValue.matches("[A-Z]+[0-9]+")){
                    Object values = getCellValue(trimValue);
                    if (values instanceof  Integer){
                        sum += (int)values;
                    }
                } else if (trimValue.matches("\\d+")) {
                    sum += Integer.parseInt(trimValue);
                }
            }
            return  sum;
        }
        return value;
    }
}
