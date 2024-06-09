package p;

import gun.Gun;

public class Police {
		// instance field - heap
		public int handcuffs;
		public Gun pistol; // field에 참조 변수 왔다면 객체 안에서 다른 객체를 관리하게 된다.
		
		// constructor 
		public Police(int bnum, int bcuff) {
			handcuffs=bcuff;
			if(bnum!=0)
				pistol = new Gun(bnum); // Gun 클래스 객체 생성 후 참조변수 pistol에 저장 = 총 있음
			else
				pistol=null; // 참조 x = 총 없음
		}
		public void putHandcuff() {
			System.out.println("SNAP!");
			handcuffs--;
		}
		public void shoot() {
			if(pistol==null)
				System.out.println("Hut BBANG!");
			else
				pistol.shoot();
	}
}
