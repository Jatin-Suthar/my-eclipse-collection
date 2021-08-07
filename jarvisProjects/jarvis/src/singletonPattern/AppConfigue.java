package singletonPattern;

public class AppConfigue {

	private AppConfigue() {
			
	}
	
	private static AppConfigue obj = null;
	
	public static AppConfigue getInstance() {
		
		if(obj == null) {
			
			obj = new AppConfigue();
			
		}
		
		return obj;
		
	}

}
