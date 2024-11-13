package FactoryDesignAss1;

import java.util.logging.Logger;

public class APIInputData implements TestDataProvide{

	private static final Logger log = Logger.getLogger(APIInputData.class.getName());
	
	@Override
	public boolean TestDataSource() {
		log.info("Test data from API");
		//System.out.println("API");
		return true;
		
	}
	
	

}
