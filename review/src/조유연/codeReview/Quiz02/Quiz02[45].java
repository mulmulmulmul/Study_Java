/*
 * [조유연]
 * while문이 실행될 때마다 다른 값이 random에 저장되므로, 
 * 사용자는 매번 다른 random값을 맞춰야하는 문제에 직면하게 됩니다.
 * 이 부분을 해결하셔야할 것으로 보입니다.
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
