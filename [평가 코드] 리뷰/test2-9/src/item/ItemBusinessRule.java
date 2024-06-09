package item;

public class ItemBusinessRule  {
	private static final Item[] store = new Item[100]; 
	private static int sequence=0;
	private int id=1;
	
	public void save() {
		if(sequence>=100) {
			System.out.println("더이상 저장할 수 없습니다.\n");
			return;
		}
		
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String name = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		store[sequence++] = new Item(id++,name,price,quantity);
		System.out.println("상품 정보가 저장되었습니다.\n");
	}
	
	private Item findById(int id) {
		for(int i=0; i<sequence; i++) {
			if(store[i].getId()==id) {
				return store[i];
			}
		}
		
		return new Item(); 
	}
	
	private int findIndexById(int id) {
		for(int i=0; i<sequence; i++) {
			if(store[i].getId()==id) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item myItem = findById(id);
		
		if(myItem.getId()>=1) {
			System.out.println("************************************************");
			myItem.showInfo();
			System.out.println("************************************************");
			System.out.println("상품 조회가 완료되었습니다.\n");
			return;
		}
		
		System.out.printf("아이디가 %d인 상품은 없습니다.\n\n",id);
	}

	public void update() {
		System.out.print("수정하기 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item myItem = findById(id);
		
		if(myItem.getId()>=1) {
			System.out.print("가격, 수량 입력하세요...");
			Integer price = ItemView.INPUT.nextInt();
			int quantity = ItemView.INPUT.nextInt();
			
			myItem.setPrice(price);
			myItem.setQuantity(quantity);
			System.out.println("상품 수정이 완료되었습니다.\n");
			return;
		}
		
		System.out.printf("아이디가 %d인 상품은 없습니다.\n\n",id);
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디를 입력하세요...");
		int id = ItemView.INPUT.nextInt();
		Item myItem = findById(id);
		
		if(myItem.getId()>=1) {
			int idx=findIndexById(myItem.getId());
			for(int i=idx;i<sequence;i++) {
				if(i==99) {
					store[i]=new Item();
					break;
				}
				
				store[i]=store[i+1];
			}
			
			sequence--;
			System.out.printf("%d번 상품이 삭제되었습니다.",id);
			System.out.println("상품 삭제가 완료되었습니다.\n");
			return;
		}
		
		System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
	}
	
	public void findAll() {
		if(sequence==0) {
			System.out.println("저장된 상품 정보가 없습니다.\n");
			return;
		}
		
		System.out.println();
		System.out.println("************************************************");
		for(int i=0; i<sequence;i++) {
			store[i].showInfo();
		}		
		System.out.println("************************************************");
		System.out.println();
	}
	
	public void clearStore() {
		for(int i=0; i<sequence; i++) {
			store[i] = new Item();
		}
		sequence=0;
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
