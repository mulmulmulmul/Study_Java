/*
 * [조유연]
 * 1. 사용자의 입력을 받는 부분이 작성되지 않았습니다.
 * 2. 사용자의 입력값 범위에 따라 다시 입력을 받거나 받지 않아야합니다.
 * 3. 랜덤값과 입력값을 비교하는 코드가 없습니다.
 */
public class Quiz02 {

	public static void main(String[] args) {
		
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
