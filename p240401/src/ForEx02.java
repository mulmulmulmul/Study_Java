
public class ForEx02 {

	public static void main(String[] args) {

		int idx = 1;
		
		for(;;) { //for문의 무한루프
			System.out.println(idx);
			
			if(idx == 2)
				break;
			
			idx++;
		}

		// cf) while문의 무한루프
//		while(true) {
//			명령어;
//		}
	
		System.out.println("반복문 실행 후 idx >> " + idx);
		
	}

}
