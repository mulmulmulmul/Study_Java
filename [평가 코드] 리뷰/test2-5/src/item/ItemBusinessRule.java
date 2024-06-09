package item;

public class ItemBusinessRule {
	private final int MAX_CNT = 100;
	private Item[] itemStorage = new Item[MAX_CNT]; 
	private int sequence = 0;
	private int idCnt = 1;
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		itemStorage[sequence++] = new Item(idCnt, name, price, quantity);
		idCnt++;
	}
	
	private Item findById(int itemId) {
		for(int i=0; i<sequence; i++) {
			if(itemStorage[i].getId() == itemId) {
				return itemStorage[i];
			}
		}
		return null;
	}
	
	public void find() {
		
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		
		if(findById(id) == null) {
			System.out.println("\n아이디가 " + id + "인 상품이 없습니다.\n");
			return;
		}
		
		findById(id).showInfo();
	}
	
	public void update() {
		
		System.out.print("수정하기 원하는 상품의 id를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		
		if(findById(id) == null) {
			System.out.println("\n아이디가 " + id + "인 상품이 없습니다.\n");
			return;
		}
		if(findById(id) != null) {
			System.out.print("가격, 수량을 입력하세요...");
			int price = ItemView.INPUT.nextInt();
			int quantity = ItemView.INPUT.nextInt();
			
			itemStorage[id-1].setPrice(price);
			itemStorage[id-1].setQuantity(quantity);
			System.out.println("상품 수정이 완료되었습니다.");
			return;
		}
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		
		if(findById(id) == null) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		System.out.println(id + "번 상품이 삭제되었습니다.");
		
		if(findById(id) != null) {
			for(int i=id-1; i<sequence; i++) {
				itemStorage[i] = itemStorage[i+1];
			}
		}
		sequence--;
		System.out.println("상품 삭제가 완료되었습니다.");
		return;
	}
	
	public void findAll() {
		for(int i=0; i<sequence; i++) {
			if(itemStorage[i] != null) {
				itemStorage[i].showInfo();
			}
		}
		if(itemStorage[0] == null) { 
			System.out.println("저장된 상품이 없습니다.");
		}
		return;
	}
	
	public void clearStore() {
		for(int i=0; i<MAX_CNT; i++) {
			itemStorage[i] = null;
		}
		
		sequence = 0;
		
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
		return;
	}
}
