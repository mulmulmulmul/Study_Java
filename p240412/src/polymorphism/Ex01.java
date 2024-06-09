/*
 * [ 다형성 ] : Polymorphism =============================================
 * 타입이 달라서 다형성 x
 * "상속 관계에서" 부모 type의 참조변수로 자식 type의 객체를 가리킴(접근)
 * 부모의 멤버만 접근 가능 - 오버라이딩된 자식의 메소드는 접근 가능 
 * 자식 class는 형제관계, 부모는 알지만 서로를 모름
 * 
 * << 문법 >>
 * 부모class 참조변수 = new 자식class();
 * 
 * << class Casting >> 다형성일 때, 일어나는 형변환
 * 	명시적(강제) downCasting
 *		------>
 * super		sub
 * 		<------
 * 	묵시적(자동) upCasting
 * =======================================================================
 */

package polymorphism;

class Parent {
	private int money = 1000000;
	
	public void spend (int money) {
		this.money -= money;
		System.out.println("[Parent] 남은 돈은 " + this.money + "입니다.");
	}
	
	public void work() {
		System.out.println("[Parent] 열심히 일하는 중입니다!");
	}
	
//	abstract void status();
	
}

class Son extends Parent {
	public void play() {
		System.out.println("[Son] 신나게 놀고 있어요!");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("[Son] 용돈 " + money + "원 주세요~");
	}
}

class Daughter extends Parent {
	public void study() {
		System.out.println("[Daughter] 학원 공부하고 있어요~");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("[Daughter] 학원비 " + money + "원 주세요~");
	}
}

public class Ex01 {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.spend(100000);
//		
//		Son s = new Son();
//		s.spend(200000);
//		
//		Daughter d = new Daughter();
//		d.spend(300000);
//		
//		System.out.println("\n<< 다형성 >>");
//		Parent p1 = new Son();
//		p1.work();
//		p1.spend(100); //오버라이딩된 메소드의 주소가 부모 객체의 table(오버라이딩된 메소드의 정보 저장)에 저장된다. 
//		p1.play();			   //주소는 자식의 메소드를 가리킨다. 그래서 son의 메소드가 실행
		
//		p1.play(); //오버라이딩 안 된 자식 메소드
		
//		Parent p2 = new Daughter();
//		p2.work();
//		p2.spend(200); // 자식 객체의 오버라이딩된 멤버메소드
//		p2.study();
		
//		System.out.println("\n<< 다형성 : 객체 배열 >>");
		Parent[] p3 = new Parent[] {new Son(), new Daughter()};//객체 배열 생성과 동시에 초기화 (배열의 요소에서 다형성 구현)
		// 배열의 타입은 parent. 실제 저장된 요소의 타입은 자식들이지만 참조변수로 인해 부모를 찾아간다 
		//참조변수 p3로 아들과 딸의 spend() 실행
//		p3[0].spend(1000000);
//		p3[1].spend(300000);
		
		//[향상된 for문]========================
//		for(Parent parent: p3) {
////			parent.work();
//			parent.spend(300); 
//		}
		
		System.out.println("\n[향상된 for문으로 메소드 호출]-----------------------");
		// 다형성으로 구현된 객체배열의 메소드를 호출하시오.
		// : Son 객체는 play() 메소드를
		// : Daughter 객체는 study() 메소드를 호출하시오.
		
//		풀이 1. instanceof로 참조변수의 타입 확인 후 메소드 출력  
		for(Parent childs: p3) {
			if (childs instanceof Son) {
				((Son) childs).play();
			}
			else if (childs instanceof Daughter) {
				((Daughter) childs).study();
			}
		}
		
		
//		풀이 2. 부모에 status() 메소드 추가, 자식 메소드명을 전부 status로 변경시켜서 오버라이딩되게 한 후 출력
//		for(Parent parents: p3) {
//			parents.status();
//		}
//		System.out.println("-----------------------------------------------------");
		
		//Son s1 = new Parent(); // Error! - 타입 미스매치
//		Son s2 = (Son)new Parent();
//		s2.spend(500); // 컴파일은 되지만 실행 에러. 부모는 자식의 정보를 모른다.
//		s2.play();
//		System.out.println("\n<< 형변환 >>");
//		Son s3 = (Son)p1; //downCasting - 강제 형변환. Son 인스턴스에 접근 -> son, parent 멤버에 모두 접근 가능
//		s3.play();
//		s3.work(); // 자식은 부모 멤버 사용 가능
////		
//		Parent p4 = s3; //upCasting - 자동 형변환 (자식은 부모의 정보를 안다)
//		p4.spend(50); // 오버라이딩된 자식 멤버 사용 가능
//		p4.work(); // 부모 멤버
		
		// 형변환 가능 여부
		// [문법] 참조변수 or 객체 instanceof 타입 
		// 다른 타입일 경우 상속이어야 가능
//		System.out.println(p instanceof Parent); // true
//		System.out.println(p instanceof Son); // false (class casting-downcasting은 다형성일 때 강제 형변환)
//		System.out.println(p instanceof Daughter); // false (class casting-downcasting은 다형성일 때 강제 형변환)
//		System.out.println(p instanceof Object); // true Object가 최상위 부모
//		System.out.println(s instanceof Parent); // true upcasting
//		System.out.println(s instanceof Son); // true
////		System.out.println(s instanceof Daughter); // 형제관계. 관련이 전혀 없다
//		System.out.println(s instanceof Object); // true
		
	}
}

