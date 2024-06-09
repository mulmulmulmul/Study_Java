package polymorphism;

class ProductTwo {
	 int price;
	 int bonusPoint;
	
	ProductTwo(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	// 게터
	
	
}

class TvTwo extends ProductTwo {
	TvTwo() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class ComputerTwo extends ProductTwo {
	ComputerTwo() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class BuyerTwo {
	 int money = 1000;
	 int bonusPoint = 0;
	
	// 게터 
	void buy(ProductTwo p) {
		if(money < p.price) { // 게터로 접근
		System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		return;
		}
	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p + "을/를 구입하셨습니다.");
	}
}


public class Ex04 { 

	public static void main(String[] args) {
		BuyerTwo b = new BuyerTwo();
		
		// 메소드 인수로 인스턴스 생성을 넣어줌. 메소드 끝나면 소멸되어 정보가 남아있지 않음
		b.buy(new TvTwo()); 
		b.buy(new ComputerTwo());
		
		System.out.println("현재 남은 돈은 " + b.money + "만 원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
	}

}
