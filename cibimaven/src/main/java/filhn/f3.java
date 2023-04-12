package filhn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class f3 {
	
	@Test
	public void rq() throws IOException
	{
		
		// apache poi, apache poi ooxml, apache poi ooxml schema
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// numbe of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		// number of columns in Row
		int col=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of columns "+ col);
		
		//7,2
		XSSFCell data = sheet.getRow(7).getCell(2);
		System.out.println(data);
		
		//58,4
		sheet.getRow(58).createCell(4).setCellValue("CIBI");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}

}
