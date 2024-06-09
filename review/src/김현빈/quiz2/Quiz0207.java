package quiz2;

public class Quiz0207 {
	/*
	 * [김현빈] ===================================
	 * 스캐너를 사용해 이용자 값 받아야해요
	 * 반복문을 사용해 컴퓨터의 랜덤값과 비교 할 수 있어요
	 * 증감연산자를 사용해서 반복횟수 저장 가능해요
	 */
	public static void main(String[] args) {
		
//		[메서드 정의]
//		컴퓨터가 생성한 1~10 사이의 랜덤값을 맞춘다.
//      마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는 지(횟수) 출력한다. 
		
//		[2-1] 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하기
//      문법 : Math.random()
//      1 <= 랜덤값 <= 10 (1이상 10이하의 랜덤값)
//      랜덤값 : 1 ~ 10		
	    int random = ((int)(Math.random()*10)+1);
	    System.out.println("1~10 랜덤값 : " + random);
	    
//      [2-2, 3, 4] 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오.
	    
	    int num1 = 8;
	    System.out.println("컴퓨터의 숫자가 더 작습니다."); 
	    
	    int num2 = 1;
	    System.out.println("컴퓨터의 숫자가 더 큽니다.");
	    
	    int num3 = 5;
	    System.out.println("컴퓨터의 숫자가 더 작습니다.");
	    
	    int num4 = 3;
	    System.out.println("4번 만에 정답입니다.");
			
		
	}

}
