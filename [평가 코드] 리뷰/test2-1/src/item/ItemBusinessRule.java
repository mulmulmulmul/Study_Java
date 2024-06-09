/*
 * [정은경 코드리뷰]
 * 전체 메소드에서 store[id-1]를 사용하기보다 메소드에서 선언한 변수 code로 접근하는 게 더 좋았을 것 같습니다.
 */

package item;

public class ItemBusinessRule {
	
	private static final Item[]store = new Item[100];
	private static int sequence;
	private static Item Id = new Item(); // Item 타입 참조변수 Id는 여기서 필요하지 않아 보입니다.	
	private static int numbering;
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		int id = ++numbering;
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		store[sequence++] = new Item(id,name,price,quantity);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	
	private Item findbyId(int itemID) {
		for(int i=0; i<sequence; i++) {
			if(store[i].getId() == itemID) {
				return Id;
			}
		}
		return null;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item code = findbyId(id);
		
		if(code == null) {
			System.out.println("아이디가 "+id+"인 상품이 없습니다.");
			return;
		}
		store[id-1].showInfo(); // store[id-1] -> code
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item code = findbyId(id);
		
		if(code == null) {
			System.out.println("아이디가 "+id+"인 상품이 없습니다.");
			return;
		}
		System.out.println("가격, 수량을 입력하세요...");
		Integer price = ItemView.INPUT.nextInt();
		store[id-1].setPrice(price); 
		int quantity = ItemView.INPUT.nextInt();
		store[id-1].setQuantity(quantity);
		System.out.println("상품 수정이 완료되었습니다.");				
	}
	
	public void delete() {
		System.out.println("삭제를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item code = findbyId(id);
		
		if(code == null) { // 객체 필드를 초기값으로 변경하기보다, 삭제할 인덱스 요소에 다음 인덱스 요소를 저장해주는 게 좋습니다.
			System.out.println("아이디가 "+id+"인 상품이 없습니다.");
		}
		store[id-1].setItemName(null); 
		store[id-1].setPrice(null);
		store[id-1].setQuantity(0);
		System.out.println(id+"번 상품이 삭제되었습니다.");
		System.out.println("상품 삭제가 완료되었습니다.");
		// 배열 요소가 삭제되었으므로 인덱스가 1감소되어야 합니다.
	}
	
	public void findAll() {
		for(int i=0; i<sequence; i++) {
			if(store[i].getItemName() != null) { //향상된 for문을 이용해 객체가 null을 참조하지 않으면 정보를 출력하도록 작성하시면 더 깔끔할 것 같습니다.
				store[i].showInfo();
			}
			System.out.println("저장된 상품 정보가 없습니다."); 
			// sequence가 0일 때(배열 인덱스가 초기값일 때) 저장된 상품 정보가 없음을 먼저 처리해주고, 반복문을 끝내주어야 해당 출력문이 중복되지 않습니다.
		}
	}
	
	public void clearStore() { // 전체 정보 조회 시 객체 != null 일 때 정보를 출력하도록 작성했다면, 전체 삭제는 배열의 모든 요소를 null로 변경해주면 됩니다.
		for(int i=0; i<sequence; i++) {
			store[i].setItemName(null);
			store[i].setPrice(null);
			store[i].setQuantity(0);
		}
		// 모든 요소를 삭제했으므로 sequence = 0 처리해주는 것이 좋습니다.	
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
}
