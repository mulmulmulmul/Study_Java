
public class ForEx01 {

	public static void main(String[] args) {

		//[while문]
//		int idx = 1; // 초기값
//		
//		while(idx < 3) { // 조건식
//			System.out.println("idx >> " + idx);
//			idx++; // 증감식
//		}


		
/*
 * [반복문] for문
 * 
 * for(초기값; 조건식; 증감식) {
 * 		명령어;
 * 		명령어;
 * }
 * 
 * 한 라인에 다 들어와서 코드 파악이 편리하다.
 * 
 */
		
		for(int idx=1; idx<3; idx++) {
			System.out.println("idx >> " + idx);
		} // for문이 실행 다 되면 idx는 지역변수라서 사라진다.
		
//		 System.out.println("반복문 실행 후 idx >> " + idx);
		
	}

}
