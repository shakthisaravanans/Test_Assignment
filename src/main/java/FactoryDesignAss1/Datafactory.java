package FactoryDesignAss1;

public class Datafactory {

	public static TestDataProvide SwitchDataprovider(InputSouce datatype) {
		switch(datatype) {
		case DB:
			 return new DBInputData();
		case API:
			return new APIInputData();
		case Faker:
			return new Fakerinputdata();
		case Hardcode:
			return new HardCodeInputData();
		case Excel:
			return new ExcelInputData();
			default :
				throw new IllegalArgumentException("unknow input type");
				
		}
			
	}

}
