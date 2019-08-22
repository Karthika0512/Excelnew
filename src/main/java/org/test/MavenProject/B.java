package org.test.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class B {
	public static String getDate(int rowno,int colno) throws IOException {
		File a = new File("C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\MavenProject\\Excel\\Flipkart.xlsx");
		FileInputStream s = new FileInputStream(a);
		Workbook W = new XSSFWorkbook(s);
		Sheet h = W.getSheet("First");
		Row r = h.getRow(rowno);
		Cell c = r.getCell(colno);
				int type = c.getCellType();
				String name=" ";
				if(type==1) {
					  name = c.getStringCellValue();				
				}
				if(type==0) {
					if(DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat im = new SimpleDateFormat("dd/MM/yyyy");
						name=im.format(date);		
					}
					else {
					double d = c.getNumericCellValue();
					long l=(long) d;
					name = String.valueOf(l);			
				}}
				return name;
				}}
		
		
			
		
		


