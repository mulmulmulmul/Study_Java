//import book.BookManager;
//import book.Menu;
///*
// * [과제]
// * 1) 입력
// * 	 : 이름 입력 후, 존재하는 이름이면 '이미 저장된 이름입니다'를 출력
// * 
// * 2) 수정
// * 	 : 이름과 나이를 수정
// * 
// * 3) 삭제
// * 	 : 삭제 시, 삭제 여부를 확인
// */
//public class AnimalBook {
//	
//	private static BookManager manager = new BookManager();  
//	
//	public static void main(String[] args) {
//		
//		while(true) {
//			
//			Menu.show(); // static 메서드 - 인스턴스 생성 불필요
//			
//			int userValue = BookManager.input.nextInt();
//			
//			switch (userValue) {
//			case 1:
//				manager.inputData();
//				break;
//			case 2:
//				manager.searchData();
//				break;
//			case 3:
//				manager.updateData();
//				break;
//			case 4:
//				manager.deleteData();
//				break;
//			case 5:
//				manager.showBook();
//				break;
//			case 6:
//				System.out.println("++ 프로그램을 종료합니다. ++");
//				return;
//			}
//			
//		}
//		
//	}
//
//}
