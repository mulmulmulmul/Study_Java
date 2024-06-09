package item;

public class ItemBusinessRule {
	private static final Item[] store = new Item[100];
	private int sequence;
	int itemId=1;
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요... ");
		String itemName = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		store[sequence++] = new Item(itemId++, itemName, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	
	private Item findById(int itemId) {
		for(int i=0; i<sequence; i++) {
			if(store[i].getId() == itemId) {
				return store[i];
			}
		}
		return null;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요... ");
		int id = ItemView.INPUT.nextInt();
		
		for(int i=0; i<sequence; i++) {
			if(findById(id) == null) {
				System.out.printf("아이디가 %d인 상품이 없습니다.\n", id);
				return;
			}
		}
		findById(id).showInfo();
		System.out.println("상품 조회가 완료되었습니다.");
	}
	
	public void update() {
		System.out.print("수정 원하는 아이디를 입력하세요... ");
		int id = ItemView.INPUT.nextInt();
		
		for(int i=0; i<sequence; i++) {
			if(findById(id) == null) {
				System.out.printf("아이디가 %d인 상품이 없습니다.\n", id);
				return;
			}
		}
		
		System.out.println("가격, 수량을 입력하세요... ");
		Integer price = ItemView.INPUT.nextInt();
		int quantuty = ItemView.INPUT.nextInt();
		
		findById(id).setPrice(price);
		findById(id).setQuantity(quantuty);
		System.out.println("상품 수정이 완료되었습니다.");
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요... ");
		int id = ItemView.INPUT.nextInt();
		
		Item itemId = findById(id);
		
		for(int i=0; i<sequence; i++) {
			if(findById(id) == null) {
				System.out.printf("해당 상품이 없어서 삭제는 진행하지 않습니다.");
				return;
			}
		}
		for (int i = itemId.getId() - 1; i<sequence; i++) {
			store[i] = store[i+1];
		}
		System.out.printf("%d번 상품이 삭제되었습니다.\n", id);
		System.out.println("상품 삭제가 완료되었습니다.");
		sequence--;
	}
	
	public void findAll() {
		if (sequence == 0) {
			System.out.println("저장된 상품 정보가 없습니다.");
		}
		for(int i=0; i<sequence; i++) {
			
			if (store[i] == null) {
				return;
			}
			store[i].showInfo();
		}
	}
	
	public void clearStore() {
		for(int i=0;i<sequence;i++) {
			if (store[i] != null) {
				store[i] = null;
			}
		}
		sequence = 0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
