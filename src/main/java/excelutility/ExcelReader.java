package excelutility;

public interface ExcelReader {
	
	public String getExcelData(String path, int sheetNum, int rowNum, int colNum);

}
