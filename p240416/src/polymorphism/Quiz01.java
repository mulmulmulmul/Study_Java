package polymorphism;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	int count = 0; // 변수명 idx로 보완
//	int priceAll = 0;
	Product[] products = new Product[10]; // 고객이 구입한 물건 소유
	
	void buy(Product p) { // 매개변수 다형성 구현
		if(money < p.price) { 
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		products[count++] = p; //후증가이므로 배열에 대입하고 해당 라인을 지나면, 증가
//		this.count++; 

//		this.priceAll += p.price;
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
			
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() { //구매정보 출력
		// 총금액 출력
		int sum = 0;
		String buylist = ""; //빈문자열
		
		// [일반 for문] ===============================================
//		for(int i=0;i<count;i++) {
//			if(products[i] == null) {
//				break;
//			}
//			sum += products[i].price;
//			buylist += products[i].toString() + ", ";
//		}
		
		// [향상된 for문] ===============================================
		for(Product product: products) {
			if(product == null) {
				break; 				//  [null 처리 코드]
			}
			sum += product.getPrice();
			buylist += product + ", ";
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.print("구입하신 제품은 " + buylist + "입니다.");
		
//		System.out.println("구입하신 물품의 총금액은 " + priceAll + "만원입니다.");
		// 제품명 출력
		
//		for(Product product: products) {
//			if(product != null) 
//				buylist += (product + ", "); 
//		}
	}
}

public class Quiz01 { 

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());  
		b.buy(new Tv()); 
		b.buy(new Tv()); 
		b.summary();
//		System.out.println("현재 남은 돈은 " + b.money + "만 원입니다.");
//		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
	}

}
