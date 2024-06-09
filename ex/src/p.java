
class Parent {
	int money = 1000000;
	
	void work() {
		System.out.println("[Parent] 일하는 중");
	}
	
	void spend(int money) {
		this.money -= money;
		System.out.println("[Parnet] " + this.money + "원 남았어요");
	}
}

class Son extends Parent {
	void study() {
		System.out.println("[Son] 공부하는 중");
	}
	
	@Override
	void spend(int money) {
		System.out.println("[Son] 학원비 " + money + "원 주세요");
	}
}

class Daughter extends Parent {
	void play() {
		System.out.println("[Daughter] 노는 중");
	}
	
	@Override
	void spend(int money) {
		System.out.println("[Daughter] 용돈 " + money + "원 주세요");
	}
}
public class p {
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Parent son = new Son();
		Parent daughter = new Daughter();
		
		son.spend(10000);
		daughter.spend(10000);
		
		((Son)son).study();
		((Daughter)daughter).play();
		
		
		
	}

}
