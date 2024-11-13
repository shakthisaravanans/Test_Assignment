package FactoryDesignAss1;

import java.util.logging.Logger;

public class HardCodeInputData implements TestDataProvide{

	private static final Logger log = Logger.getLogger(HardCodeInputData.class.getName());
	
	@Override
	public boolean TestDataSource() {
		log.info("Test data from Hardcode");
		//System.out.println("API");
		return true;
		
	}
	
	

}
