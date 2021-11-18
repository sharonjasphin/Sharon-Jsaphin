package generic_library;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Sharon Jasphin
 *
 */
public class File_utils {
	/**
	 * 
	 * @param sheetname this method is used to enter the sheet name of the ExcelSheet 
	 * @param rowno this method is used to get  the the rowno of the ExcelSheet
	 * @param cellno this method is used to get the cellno  of the ExcelSheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException   
	 */

	public static String readStringFromExcel(String Sheetname,int Rownum,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/Sheet.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		String data = workbook.getSheet(Sheetname).getRow(Rownum).getCell(cell).getStringCellValue();
		return data;
	}

	/**
	 * 
	 * @param sheetname this method is used to enter the sheet name of the ExcelSheet 
	 * @param rowno this method is used to get  the the rowno of the ExcelSheet
	 * @param cellno this method is used to get the cellno  of the ExcelSheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException   
	 */

	public static Date readdateFromExcel1(String Sheetname,int Rownum,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/Sheet.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		Date data2 = workbook.getSheet(Sheetname).getRow(Rownum).getCell(cell).getDateCellValue();
		return data2;
	}	

	/**
	 * 
	 * @param sheetname this method is used to enter the sheet name of the ExcelSheet 
	 * @param rowno this method is used to get  the the rowno of the ExcelSheet
	 * @param cellno this method is used to get the cellno  of the ExcelSheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException   
	 */

	public static double readnumericvalueFromExcel1(String Sheetname,int Rownum,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/Sheet.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		double data3 = workbook.getSheet(Sheetname).getRow(Rownum).getCell(cell).getNumericCellValue();
		return data3;
	}

	/**
	 * 
	 * @param sheetname this method is used to enter the sheet name of the ExcelSheet 
	 * @param rowno this method is used to get  the the rowno of the ExcelSheet
	 * @param cellno this method is used to get the cellno  of the ExcelSheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException   
	 */

	public static boolean readdateFromBoolean(String Sheetname,int Rownum,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/Sheet.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		boolean data4 = workbook.getSheet(Sheetname).getRow(Rownum).getCell(cell).getBooleanCellValue();
		return data4;
	}
}



