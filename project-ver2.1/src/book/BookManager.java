package book;
import java.util.Scanner;


public class BookManager {

	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT]; // 배열변수 선언, 초기화
	private int index;
	public static Scanner input = new Scanner(System.in);
	
	// BookManager에서만 사용할 용도이므로 접근제어자는 private
	// 외부에 드러낼 이유가 전혀 없다
	private int search(String name) {
		for(int i=0; i<index;i++) {
			if(infoStorage[i].getName().equals(name)) {
				return i; // 배열에 같은 이름 있을 때 : 반복문 안에서 인덱스 리턴	
			}
		}
		return -1; // 없을 때 : 메소드 영역에서 리턴
		// 리턴값 -1인 이유 >> 인덱스는 0 이상
	}
	
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		int searchIndex = search(name); // 이 라인 이후에도 사용할 거면, 값을 변수에 저장
		
		if(searchIndex != -1) {
			System.out.println("이미 저장된 이름입니다.\n");
			return;
		}
		// 중복X x --> 배열 저장, 입력 완료
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요... ");
		String name = input.next();
		
		int searchIndex = search(name); 
		
//		if(searchIndex != -1) {
//			infoStorage[searchIndex].showAnimalInfo();
//			return;
//		}
//		System.out.println("해당 데이터는 없습니다.\n");
		
		if(searchIndex == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return; // 데이터 없으면 실행 종료
		}  // 데이터 없음 블록에 return으로 조기종결 해줘야만 else 생략 가능
		infoStorage[searchIndex].showAnimalInfo();
	}		

	public void updateData() {
		System.out.print("수정할 이름을 입력하세요... ");
		String name = input.next();
		
		int searchIndex = search(name); 
	
		if(searchIndex == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		System.out.print("나이를 입력하세요... ");
		int age = input.nextInt();
		infoStorage[searchIndex].setAge(age);
		System.out.println("수정이 완료되었습니다.\n");
	}
	
	public void deleteData() {
		System.out.print("삭제할 이름을 입력하세요... ");
		String name = input.next();
		
		int searchIndex = search(name); 
		if(searchIndex == -1) { // 일치하는 데이터 있음
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		for(int j=searchIndex;j<index;j++) { // 찾은 인덱스 삭제 = 바로 뒤 인덱스 객체 복사
			infoStorage[j] = infoStorage[j+1];
		}
		index--;
		System.out.println("삭제가 완료되었습니다.\n");
	}
		
	public void showBook() {
		System.out.println("\n<< 저장 목록 >>");
		for(AnimalInfo animal: infoStorage) {
			if(animal != null) { 
				animal.showAnimalInfo();
			}
		}
	}
	
}