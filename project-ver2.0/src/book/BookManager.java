package book;
/*
 * scanner를 싱글톤
 * 
 */
import java.util.Scanner;

public class BookManager {

	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT]; // 배열변수 선언, 초기화
	private int index;
	
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("<< 정보를 입력하세요 >>");
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		System.out.println("데이터 입력이 완료되었습니다.\n");
		
		infoStorage[index++] = new AnimalInfo(name, age);
		
//		input.close();
	}
	
	public void searchData() {
		Scanner input = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요... ");
		String name = input.next();
		
		
		for(int i=0;i<index;i++) {
			
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i].showAnimalInfo();
//			} else if (infoStorage[i].getName().equals(name)==false) {
//				System.out.println("해당 데이터는 없습니다.");
//				return;
			}
		}
		
		System.out.println("해당 데이터는 없습니다.");
		
	} // 없을 경우 구현

	public void updateData() {
		Scanner input = new Scanner(System.in);
		System.out.print("수정할 이름을 입력하세요... ");
		String name = input.next();
		System.out.print("나이를 입력하세요... ");
		int age = input.nextInt();
		
		for(int i=0;i<index;i++) {
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i].setAge(age);
				System.out.println("수정이 완료되었습니다.\n");
			}
		}
	}
	
	public void deleteData() {
		Scanner input = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요... ");
		String name = input.next();
	
		for(int i=0;i<index;i++) {
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i] = null;
				System.out.println("삭제가 완료되었습니다.\n");
			}
		}
	}
		
	public void showBook() {
		
		for(AnimalInfo animal: infoStorage) {
			if(animal == null) { 
				break;
			}
			animal.showAnimalInfo();
		}
	}
}