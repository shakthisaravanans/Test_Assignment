package FactoryDesignAss1;

import java.util.logging.Logger;

public class DBInputData implements TestDataProvide{

	private static final Logger log = Logger.getLogger(DBInputData.class.getName());
	
	@Override
	public boolean TestDataSource() {
		log.info("Test data from DB");
		//System.out.println("DB");
		return true;
		
	}
	
	

}
