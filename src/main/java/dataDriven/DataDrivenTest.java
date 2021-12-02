package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenTest d = new DataDrivenTest();
		ArrayList data = d.getData("Purchase");

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

	public ArrayList<String> getData(String testCaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("D:\\xls\\demodata.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		// get and grab all sheets
		int sheets = book.getNumberOfSheets();
		System.out.println("Number of sheets" + sheets);

		for (int i = 0; i < sheets; i++) {
			// comparing with each sheet with if condition to get first sheet access named
			// testdata
			if (book.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = book.getSheetAt(i);
//				System.out.println("FirstSheet" + sheet);

				// To get the first cell of First Row
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
//				System.out.println("FirstRow" + firstRow);

				// To get the first cell of First Column
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell cellValue = ce.next();
					if (cellValue.getStringCellValue().equalsIgnoreCase("Page")) {
						// Code
						column = k;
						System.out.println(" FirstCellValue " + cellValue);
					}
					k++;
				}
				System.out.println("Column Index" + column);

				// New Concept
				while (rows.hasNext()) {

					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
//							System.out.println(cv.next().getStringCellValue());
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
//								a.add(c.getNumericCellValue());
							}
						}
					}
				}

			}

		}

		return a;
	}
}
