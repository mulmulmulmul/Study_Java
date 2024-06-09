package item;

import java.util.Scanner;
	
public class ItemBusinessRule {
	
	private static final Item[] store = new Item[100]; 
	private static int sequence = 1;
	private Scanner input = ItemView.INPUT;
	private int top = 0;
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		
		String itemName = input.next();
		int price = input.nextInt();
		int quantity = input.nextInt();
		
		store[top++] = new Item(sequence++, itemName, price, quantity);
		
		System.out.println("상품 정보가 저장되었습니다");
	}
	
	private Item findById(int itemId) {
		for(int i = 0; i < top; i++) {
			if(store[i].getId() == itemId) {
				return store[i]; 
			}
		}
		return null; 
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요... ");
		
		int userValue = input.nextInt();
		Item findItem = findById(userValue);
		
		if(findItem == null) {
			System.out.println("아이디가 "+userValue+"인 상품이 없습니다.");
			return;
		}
		
		findItem.showInfo();
		System.out.println("상품 조회가 완료되었습니다.");
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디를 입력하세요... ");
		
		int userValue = input.nextInt();
		Item findItem = findById(userValue);
		
		if(findItem == null) {
			System.out.println("아이디가 "+userValue+"인 상품이 없습니다.");
			return;
		}
		
		System.out.println("가격, 수량을 입력하세요... ");
		int newPrice = input.nextInt();
		int newQuantity = input.nextInt();
		
		findItem.setPrice(newPrice);
		findItem.setQuantity(newQuantity);
		System.out.println("상품 수정이 완료되었습니다.");
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요... ");
		
		int userValue = input.nextInt();
		
		Item findItem = findById(userValue);
		if(findItem == null) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		int searchedIndex = searchIndex(userValue);
		for(int i = searchedIndex; i < top; i++) {
			store[i] = store[i+1];
		}
		top--;
		
		System.out.println(userValue+"번 상품이 삭제되었습니다.");
		System.out.println("상품 삭제가 완료되었습니다.");
	}
	
	public void findAll() {
		if(top == 0) {
			System.out.println("저장된 상품 정보가 없습니다");
			return;
		}
		
		for(int i = 0; i < top; i++) {
			store[i].showInfo();
		}
		System.out.println();
	}
	
	public void clearStore() {
		for(int i = 0; i < store.length; i++) {
			store[i] = null;
		}
		top = 0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
	
	private int searchIndex(int num) {
		for(int i = 0; i < top; i++) {
			if(store[i].getId() == num) {
				return i;
			}
		}
		return -1;
	}
}
