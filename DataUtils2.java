package Utils;

import org.testng.annotations.DataProvider;

import Utility.ReadExcel3;

public class DataUtils2 {


	// We can remove the name and use the getData in dataprovider
	
	@DataProvider(name = "logintestdata" /*indices = { 0, 2 } ,parallel=true*/  )
	public String[][] getData() {
	String[][] excelData = ReadExcel3.getExcelData();
	return excelData ;
	}

}

