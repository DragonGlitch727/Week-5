package assignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		String str1 = new String();
		System.out.println(str1.toString());
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(" ");
		}
		
	}

	@Override
	public void Error(String Error) {
		String str1 = new String();
		System.out.println(str1.toString());
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(" ");
		}
		
		
	}
	

	

	

}
