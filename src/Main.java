public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Spreadsheet spreadsheet = new Spreadsheet();
        spreadsheet.setCellValue("A1", 13);
        spreadsheet.setCellValue("A2", 14);
        spreadsheet.setCellValue("A3", "=A1 + A2");
        spreadsheet.setCellValue("A4","=A1 + A2 + A3");


        System.out.println(spreadsheet.getCellValue("A1"));
        System.out.println(spreadsheet.getCellValue("A2"));
        System.out.println(spreadsheet.getCellValue("A3"));
        System.out.println(spreadsheet.getCellValue("A4"));

    }
}