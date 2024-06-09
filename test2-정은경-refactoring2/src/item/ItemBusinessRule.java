package item;

public class ItemBusinessRule {

	private static final Item[] STORE = new Item[100]; // 배열의 길이가 100으로 설정됨.
	private int sequence;
	private int id = 1; // id 1로 초기화
//	private Item empty = new Item();
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요... ");
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		// 배열의 요소에 객체 주소 저장. sequence(인덱스)와 id는 배열에 저장 후 1씩 증가해야 하므로 후증가
		STORE[sequence++] = new Item(id++, name, price, quantity); 
		System.out.println("상품 정보가 저장되었습니다.\n");
	}
	
	private Item findById(int itemId) {
		for(int a = 0; a < sequence; a++) {
			if(STORE[a].getId() == itemId) {
				return STORE[a];
			}
		}
		return null; 
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		
		if(itemById == null) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n\n", itemId);
			return;
		}
		itemById.showInfo();
		System.out.println("상품 조회가 완료되었습니다.\n");
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		
		if(itemById == null) {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n\n", itemId);
			return;
		}
		System.out.print("가격, 수량을 입력하세요... ");
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		itemById.setPrice(price);
		itemById.setPrice(quantity);
		System.out.println("상품 수정이 완료되었습니다.\n");
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요... ");
		int itemId = ItemView.INPUT.nextInt();
		
		Item itemById = findById(itemId);
		
		if(itemById == null	) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
			return;
		}
		
		for(int a = itemById.getId()-1; a<sequence; a++) {
			STORE[a] = STORE[a+1];
		}
		sequence--;
		System.out.println(itemId + "번 상품이 삭제되었습니다.");
		System.out.println("상품 삭제가 완료되었습니다.\n");
	}
	
	public void findAll() {
		//1. sequence가 초기값일 때(=배열에 아무 요소도 저장되지 않은 상태) 먼저 처리
		if(sequence == 0) { 
			System.out.println("저장된 상품 정보가 없습니다.\n");
			return;
		}
		//2. null이 아닌 요소만 정보를 출력
		for(int a = 0; a<sequence; a++) {
			if(STORE[a] != null) {
				STORE[a].showInfo();
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
