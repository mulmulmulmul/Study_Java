
public class MarketDiscount {
	
	public static int discount(int price) {
		double discount = 0.0;
		
		if (price >= 500000) {
			discount = price * 0.2;
		} else if (price >= 300000) {
			discount = price * 0.1;
		} else if (price >= 100000) {
			discount = price * 0.05;
		}
		
		return price - (int)discount;
	}
	
	public static void main(String[] args) {
		int peopleOne = 150000;
		int peopleTwo = 580000;
		int peopleThree = 250000;
		int peopleFour = 500000;
		int peopleFive = 95000;
		
		System.out.printf("지불할 가격 >> %d원\n", discount(peopleOne));
		System.out.printf("지불할 가격 >> %d원\n", discount(peopleTwo));
		System.out.printf("지불할 가격 >> %d원\n", discount(peopleThree));
		System.out.printf("지불할 가격 >> %d원\n", discount(peopleFour));
		System.out.printf("지불할 가격 >> %d원\n", discount(peopleFive));
	}

}
