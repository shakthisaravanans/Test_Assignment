package FactoryDesignAss1;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datafactory.SwitchDataprovider(InputSouce.API).TestDataSource();
		Datafactory.SwitchDataprovider(InputSouce.Excel).TestDataSource();
		Datafactory.SwitchDataprovider(InputSouce.DB).TestDataSource();
		Datafactory.SwitchDataprovider(InputSouce.Hardcode).TestDataSource();
		Datafactory.SwitchDataprovider(InputSouce.Faker).TestDataSource();
	}

}
