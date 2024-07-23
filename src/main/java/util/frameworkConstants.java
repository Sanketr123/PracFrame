package util;

public final class  frameworkConstants {
	
	private frameworkConstants(){
		
		//so that this calss is not extended and cannot create object of this class.
		
	}
	
	
	private static final String QAURL = "https://www.saucedemo.com/v1/index.html";
	
	//private so getter method used

	public static String getQaurl() {
		return QAURL;
	}

}
