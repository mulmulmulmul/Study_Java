/*
 * [정은경 코드리뷰]
 */

package item;
import item.ItemView;
import java.util.Scanner;
import item.Item;

public class ItemBusinessRule {

	private final int StoreItem = 100;
	private Item[] InfoStore = new Item[StoreItem];
	private int sequence = 0;
	private int id = 0;// 흠 ,, 이건 id(1,2,3,4...)가 계속초기화 되지않고 저장된상태로 증가 하고싶어서만든거,,
	public static final Scanner INPUT = new Scanner(System.in); // 1. itemview에서 System.in 이미 생성해줘서 다시 생성하지 않아도 될 것 같습니다.


	
	
	// [1.저장]=======================================================
	public void save() { 
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String itemName = INPUT.next();
		Integer price = INPUT.nextInt();
		int quantity = INPUT.nextInt();
		
		InfoStore[sequence++] = new Item(id,itemName,price,quantity); // 2. id++ 해주면 멤버로 선언하신 id가 1씩 증가되어 객체 필드값으로 저장됩니다.
		
		
		System.out.println("상품 저장이 완료 되었습니다.");
	}
		
	// [2.조회 ]======================================================
	public int findById() { // private으로 바꾸고싶지만실행안됨,, {
		// 3. 메소드가 구현되지 않았습니다. 매개변수로 int형 변수(id)를 받아 객체의 id와 비교 후, Item 객체를 반환하도록 작성하셔야 합니다.
		System.out.println("조회를 원하는 아이디를 입력하세요...");
		int itemid = INPUT.nextInt();
		
		int foundIndex = itemid; 
		for (int i = 0; i < sequence; i++) {
            if (foundIndex == itemid) {
            }else {
            	System.out.println("아이디가" + id + "인상품은없습니다.");
		}

		}
		return itemid;
	}

	//[3.상품 수정]================================================
	public void update() { // 4. findById() 메소드의 결과로 반환된 객체를 이용해  코드 작성해야 합니다.
		
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		int id = INPUT.nextInt();
		
		// 그리고 setter로 값을 설정해줘야함 => private라서
		
		private int item(int id) { // id를받아줘야한다
		        for (int i = 0; i < sequence; i++) {
		            if ("유저값(숫자)이랑 인덱스에있는숫자가 같으면") {
		                System.out.print("가격, 수량을 입력해주세요");
		                
		                Integer price = INPUT.nextInt();
		                int quantity = INPUT.nextInt();
		                
		                InfoStore[foundIndex].setPrice(price);
		                InfoStore[foundIndex].setQuantity(quantity);
		                System.out.println("상품 수정이 완료되었습니다");
		        }
		}
	}

	//[4. 상품 삭제] ====================================================
	public void delete() { // 5. findById() 메소드의 결과로 반환된 객체를 null과 비교해 명령어를 출력하도록 코드 작성해야 합니다.
		//아이디가 있다면 삭제후 ""번 상품이 삭제 되었습니다. , "상품 삭제가 완료되었습니다"
		//아이디가 없다면 삭제하지않고 "해당상품이 없어서 삭제는 진행하지 않습니다"
		
		System.out.println("삭제를 원하는 아이디 입력하세요...");
		int id = INPUT.nextInt();
		int foundIndex = search(id);
		if("유저의 아이디랑 입력한값이 같다면")
			
		for(int j = foundIndex; j < sequence; j++) {
			InfoStore[j] = InfoStore[j+1];
			sequence--;
		}
	
		else if(foundIndex == -1) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}	
	}

	// 5. 상품 전체 조회==========================================================
	public void findAll() { 
		// for (int id = 0 id < sequence; id++)? 뭐지 id를어떻게증가시키지,, 증감식을써야하는건아는데,,
		for(int i = 1; i < sequence; i++) { // 6. 배열에 값이 저장되어 있다면, 정보를 출력해야 합니다.
			id++; // 출력을하게되면 상품id가 계속0임증가를 어떻게시켜야할까? 를증가시키고싶다..
			InfoStore[i].showInfo();
		}
	}
	// 6. 상품 전체 삭제============================================================
	public void clearStore() {
		
		int foundIndex = 0;
		for(int j=foundIndex; j < sequence; j++) {
			InfoStore[j] = InfoStore[j+1];
			sequence--; // 7. sequence-- 는 for문 실행이 완료된 후(배열 요소 삭제가 완료된 후) 작성하셔야 합니다. 
		}		
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
	// 7. 프로그램 종료===========================================================
	public void SystemEnd() { // 8. 필요하지 않은 메소드입니다.	
		
			System.exit(0);
			
	}		
	// 8. 반복되는 for문을 줄이는코드
	private int search(int id) {  // id를 받아줘야함 // 9. 필요하지 않은 메소드입니다.	
		for (int i = 1; i < sequence; id++) {
			if (InfoStore[i].getId().equals(id))  {  //문자열비굔데 숫자비교는 ==아닌가
 				return i;
			}
		}
		return - 1;
	}
	



	
	
	
	
}
