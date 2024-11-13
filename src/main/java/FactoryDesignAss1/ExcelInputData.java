package FactoryDesignAss1;

import java.util.logging.Logger;

public class ExcelInputData implements TestDataProvide{

	private static final Logger log = Logger.getLogger(ExcelInputData.class.getName());
	
	@Override
	public boolean TestDataSource() {
		log.info("Test data from Excel");
		//System.out.println("API");
		return true;
		
	}
	
	

}
