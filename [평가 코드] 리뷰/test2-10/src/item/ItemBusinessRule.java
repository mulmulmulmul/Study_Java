package item;

public class ItemBusinessRule {
	private static final Item[] store = new Item[100];
	private int sequence = 1;
	private int index = -1;
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String  itemName = ItemView.input.next();
		Integer price = ItemView.input.nextInt();
		int quantitiy = ItemView.input.nextInt();
		
		store[++index] = new Item(sequence++, itemName, price, quantitiy);
		
		System.out.println("상품 정보가 저장되었습니다.");
	}
	
	private Item findById(int itemId) {
		for(int i=0; i<=index; i++) {
			if(store[i].getId() == itemId) {
				return store[i];
			}
		}
		return null;
	}
	
	public void find() {
		System.out.print("원하는 아이디를 입력하세요...");
		int itemId = ItemView.input.nextInt();
		
		Item checkItem = findById(itemId);
		
		if(checkItem != null) {
			checkItem.showInfo();
			System.out.println("상품 조회가 완료되었습니다.");
			return;
		}
		System.out.println("아이디가 " + itemId + "인 상품이 없습니다.");
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		int itemId = ItemView.input.nextInt();
		
		Item checkItem = findById(itemId);
		
		if(checkItem != null) {
			System.out.print("가격, 수량을 입력하세요...");
			checkItem.setPrice(ItemView.input.nextInt());
			checkItem.setQuantity(ItemView.input.nextInt());
			System.out.println("상품 수정이 완료되었습니다.");
			return;
		}
		System.out.println("아이디가 " + itemId + "인 상품이 없습니다.");
	}

	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요...");
		int itemId = ItemView.input.nextInt();
		
		Item checkItem = findById(itemId);
		
		if(checkItem != null) {
			for(int i=0; i<=index; i++) {
				if(checkItem == store[i]) {
					for(int j=i; j<=index; j++) {
						store[j] = store[j+1];
					}
					index--;
					System.out.println(itemId + "번 상품이 삭제되었습니다.");
					System.out.println("상품 삭제가 완료되었습니다.");
					return;
				}
			}
		}
		System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
	}
	
	public void findAll() {
	
		if(index == -1) {
			System.out.println("저장된 상품 정보가 없습니다.");
			return;
		}
		for(int i=0; i<=index; i++)
			store[i].showInfo();
		}
	
	public void clearStore() {
		
		while(true) {
			if(index == -1) {
				System.out.println("상품의 모든 정보가 삭제되었습니다.");
				return;
			} for(int i=0; i<=index; i++) {
				index--;
			}
		}
	}
}
