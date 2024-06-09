package book;

public class BookService {
	private static final Animal[] member = new Animal[100];
	private int sequence;
	private long id = 1;
	
	public void input() {
		System.out.println("동물의 이름과 나이를 입력하세요...");
		System.out.print("이름 : ");
		String name = MenuView.INPUT.next();
		System.out.print("나이 : ");
		int age = MenuView.INPUT.nextInt();
		
		member[sequence++] = new Animal(Long.valueOf(id), name, age);
		id++;
		
		System.out.println("회원 정보가 저장되었습니다.\n");
	}
	
	private Animal findById(Long id) {
		for(int i = 0; i < sequence; i++) {
			if(member[i].getId() == id) {
				return member[i];
			}
		}
		return null;
	}
	
	public void search() {
		System.out.print("[조회] 회원 아이디 입력... ");
		Long memberId = MenuView.INPUT.nextLong();
		
		Animal animal = findById(memberId);
		
		if(animal == null) {
			System.out.printf("아이디가 %d인 회원이 없습니다.\n", memberId);
			return;
		}
		animal.showInfo();
		System.out.println("회원정보 조회가 완료되었습니다.\n");
	}
	
	public void update() {
		System.out.println("[수정] 회원 아이디 입력... ");
		Long memberId = MenuView.INPUT.nextLong();
		
		Animal animal = findById(memberId);
		
		if(animal == null) {
			System.out.printf("아이디가 %d인 회원이 없습니다.\n", memberId);
			return;
		}
		System.out.println("이름과 나이를 입력하세요... ");
		
		animal.setName(MenuView.INPUT.next());
		animal.setAge(MenuView.INPUT.nextInt());

		System.out.println("회원정보 수정이 완료되었습니다.\n");
	}
	
	public void delete() {
		System.out.println("[삭제] 회원 아이디 입력... ");
		Long memberId = MenuView.INPUT.nextLong();
		
		Animal animal = findById(memberId);
		
		if(animal == null) {
			System.out.printf("아이디가 %d인 회원이 없습니다.\n", memberId);
			return;
		}
		for(int i = ((int) id)-1; i < sequence; i++) {
			member[i] = member[i+1];
		}
		sequence--;
		System.out.println("회원정보 삭제가 완료되었습니다.\n");
	}
	
	public void print() {
		
		if (sequence == 0) {
			System.out.println("저장된 동물 정보가 없습니다.\n");
			return;
		}
		
		System.out.println("<< 전체 회원 동물 수 : " + sequence + " >>");
		for(int i=0; i<sequence; i++) {
			if(member[i] != null) {
				member[i].showInfo();
			}
		}
	}
	
	public void clearStore() {
		for(int i=0; i<sequence; i++) {
			if(member[i] != null) {
				member[i] = null;
			}
		}
		sequence = 0;
	}
}
		
