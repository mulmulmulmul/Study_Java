// [정은경 코드리뷰]

package item;

public class ItemBusinessRule {

	private static final Item [] store  = new Item[100];
	private static int sequence =0;
	static int id = 1;
	
	
	public void save() {
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String itemName = ItemView.input.next();
		Integer price = ItemView.input.nextInt(); ; 
		int quantity = ItemView.input.nextInt();
		
		System.out.println("상품 정보가 저장되었습니다.\n");
		store[sequence++] = new Item(id, itemName, price, quantity);
		id ++;
	} 
	
	
	private int findById(int itemId) { // 1. 문제에서 제시한 내용에 따라 Item 타입 객체를 리턴하는 메소드를 작성하시는 것이 좋을 것 같습니다.
		
		for(int i = 0; i < sequence; i++) {
			
			if (store[i].getId() == itemId) {
				return i;
			}
		}
		return -1;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.input.nextInt();
		
		int itemId = findById(id);
		
		if (itemId == -1) {
			System.out.println("아이디가 " +id+ "인 상품이 없습니다.\n");
		} else {
			store[itemId].showInfo();
			System.out.println();
		}
	
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		int id = ItemView.input.nextInt();
				
		int itemId = findById(id);
		
		if (itemId != -1) {
			System.out.print("가격, 수량을 입력하세요...");
			Integer price = ItemView.input.nextInt(); ; 
			int quantity = ItemView.input.nextInt();
			
			store[itemId].setPrice(price);
			store[itemId].setQuantity(quantity);
			
		} else {
		System.out.println("아이디가 " + id+ "인 상품이 없습니다.\n");
	
		}
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요...");
		int id = ItemView.input.nextInt();
		
		int itemId = findById(id);
		
		if (itemId != -1 ) {
			
			for (int j = itemId; j < sequence; j++) {
    			store[j] = store[j + 1];
    		}
    		sequence--;
    		
			System.out.println(id +"번 상품이 삭제되었습니다.");
			System.out.println("상품 삭제가 완료되었습니다.\n");
			
		} else {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
		}
		
	}
	
	
	public void findAll() { // 2. 반복문을 돌면서 배열에 객체가 저장되었을 경우, 해당 객체 정보를 출력하셔야 합니다.
		
		for(int i=0; i<sequence; i++) {
			store[i].showInfo();
		}
		System.out.println();
	}
	
	// 전체 삭제 메소드 (6. 상품 전체 삭제)
	public void clearAll() {
	
		for (int j = sequence; j == 0; j--) {
			store[j] = store[j - 1]; // 3. 반복문을 돌면서 배열의 모든 값을 null로 변경해주면 더 깔끔할 것 같습니다.
			sequence--;
		}
		
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
	
}
