package book;

import java.util.Scanner;

public class BookManager {
	private final int MAX_CNT = 100;
	private AnimalInfo[]	 infoStorage = new AnimalInfo[MAX_CNT];
	private int index;
	
	public static Scanner input = new Scanner(System.in);
	
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		if(find(name) != null)	{
			System.out.println("이미 저장된 이름입니다.");
		}
		System.out.print("2. 나이 : ");
		int age = input.nextInt();

		infoStorage[index++] = new AnimalInfo(name, age,index++);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	private AnimalInfo find(String name) {
//		for(int a = 0; a < index; a++) {
//			if (infoStorage[a].getName().equals(name)) {
//				return infoStorage[a];
//			}
//		}
//		return null;
		
		for(AnimalInfo animal: infoStorage) {
			if(animal != null && animal.getName().equals(name)) {
				return animal;
			}
		}
		return null;
	}
	
	public void findData() {
		System.out.print("정보 조회할 동물의 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo infoByName = find(name);
		
		if(infoByName == null	) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		infoByName.showAnimalInfo(); 
	}
	
	
	public void update() {
		System.out.print("수정할 동물의 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo infoByName = find(name);
		
		if(infoByName == null) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		System.out.print(name + "의 수정할 이름을 입력하세요... ");
		String updateName = input.next();
		System.out.print(name + "의 수정할 나이를 입력하세요... ");
		int updateage = input.nextInt();
		
		infoByName.setName(updateName);
		infoByName.setAge(updateage);
		System.out.println("데이터 수정이 완료되었습니다.");
	}
	
	public void delete() {
		System.out.print("삭제할 동물의 이름을 입력하세요... ");
		String name = input.next();
		
		AnimalInfo infoByName = find(name);
		
		if(infoByName== null) {
			System.out.println("해당 데이터가 없어 삭제를 진행하지 않습니다.");
			return;
		}
		
		outer:
		while(true) {
			System.out.print("정말로 삭제하시겠습니까? (Y/N)");
			String user = input.next().toUpperCase();
		
			switch (user) {
			case "Y" :
				for(int a = infoByName .getIndex(); a < index; a++) {
					infoStorage[a] = infoStorage[a+1];
				}
				index--;
				System.out.println("데이터 삭제가 완료되었습니다.");
				break outer;
			case "N" :
				System.out.println("데이터 삭제를 취소합니다.");
				break outer;
			default:
				System.out.println("Y/N 둘 중 하나를 입력하세요...");
			}
		}
	}
	
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for(int a = 0; a < index; a++) {
			infoStorage[a].showAnimalInfo();
			System.out.println();
		}
	}
	
}