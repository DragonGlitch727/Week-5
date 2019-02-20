package assignment;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 100){
			i = i + 2;
			if (i % 2 == 0); {
				System.out.println("even number" + i); 
			} 
		}				
		int a = 100;
		while (a-- >= 0) {
			if (a % 3 == 0) {
				System.out.println("every third number" + a);
				 
			}
		}
		for (int b = 1; b < 100; b ++) {
		if (b % 2 == 1); {
			System.out.println("every other number:" + b);
			}
		}for (int c = 0; c < 100; c ++) {
			if (c % 3 == 0) {
				System.out.println("Hello");
			} else if (c % 5 == 0) {							
				System.out.println("World");
			} else if (c % 3 == 0 && c % 5 == 0) {
				System.out.println("Hello World");
				
			}
		}
			} 
		}
	

	
