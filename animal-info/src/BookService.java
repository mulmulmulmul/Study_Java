
public class BookService {

	private static final Animal[] member = new Animal[100];
	private int sequence;
	private long id = 1;
	
	
	public void input() {
		System.out.println("이름과 나이를 입력하세요... ");
		System.out.print("이름: ");
		String name = MenuView.INPUT.next();
		System.out.print("나이 : ");
		int age = MenuView.INPUT.nextInt();
		
		member[sequence++] = new Animal(Long.valueOf(id++), name, age);
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
		System.out.println("[조회]회원 아이디 입력... ");
		Long id = MenuView.INPUT.nextLong();
		
		Animal animal = findById(id);
		
		if(animal == null) {
			System.out.printf("아이디가 %d인 회원이 없습니다.\n\n", id);
			return;
		}
		animal.showInfo();
		System.out.println("회원 정보 조회가 완료되었습니다.\n");
	}
	
	public void update() {
		System.out.println("[수정]회원 아이디 입력... ");
		Long id = MenuView.INPUT.nextLong();
		
		Animal animal = findById(id);
		
		if(animal == null) {
			System.out.printf("아이디가 %d인 회원이 없습니다.\n\n", id);
			return;
		}
		System.out.print("이름과 나이를 입력하세요... ");
		String name = MenuView.INPUT.next();
		int age = MenuView.INPUT.nextInt();
		
		animal.setName(name);
		animal.setAge(age);
		System.out.println("회원 정보 수정이 완료되었습니다.\n");
	}
	
	private int findIndex(Long id) {
		for(int i = 0; i < sequence; i++) {
			if(member[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public void delete() {
		System.out.println("[삭제] 회원 아이디 입력... ");
		Long id = MenuView.INPUT.nextLong();
		
		Animal animal = findById(id);
		int index = findIndex(id);
		
		if(animal == null) {
			System.out.println("해당 회원 정보가 없어서 삭제는 진행하지 않습니다.\n\n");
			return;
		}
		
		for(int i = index; i < sequence; i++) {
			member[i] = member[i + 1];
		}
		sequence--;
		System.out.printf("%d번 회원 정보가 삭제되었습니다.\n", id);
	}
	
	public void print() {
		System.out.printf("<< 전체 회원 동물 수 : %d >>\n", sequence);
		
		if (sequence == 0) {
			System.out.println("저장된 고객 정보가 없습니다.\n");
		}
		for(int i = 0; i < sequence; i++) {
			if(member[i] != null) {
				member[i].showInfo();
			}
		}
	}
	
	public void clearStore() {
		if (sequence == 0) {
			System.out.println("저장된 고객 정보가 없습니다.\n");
		}
		for(int i = 0; i < sequence; i++) {
			if(member[i] != null) {
				member[i] = null;
			}
		}
		System.out.println("모든 고객 정보가 삭제되었습니다.\n");
		sequence = 0;
	}
}
