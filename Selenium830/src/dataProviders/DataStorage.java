package dataProviders;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] loginData()
	{
		String data[][] = { { "admin", "admin" }, { "admi", "admin" }, { "adamin", "gandad" }, { "ad", "ad" } };
		return data;
	}

}
