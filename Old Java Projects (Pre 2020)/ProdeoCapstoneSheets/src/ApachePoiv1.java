import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// import org.apache.poi.hssf.usermodel.HSSFSheet;
// import org.apache.poi.hssf.usermodel.HSSFWorkbook; // for excell before 2007
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet; // for excel after 2007 xlsx
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiv1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(new File("ImprovedCapstoneRequirements.xlsx"));

		// make instance that references the excel file
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// create a object to retrieve the sheet
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//wb.getSheetAt(0).getRow(1).getCell(1);


		// evaulates the type of cell
		FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
		for(Row row : sheet) 
		{
			for(Cell cell : row) 
			{
				switch(formulaEvaluator.evaluateInCell(cell).getCellType())
					{
					// if the case is in numeric forM or a string
					case Cell.CELL_TYPE_NUMERIC: // is outdated but works.
						System.out.print(cell.getNumericCellValue()+"\t\t");
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+"\t\t");
					}
			}
		}
	}

}
