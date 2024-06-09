package array;

public class arraycopy {

	public static void main(String[] args) {

		int[] oldArray = {1,2,3};
		int[] newArray = new int[4];
		
		for(int i=0;i<3;i++) { // oldArray 배열의 인덱스 범위만큼 증가
			newArray[i]=oldArray[i];
		}
		
		newArray[3] = 4;
		
		for(int news: newArray) {
			System.out.print(news + ", ");
		}
		
		System.out.println();
		
		String[] oldNames = {"홍길동", "박혜나", "박대윤"};
		String[] newNames = new String[6];
		
		for(int i=0;i<3;i++) {
			newNames[i] = oldNames[i];
		}
		
		newNames[3] = "허밍";
//		newNames[4] = "임영진"; //주석처리시 참조타입 기본값 null
		newNames[5] = "김남주";
//		newNames[6] = "박석고개"; // 인덱스길이 초과 시 실행오류
		
		for(String names: newNames) {
			System.out.print(names + ", ");
		}
	}

}
