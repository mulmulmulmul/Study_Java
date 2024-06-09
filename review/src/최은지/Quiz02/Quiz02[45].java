/*
 * [최은지]===============================================
 *
 * 랜덤값의 정수 비교가 불가능 합니다.
 * > int random = (int)(Math.random()*10+1);
 * 
 * 입력한 값과 랜덤값을 비교하는 조건식 및 출력문이 작성되어야 합니다.
 *
 *======================================================
 */
public class Quiz02 {

	public static void main(String[] args) {

		int random = 0;
		int count = 0;
		
		while(true) {
			
			count++;   
			random = (int)(Math.random() * 10) + 1;
			
			System.out.println(random + " ");
			
			if(count == random) 
				break;
		}
				
			
	}

}
