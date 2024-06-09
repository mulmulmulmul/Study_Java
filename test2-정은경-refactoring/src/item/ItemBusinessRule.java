package item;

public class ItemBusinessRule {

	private static Item[] STORE = new Item[100];
	private int sequence;
	private int id = 1;
	private Item empty = new Item();
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요... ");
		String name = ItemView.INPUT.next();
		int price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		// 생성자에 사용할 id 값은 모든 메소드가 공유할 거니까 멤버로 빼주기
		
		STORE[sequence++] = new Item(id++, name, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.\n");
	}
	
	private Item findById(int itemId) {
		for(int i=0; i<sequence; i++) {
			if(STORE[i].getId() == itemId) {
				return STORE[i];
			}
		}
		return empty;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		if(itemById == empty) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n\n", itemId);
			return;
		}
		itemById.showInfo();
		System.out.println("상품 조회가 완료되었습니다.\n");
	}
	
	public void update() {
		System.out.print("수정을 원하는 아이디를 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		if(itemById ==  empty) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n\n", itemId);
			return;
		}
		System.out.print("가격, 수량을 입력하세요... ");
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		itemById.setPrice(price);
		itemById.setQuantity(quantity);
		System.out.println("상품 수정이 완료되었습니다.\n");
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		if(itemById == empty) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
			return;
		}
		for(int a=itemById.getId()-1; a<sequence; a++) { 
			STORE[a] = STORE[a+1];
		}
		sequence--;
		System.out.println(itemById.getId() + "번 상품이 삭제되었습니다.");
		System.out.println("상품 삭제가 완료되었습니다.\n");
	}
	
	public void findAll() {
		
		if (sequence == 0) {
			System.out.println("저장된 상품 정보가 없습니다.\n");
			return;
		}
		
		for(Item item: STORE) {
			if(item != null && item != empty) {
				item.showInfo();
			}
		}
	}
	
	public void clearStore() {
		for(Item item: STORE) {
				item = null;
		}
		sequence = 0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
