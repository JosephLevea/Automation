package Utils;

import org.testng.annotations.DataProvider;

public class DataUtils {


	// We can remove the name and use the getData in dataprovider
	
	@DataProvider(name = "logintestdata" , indices = { 0, 2 } ,parallel=true   )
	public String[][] getLoginData() {
	String[][] data = new String[3][2];
		// row 1
	data[0][0] = "koushik350@gmail.com";
	data[0][1] = "Pass123$";
	
	data[1][0] = "koushik1@letcode.in";
	data[1][1] = "Pass123$";	
	
	data[2][0] = "last data";
	data[2][1] = "Pass123$";

		return data  ;
	}

}

