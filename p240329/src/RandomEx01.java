
public class RandomEx01 {

	public static void main(String[] args) {

		/*
		 * [랜덤값] ==============================
		 *  문법 : Math.random() 
		 *  0<= 랜덤값 < 1
		 *  0 이상 1미만의 랜덤값
		 *  랜덤값 식을 변수에 넣어놓고 사용
		 *  ======================================
		 * 
		 */
		// 랜덤값 1~3을 구하고 싶을 때
//		System.out.println((int)(Math.random() * 3) + 1); // 정수부분이 3부터는 안 나온다.
		// +1은 0이 안나오게 하기 위함
		
		// 랜덤값 : 1~45
		int random = (int)(Math.random() * 45) + 1;
		System.out.println(random);
				
//		System.out.println((int)(Math.random() * 45) + 1);
		
		int randomValue = (int)(Math.random()*3)+1;
		System.out.println(randomValue);
		
		
		
		
	}

}
