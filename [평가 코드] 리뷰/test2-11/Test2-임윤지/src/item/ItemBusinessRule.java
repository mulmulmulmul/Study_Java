/*
 * [정은경 코드리뷰]
 */

// Item 생성자 - id : int // itemName : String // price : Integer // quantity : int
// showinfo를 통해 멤버변수 값 출력 (void)

// store : item[100] readonly
// sequence : int 

package item;

import java.util.Scanner;

public class ItemBusinessRule<infoStorage> { //
	
	private final int MAX_CNT = 100;
	private Item[] infoStorage = new Item[MAX_CNT];	
	private int sequence = 0; 
	
	public static Scanner input = new Scanner(System.in);


	public ItemBusinessRule() {
		
	}


	// [저장] ========================================================
	public void save() {
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요");
		
		String name = input.next();
		Integer price = input.nextInt();
		int quantity = input.nextInt();
		
		infoStorage[sequence++] = new Item(name,price,quantity); // 1. id 증가시켜주어야 합니다.
		
		System.out.println("상품 정보가 저장되었습니다.");
		
		input.close(); // 2. input 자원 해제는 메인 메소드가 종료되는 시점에 작성해주셔야 합니다.
				
	}
	
	private int findByld() { // 3. 매개변수로 int형 변수(id)를 입력받고, 이를 객체 id 필드값과 비교해 객체를 리턴하는 메소드를 작성하셔야 합니다. 
		Class<Scanner> id = Scanner.class;
			for(int i=0; i<sequence; i++) {
				infoStorage[i].showItemInfo();
			} return -1;
	}
	
	// [조회] ============================================================
	
	public void find() { // 4. 메서드가 구현되지 않았습니다.
	
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = input.nextInt();
		
		int findByldsequence = sequence();
		if (findByldsequence != -1) {
			infoStorage[findByldsequence].showItemInfo();
		} else {
			System.out.println("아이디가 %d인 상품이 없습니다.");	
		}
	
	}

	private int sequence() { // 5. 해당 메서드는 필요하지 않아 보입니다.
		return 0;
	}

	// [수정] =============================================================

	public void update() { // 6. findById()메소드가 구현되지 않아 아래 메소드들이 구현되지 않고 있습니다.
		
		System.out.println("수정하기 원하는 아이디 입력하세요...");
		int id = input.nextInt();
		
		int findByldsequence = sequence();
		if (findByldsequence != -1) {
			System.out.println("가격, 수량을 입력하세요...");
			Integer price = input.nextInt();
			int quantity = input.nextInt();
			infoStorage[findByldsequence].setPrice(price);
			infoStorage[findByldsequence].setQuantity(quantity);
			System.out.println("상품 수정이 완료되었습니다.");
		} else {
			System.out.println("아이디가 %d인 상품이 없습니다.");
		}		
	}

	// [삭제] ============================================================

	public void delete() {
		
		System.out.print("삭제를 원하는 아이디를 입력하세요...");
		int id = input.nextInt();
		
		int findByldsequence = sequence();
		if (findByldsequence != -1) {
			for(int j = findByldsequence; j <sequence; j++) {
				infoStorage[j] = infoStorage[j+1];
			}
			infoStorage[sequence -1] = null;
			sequence--;
			System.out.println("상품 삭제가 완료되었습니다.");
			return;
		}
		System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
	}

	// [상품 전체 조회] ===================================================

	public void findAll() { // 7. 저장된 요소가 null이 아닐 때 정보를 출력해야 합니다.
		
		System.out.println("\n<< 저장목록 >>");
		
		for(int i=0; i < sequence; i++) {
			infoStorage[i].showItemInfo();
		}
		
		System.out.println("sequence >>" + sequence);
	
	}

	// [상품 전체 삭제] ===================================================

	public void clearStore() { // 8. 배열의 모든 요소를 null로 만들어주셔야 합니다.
		
		System.out.println("\n<< 저장목록 >>");
		
		for(Item info : infoStorage) {
			if(info == null)
				break;
			info.delete();
			}
		System.out.println("저장된 상품 정보가 없습니다.");
		}
}
	

