package singleton;
/*
 * [객체 생성 불가능] =============
 * 
 * - abstract class : 추상 클래스
 * 
 * - interface : 인터페이스 
 * 
 * - private 생성자  
 * 
 */


class Cat {

	private Cat() {
		System.out.println("나는 고양이다!");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

//		Cat cat = new Cat(); 
		
	}

}
