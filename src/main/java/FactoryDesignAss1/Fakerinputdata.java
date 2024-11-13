package FactoryDesignAss1;

import java.util.logging.Logger;

public class Fakerinputdata implements TestDataProvide{

	private static final Logger log = Logger.getLogger(Fakerinputdata.class.getName());
	
	@Override
	public boolean TestDataSource() {
		log.info("Test data from Faker");
		//System.out.println("API");
		return true;
		
	}
	
	

}
