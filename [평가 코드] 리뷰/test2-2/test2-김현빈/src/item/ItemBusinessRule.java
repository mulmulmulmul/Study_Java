package item;

public class ItemBusinessRule {
	private static final Item[] store = new Item[100];
	private static int sequence;
	private int id;

	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		id++;

		store[sequence++] = new Item(id, name, price, quantity);

		System.out.println("상품 정보가 저장되었습니다.");
	}

	private Item findById(int itemId) {
		for (int i = 0; i < sequence; i++) {
			if (store[i].getId() == itemId) {
				return store[i];
			}
		}
		return null;
	}

	private int returnSequence(int itemId) { 
		for (int i = 0; i < sequence; i++) {
			if (store[i].getId() == itemId) {
				return i;
			}
		}
		return -1;
	}

	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();

		Item item = findById(id);

		if (item != null) {
			item.showInfo();
			System.out.println("\n상품 조회가 완료되었습니다.");
			return;
		}
		System.out.println("아이디가 " + id + "인 상품이 없습니다.");

	}

	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		int id = ItemView.INPUT.nextInt();

		Item item = findById(id);

		if (item != null) {
			System.out.print("가격, 수량을 입력하세요...");
			item.setPrice(ItemView.INPUT.nextInt());
			item.setQuantity(ItemView.INPUT.nextInt());
			System.out.println("상품 수정이 완료되었습니다.");
			return;
		}
		System.out.println("아이디가 " + id + "인 상품이 없습니다.");
	}

	public void delete() {
		System.out.print("삭제하기 원하는 아이디 입력하세요...");
		int id = ItemView.INPUT.nextInt();

		Item item = findById(id);
		int index = returnSequence(id);

		if (item != null) {
			for (int j = index; j < sequence; j++) {
				store[j] = store[j + 1];
			}
			sequence--;
			System.out.println("2번 상품이 삭제되었습니다.");
			System.out.println("상품 삭제가 완료되었습니다.");
			return;
		} else {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");

		}

	}

	public void findAll() { 
		boolean isEmpty = true;
		for (Item item : store) {
			if (item != null) {
				isEmpty = false;
				item.showInfo();
			}
		}
		if (isEmpty) {
			System.out.println("저장된 상품 정보가 없습니다.");
		}
	}

	public void clearStore() { 

		for (int i = 0; i < sequence; i++) {
			store[i] = null;
		}
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}

}
