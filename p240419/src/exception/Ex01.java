package exception;

public class Ex01 {

	public static void main(String[] args) {
		
		// sleep() 프로그램 실행 중 멈춤
//		Thread.sleep(1000); // 예외를 전가하는 메소드
		
		for(int i=1; i<11; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
