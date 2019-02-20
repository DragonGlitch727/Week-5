package assignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.Log("Hello");
		logger.Error("ERROR : Hello");
		
	}
}
