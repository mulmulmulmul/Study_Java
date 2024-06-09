// [정은경 코드리뷰]
// findById()를 제외한 메소드들은 매개변수가 필요하지 않습니다.

package item;

import java.util.Scanner;

public class ItemBusinessRule {
	private static final Item[] store = new Item[100];
	private static int sequence;
	
	// 저장
	public void save(Scanner input) { // 배열에 객체 저장할 때, id값을 증가시키는 코드가 필요합니다.
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		
		String itemName = input.next();
		Integer price = input.nextInt();
		int quantity = input.nextInt();
			
		store[sequence++] = new Item(itemName, price, quantity);
		
		System.out.println("상품 정보가 저장되었습니다.\n");
	}
	
	//
	private Item findByld(int Itemid) { // 사용자가 입력한 itemid와 일치하는 객체를 반환하도록 메소드가 구현되지 않았습니다.	
		return null;
	}
	
	// 조회
	public void find(Scanner input) {
		System.out.println("조회를 원하는 아이디를 입력하세요...");
		int itemid = input.nextInt();
		
		int data = search(itemid);
		if(data != -1) {
			store[data].showInfo();
			return;
		}
		
		System.out.println("아이디가 " + itemid + "인 상품이 없습니다.");	
	}
	
	// 수정
	public void update(Scanner input) {
		System.out.println("수정하기 원하는 아이디를 입력하세요...");
		int itemid = input.nextInt();
		
		int data = search(itemid);
		if(data != -1) {
			System.out.print("가격, 수량을 입력하세요...");
			int price = input.nextInt();
			store[data].setPrice(price);
			int quantity = input.nextInt();
			store[data].setQuantity(quantity);
			System.out.println("상품 수정이 완료되었습니다.");
			return;
		}
		System.out.println("아이디가 " + itemid + "인 상품이 없습니다.");
	}
	

	// 삭제
	public void delete(Scanner input) { 
		System.out.println("삭제를 원하는 아이디 입력하세요...");
		int itemid = input.nextInt();
		
		int data = search(itemid);
		if(data != -1) {
			for(int j=data; j<sequence; j++) {
				store[j] = store[j + 1];
			}
			sequence--;
			System.out.println("상품 삭제가 완료되었습니다.");
			return;
		}
		System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
	}
	
	// 전체 조회
	public void findAll(Scanner input) {} // 메소드가 구현되지 않았습니다.
	private int search(int itemid) {
		
		for(int i=0; i<sequence; i++) {
			if(store[i].getId() == itemid) {
				return i;
			}
		}
		return -1;
	}
	
	// 전체 삭제
	public void clearStore(Scanner input) { // 메소드가 구현되지 않았습니다.	
			
	}
	
}
