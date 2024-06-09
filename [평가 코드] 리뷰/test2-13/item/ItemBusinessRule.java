package item;


public class ItemBusinessRule {
	
	private static final Item[] store = new Item[100];
	private int sequence = 0;
	
	int id=0;
	
	// 1. 상품 저장
	public void save() {
		System.out.println("상품명, 가격, 수량을 순서대로 입력하세요...");
		String name = ItemView.input.next();
		Integer price = ItemView.input.nextInt();
		int quantity = ItemView.input.nextInt();
		id++;
		
		

		store[sequence++] = new Item(id, name, price, quantity);
		System.out.println("상품 정보가 저장되었습니다.");
		
	}
	
	// 2. 상품 조회
	public void find() {
		System.out.println("조회를 원하는 아이디를 입력하세요...");
		int id1=ItemView.input.nextInt();
		
		int search = findBy(id1);
		
		if(search == -1) {
			System.out.println("아이디가 " + id1 + "인 상품이 없습니다.");
			return;
		}
		store[search].showInfo();
		System.out.println("상품 조회가 완료되었습니다.");
		
	}
	
	// 3. 상품 수정
	public void update() {
		System.out.println("수정을 원하는 아이디를 입력하세요...");
		int id1=ItemView.input.nextInt();
		
		int search = findBy(id1);
		
		if(search==-1) {
			System.out.println("아이디가 " + id1 + "인 상품이 없습니다.");
			return;
		}
		System.out.println("가격, 수량을 입력하세요...");
		store[search].setPrQu(ItemView.input.nextInt(), ItemView.input.nextInt());
		System.out.println("상품 수정이 완료되었습니다.");
	}
	
	
	// 4. 상품 삭제
	public void delete() {
		
		System.out.println("삭제를 원하는 아이디 입력하세요...");
		int id1=ItemView.input.nextInt();
		
		int search = findBy(id1);
		
		if(search==-1) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		System.out.println(id + "번 상품이 삭제되었습니다.");
		
		for(int i=search;i<sequence;i++) {
			store[i]=store[i+1];
		}
		sequence--;
		System.out.println("삭제가 완료되었습니다.");
		
	}
	// findBy
	private int findBy(int id1) {
		for(int i=0;i<sequence;i++) {
			if(store[i].getId()==id1) {
				return i;
			}
		}
		return -1;
		
	}
	
	// 5. 상품 전체 조회
	public void findAll() {
		if(sequence==0) {
			System.out.println("저장된 상품 정보가 없습니다.");
		}
		for(int i=0;i<sequence;i++) {
			store[i].showInfo();
		}
	}
	
	// 6. 상품 전체 삭제
	public void clearStore() {
		while(true) {
			for(int i=0;i<sequence;i++) {
			store[i]=store[i+1];
				sequence--;	
				}
				if(sequence==0)	{
					System.out.println("상품의 모든 정보가 삭제되었습니다.");
					break;
				}
		}		
	}

}
