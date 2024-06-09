package item;

public class ItemBusinessRule {

	private static final Item[] store = new Item[100];
	private static int sequence;
	public Item empty = new Item();
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요... ");
		String name = ItemView.input.next();
		Integer price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		int id = empty.incrementId();
		
		store[sequence++] = new Item(id, name, price, quantity);
		
		System.out.println("상품 정보가 저장되었습니다.\n");
	}
	
	private Item findById(int itemId) {
		for(int i=0;i<sequence;i++) {
			if(store[i].getId() == itemId) {
				return store[i]; 
			}
		}
		return empty;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.input.nextInt();
		
		Item itemByid = findById(id);
		
		if(itemByid == empty) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n", id);
			return;
		}
		itemByid.showInfo();
		System.out.println("상품 조회가 완료되었습니다.\n");
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요... ");
		int id = ItemView.input.nextInt();
		
		Item itemByid = findById(id);
		
		if(itemByid == empty) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n", id);
			return;
		}
		System.out.print("가격, 수량을 입력하세요... ");
		String name = findById(id).getItemName();
		int price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		
		for(int i=0;i<sequence;i++) {
			if(store[i].getId() == id) {
				store[i] = new Item(id, name, price, quantity);
			}
		}
		System.out.println("상품 수정이 완료되었습니다.\n");
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요... ");
		int id = ItemView.input.nextInt();
		
		Item itemByid = findById(id);
		
		if(itemByid == empty) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
			return;
		}
		for(int i=0;i<sequence;i++) {
			if(store[i].getId() == id) {
				store[i] = empty;
			}
		}
		System.out.println(id + "번 상품이 삭제되었습니다.");
		System.out.println("상품 삭제가 완료되었습니다.\n");
	}
	
	public void findAll() {
		boolean isNULL = false;
		
		for(int i=0;i<sequence;i++) {
			if(store[i] != empty) {
				store[i].showInfo();
				isNULL = false;
			} else {
				isNULL = true;
			}
		}
		
		if(isNULL == true) {
			System.out.println("저장된 상품 정보가 없습니다.\n");
		}
	}
	
	public void clearStore() {
		for(int i=0;i<sequence;i++) {
			if(store[i] != empty) {
				store[i] = empty;
			}
		}
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
