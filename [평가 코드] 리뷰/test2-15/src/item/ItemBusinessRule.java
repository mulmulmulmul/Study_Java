/*
 * [정은경 코드리뷰]
 */
package item;

public class ItemBusinessRule {

	private static final Item[] store = new Item[100];
	private static int sequence;
	
	private int findById (int itemId) { // 1. 문제에서 제시한 바에 따라 Item 타입 객체를 리턴하는 메소드를 작성하셔야 합니다.
		for (int i=0; i<sequence; i++) {
			if (store[i].getId() == itemId) {
				return i;
			}
		}
		return -1;
	}
	// 상품 저장 ===============================================
	public void save () { // 2. 배열에 요소를 저장할 때 id를 1씩 증가시켜야 합니다.	
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요 ... ");
		String name = ItemView.input.next();
		Integer price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		
		store[sequence++] = new Item(name, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	// 상품 조회 ===============================================
	public void find () { 
		System.out.print("조회를 원하는 아이디를 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		int searchIndex = findById(id);
		
		if (searchIndex == -1) {
			System.out.printf("아이디 %s인 상품이 없습니다.\n", id);
		} else {
			store[searchIndex].showInfo();
			System.out.println();
		}
	}
	// 상품 수정 ===============================================
	public void update () { 
		System.out.print("수정하기 원하는 아이디 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		int searchIndex = findById(id);
		
		if (searchIndex == -1) {
			System.out.printf("아이디 %s인 상품이 없습니다.\n", id);
			return;
		}
		
		System.out.print("가격, 수량을 입력하세요 ... ");
		Integer price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		
		store[searchIndex].setPrice(price);
		store[searchIndex].setQuantity(quantity);
		System.out.println("상품 수정이 완료되었습니다.");
	}
	// 상품 삭제 ===============================================
	public void delete () {
		System.out.print("삭제를 원하는 아이디 입력하세요 ... ");
		int id = ItemView.input.nextInt();
		int searchIndex = findById(id);
		
		if (searchIndex == -1) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		for (int i=searchIndex; i<sequence; i++) {
			store[i] = store[i+1];
		}
		sequence--;
		System.out.printf("%s번 상품이 삭제 되었습니다.\n", id);
		System.out.println("상품이 삭제가 완료되었습니다.");
	}
	// 상품 전체 조회 ==========================================
	public void findAll () {
		boolean cheak = false;
		for (Item info: store) {
			if (info == null) {
				cheak = true;
				if (! cheak) {
					cheak = false;
					System.out.println("저장된 상품 정보가 없습니다.");
				}
				continue;
			}
			System.out.println("여기"); 
			info.showInfo();
			System.out.println();
		}
	}
	// 상품 전체 삭제 ==========================================
	public void clearStore () {
		for (int i=0; i<sequence; i++) {
			store[i] = store[sequence + 1]; // 3. 전체 삭제의 경우, 모두 null로 변환하면 더욱 깔끔할 것 같습니다.
		}
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
}
