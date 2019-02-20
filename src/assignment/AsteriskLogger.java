package assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		String Str = new String();
		System.out.println("***" + Str.toString() + "***");
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			log.append("*");
		}
		
		
		
		
	}

	@Override
	public void Error(String Error) {
		String Str = new String();
		System.err.println("***" + Str.toString() + "***");
		StringBuilder error = new StringBuilder(); {
			for (int i = 0; i < error.length(); i++) {
					error.append("*");
			}
		}
	}
}
		
	
	
	
	
	

	
		

	


