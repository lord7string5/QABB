package Readdata;

import java.io.IOException;

//Added by Referenced Libraries....build path and add under class path...external jars
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book = null;
		
		try {
			book=new XSSFWorkbook("D:\\Adhikari\\Documents\\WS\\Eclipse\\Sample\\Name.xlsx");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println(columncount);
		
		String s1=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(s1);
		
		
		for(int i=0; i<rowcount; i++) {
			for(int j=0; j<columncount;j++) {
				s1=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(s1);
			} 
			
		}
		

	}

}
