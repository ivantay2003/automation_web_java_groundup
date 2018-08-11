package automation_web;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



@SuppressWarnings("deprecation")
public class ExcelSimpleTest {
	
		//HashMap<String,String> hm=new HashMap<String,String>();  
		

		
 	
 		
 		@SuppressWarnings("resource")
		public HashMap <String, String> readUserData (String filename) throws IOException{
 			
 			HashMap<String,String> hashmap_UserData =new HashMap<String,String>();  
 	        InputStream ExcelFileToRead;

			ExcelFileToRead = new FileInputStream(filename);
	        XSSFWorkbook wb;

			wb = new XSSFWorkbook(ExcelFileToRead);
			
	        XSSFSheet sheet = wb.getSheetAt(0);

	        

	        
	        for (int i =1 ;i <= 13; i++){
	        	
	        	String strCellReference = "A" + String.valueOf(i);
		        CellReference cellReference = new CellReference(strCellReference); 
		        Row row1 = sheet.getRow(cellReference.getRow());
		        Cell cell1 = row1.getCell(cellReference.getCol()); 

		        
		        switch (strCellReference) {
		        
		        case "A1" :
		        	
		        	
		        	hashmap_UserData.put("Email", cell1.getStringCellValue());
		        	break;
		        	
		        case "A2" :
		        	
		        	
		        	hashmap_UserData.put("Gender", cell1.getStringCellValue());
		        	//hashmap_UserData.put("Gender", String.valueOf(cell1.getNumericCellValue()));
		        	break;
		        	
		        case "A3" :
		        	
		        	
		        	hashmap_UserData.put("FirstName", cell1.getStringCellValue());
		        	break;

		        
		        case "A4":
		        	
		        	hashmap_UserData.put("LastName", cell1.getStringCellValue());
		        	break;
		        	
		        case "A5" :
		        	
		        	
		        	hashmap_UserData.put("Password", cell1.getStringCellValue());
		        	break;
		        	
		        case "A6" :
		        	
		        	//hashmap_UserData.put("Day", String.valueOf(cell1.getNumericCellValue()));
		        	hashmap_UserData.put("Day", cell1.getStringCellValue());
		        	break;
		        	
		        case "A7" :
		        	
		        	//hashmap_UserData.put("Month", String.valueOf(cell1.getNumericCellValue()));
		        	hashmap_UserData.put("Month", cell1.getStringCellValue());
		        	break;
		        	
		        case "A8" :
		        	
		        	//hashmap_UserData.put("Year", String.valueOf(cell1.getNumericCellValue()));
		        	hashmap_UserData.put("Year", cell1.getStringCellValue());
		        	break;
		        	
		        	
		        case "A9":
		        	
		        	hashmap_UserData.put("Company", cell1.getStringCellValue());
		        	break;
		        	
		        case "A10":
		        	
		        	hashmap_UserData.put("Address1", cell1.getStringCellValue());
		        	break;
		        	
		        case "A11":
		        	
		        	hashmap_UserData.put("Address2", cell1.getStringCellValue());
		        	break;
		        	
		        case "A12":
		        	
		        	hashmap_UserData.put("City", cell1.getStringCellValue());
		        	break;
		        	
		        case "A13":
		        	
		        	hashmap_UserData.put("State", cell1.getStringCellValue());
		        	break;
		        	
		        case "A14":
		        	
		        	hashmap_UserData.put("Zip", cell1.getStringCellValue());

		        	break;
		        	
		       
		        case "A15":
		        	
		        	hashmap_UserData.put("Country", cell1.getStringCellValue());
		        	
		        	break;
		        
		        case "A16":
		        	
		        	hashmap_UserData.put("Additional", cell1.getStringCellValue());
		        	break;
		        
		        case "A17":
		        	
		        	hashmap_UserData.put("HomePhone", cell1.getStringCellValue());

		        	break;
		        
		        case "A18":
		        	
		        	hashmap_UserData.put("MobilePhone", cell1.getStringCellValue());
		        	break;
		        
		        case "A19":
		    
		        	hashmap_UserData.put("Alias", cell1.getStringCellValue());
		        	break;
		        
		         
		        }
		        
		        
	        }
	        
//	        System.out.println("FirstName : " + hashmap_UserData.get("FirstName"));
//	        System.out.println("Zip : " + hashmap_UserData.get("Zip"));
//	        for ( String key : hashmap_UserData.keySet() ) {
//	            System.out.println( key );
//	        }
//	        
	        return hashmap_UserData;
	        
 		}
 
}
