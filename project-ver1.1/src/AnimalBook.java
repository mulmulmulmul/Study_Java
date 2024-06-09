import book.BookManager;

public class AnimalBook {
	// private static - 외부 접근 x, 메모리에 먼저 할당
	private static BookManager manager = new BookManager(); 
	// 입력 버퍼 input stream 1개 할당 (공용) - 싱글톤 형태
	// 만들어진 버퍼를 참조변수로 사용
//	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
//		boolean isOperator = true;
//			
//		while(isOperator){
//			System.out.print("정보 입력할까요? (Y/N) ... ");
//			String userValue = BookManager.input.next();
//				
//			switch(userValue) {
//			case "YES": case "Yes": case "yes": case "Y": case "y":
//				manager.inputDate();
//				break;
//			case "NO": case "No": case "no": case "N": case "n":
//				manager.showBook();
//				isOperator = false;
//			}
//		}
		
		// 스위치가 아닌 while문 탈출하기 위해 레이블 붙여주기
		menu:
		while(true){
			System.out.print("정보 입력할까요? (Y/N) ... ");
			String userValue = BookManager.input.next().toUpperCase();
			
			switch(userValue) {
			// 
			case "YES": case "Y":
				manager.inputDate();
				break;
			case "NO": case "N":
				System.out.println("정보 입력을 종료합니다.\n");
				manager.showBook();
				break menu; 
			default: // 사용자가 잘못된 값 입력 시 알려주기
				System.out.println("Y/N 둘 중 하나를 입력하세요...");
			}
		}
		BookManager.input.close();
	}
	
}
