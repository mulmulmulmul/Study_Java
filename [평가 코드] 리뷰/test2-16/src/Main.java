// [정은경 코드리뷰]
// 수고하셨습니다.

import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	public static ItemBusinessRule business = new ItemBusinessRule();
	
	public static void main(String[] args) {

		int choice = 0;
		
		outer:
			while(true) {
				
			ItemView.showMenu();
			choice =ItemView.input.nextInt();
			
			switch(choice) {
				case 1: // 저장
					business.save();
					break;
				case 2: // 조회
					business.find();
					break;
				case 3: // 수정
					business.update();
					break;
				case 4: // 삭제
					business.delete();
					break;
				case 5: // 전체조회
					business.findAll();
					break;
				case 6: // 전체 삭제
					business.clearAll();
					break;
				case 7: //프로그램 종료
					break outer;
			}
		}
		
	 ItemView.input.close();
	}

}
