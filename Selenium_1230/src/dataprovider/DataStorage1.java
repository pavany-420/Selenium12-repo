package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage1 {
	@DataProvider
	public String[][] register()
	{
		String[][] data= {{"virat","kohli","kaka123@gmail.com","kak@123","kak@123"},{"Dhoni","7","dhoni07@gmail.com","dad@123","dad@123"},{"Rohit","Sharma","vadapav123@gmail.com","vada@123","vada@123"},{"Srh","Hydrabadi","Pichinakodukulu@gmail.com","kaybolthe@123","kaybolthe@123"}};
		return data;
	}
}
