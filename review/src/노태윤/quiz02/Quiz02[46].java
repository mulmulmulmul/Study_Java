// 노태윤
// =================
// =================
public class Quiz02 {

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
	    
	    //스캐너를받지않고있어서 스캐너를받아야함 그리고 2가지 변수를 선언해줘야한다.
	    // 하나는 반복횟수에쓸 변수. 하나는 우리가 넣을값 스캐너에.
	    // 반복문안에 초기화하는것보다 밖에서 초기화하는게 나으므로 
	    // int idx = 0; (반복횟수) int userValue = 0 ; (컴퓨터와비교할값) 
	    
	    
//      [2-2, 3, 4] 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오.
	    
	    // 반복문을 써줘야한다 . while문을쓰는게 좋고 while(true)로 시작하는게좋다
	    // while문안에 반복횟수가 증가해야하며 idx++; userValue를 random값이랑 비교해줘야한다.
	    
	    
	    int num1 = 8;
	    System.out.println("컴퓨터의 숫자가 더 작습니다."); 
	    
	    int num2 = 1;
	    System.out.println("컴퓨터의 숫자가 더 큽니다.");
	    
	    int num3 = 5;
	    System.out.println("컴퓨터의 숫자가 더 작습니다.");
	    
	    int num4 = 3;
	    System.out.println("4번 만에 정답입니다.");
			
		
	}
		//스캐너 닫기 스캐너생산하면
}
