package assignment;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ages = new int [9];
		ages [0] = 3;
		ages [1] = 9;
		ages [2] = 23;
		ages [3] = 64;
		ages [4] = 2;
		ages [5] = 8;
		ages [6] = 28;
		ages [7] = 93;
		ages [8] = 24;
		
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println(difference);
		System.out.println(average(ages));
		System.out.println(ages [ages.length - 1]);
		System.out.println(ages [ages.length - 9]);
		System.out.println(addition(ages));
		
		String [] names = new String [6];
		names [0] = "Sam";
		names [1] = "Tommy";
		names [2] = "Tim";
		names [3] = "Sally";
		names [4] = "Buck";
		names [5] = "Bob";
		String concatenatedNames = concatenatedArray(names [0], names [1], names [2], names [3], names [4], names [5]);
		System.out.println(average(names));
		System.out.println(concatenatedNames);
		System.out.println(names[names.length - 1]);
		System.out.println(names[names.length - 6]);
		
		int [] nameLengths = new int [6];
		nameLengths [0] = 3;
		nameLengths [1] = 5;
		nameLengths [2] = 3;
		nameLengths [3] = 5;
		nameLengths [4] = 4;
		nameLengths [5] = 3;
		System.out.println(total(nameLengths));
		
		System.out.println(arguments("Hello", 3));
		
		String firstName = "Abraham";
		String lastName = "Lincoln";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		  boolean i =isHotOutside && moneyInPocket > 10.50;
		return true;
				
			
	} 
	
	
	public static double median(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		} double median = sum;
			return median;	
	}
	
	public static boolean compareAverages(double[] a, double[] b) {
		double sumA = 0;
		double sumB = 0;
		for (double number : a) {
			sumA += number;
		} double A = sumA / a.length;
		for (double number : b) {
			sumB += number;
		} double B = sumB  / b.length;
		if (A > B) {
			return true;
		} else { 
			return false;
		} 
		
	}
	public static boolean addition(int[] tally) {
		int sum = 0;
		for (int tallies : tally) {
			sum += tallies;
		}
		if (sum >= 100) {
			return true;
		} else {
			return false;
		}
		
	}	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	
	public static String arguments(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i ++) {
			result += word;
		}	return result;
		
		
	}
	public static int total(int[] lengths) {
		int sum = 0;
		for (int length : lengths) {
			sum += length;
		}	
			int total = sum;			
		 	return total;
	}
	
	
	// This method was created to concatenate an array of String instead of having a longer sysout print line.
	public static String concatenatedArray(String names, String b, String c, String d, String e, String f) {
		return names + " " + b + " " + c + " " + d + " " + e + " " + f;
	}
		

	public static double average(int[] numbers) {
				double sum = 0;
				for (int number : numbers) {
					sum += number;
				}
				
				double average = sum / numbers.length;
				return average;
		
	}
	public static double average(String[] strings) {
			double sum = 0;
			for (String s : strings) {
			 sum += s.length();
			}
						
			double average = sum / strings.length;
			return average;
				
	}	
}
