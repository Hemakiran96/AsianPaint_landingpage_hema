package com.readdata;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utility.Config;



public class LandingPage_Excel extends Config {

	public List<LandingPage> readExcel(String sheetTitle) throws Exception {

		String sheetName = sheetTitle;
		
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(sheetName);

		String Name = null;
		String Gmail = null;
		String Mobile = null;
		String Pincode = null;

		DataFormatter formatter = new DataFormatter();

		List<LandingPage> details = new ArrayList<>();

		Iterator<Row> itr = sh.rowIterator();
		
		while (itr.hasNext()) {
			Row row = itr.next();

			for (int i = 0; i < row.getLastCellNum(); i++) {
				Cell cell = row.getCell(i);

				switch (i) {
				case 0:
					Name = cell.toString();
					//System.out.println(Name);
					break;

				case 1:
					Gmail = cell.toString();
					//System.out.println(Gmail);
					break;

				case 2:
					Mobile  = formatter.formatCellValue(cell);
					//System.out.println(Mobile);
					break;

				case 3:
					Pincode = formatter.formatCellValue(cell);
					//System.out.println(Pincode);
					break;

				}

			}
			details.add(new LandingPage(Name, Gmail, Mobile, Pincode));

			wb.close();
		}
		
		return details;

	}

}