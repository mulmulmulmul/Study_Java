///*
// * [IS-A 관계]
// * : ~는 ~이다.
// * : ex1) 학생은 사람이다. (o) 사람은 학생이 일반화된 개념
// * : ex2) 사람은 학생이다. (x) 
// * : 상속 관계에서 부모는 일반적이어야 한다. 상세화/구체화되면 안 된다.
// * : 자식은 부모 멤버를 상속받고 부족한 걸 더 추가해서 구체화한다.
// * 
// * [HAS-A 관계] 소유관계, 포함관계
// * : ~가(는) ~를 소유(포함)하고 있다.
// * : ex1) 폰은 카메라를 포함하고 있다. (o)
// * : ex2) 카메라가 폰을 포함하고 있다. (x)
// * : 폰이 자식, 카메라가 부모
// * : 상속으로 나타낼 때 거의 부모와 자식이 뒤집히므로 유의해야 함
// * : 굳이 상속으로 나타내지 않아도 효과를 줄 수 있는 형태가 있다.
// * 
// */

import p.Police;

public class InheritanceEx05 {
	public static void main(String[] args) {
		
		Police pman = new Police(5, 3); // 총이 있는 경찰 생성
		pman.shoot();
		pman.putHandcuff();
		
		// 내부 클래스 접근
		System.out.println("총알의 개수 : " + pman.pistol.bullet);
		System.out.println("수갑의 개수 : " + pman.handcuffs);
		
	}
}
