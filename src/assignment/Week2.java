package assignment;

public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		System.out.println(isHotOutside);
		System.out.println(isWeekday);
		System.out.println(hasMoneyInPocket);
		
		double costOfMilk = 2.99;
		double moneyInWallet = 20.25;
		int thirstLevel = 6;
		System.out.println(costOfMilk);
		System.out.println(moneyInWallet);
		System.out.println(thirstLevel);
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk * 2);
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
		
			
				
		
		
		
	}

}
