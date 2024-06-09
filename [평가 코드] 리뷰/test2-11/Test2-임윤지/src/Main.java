/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */
// 문제 : 사용자에게 메뉴 1~7의 정수 중 1개를 입력 받음
//        정수 7을 입력하지 않은 한, 계속 반복적으로 실행 

import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	private static ItemBusinessRule rule = new ItemBusinessRule();
	
	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
					
			ItemView.show();
			choice = ItemBusinessRule.input.nextInt();
			
			switch(choice) {
			
				case 1 :
					rule.save();
				break;
								
				case 2 :
					rule.find();
				break;
				
				case 3 :
					rule.update();
				break;
				
				case 4 :
					rule.delete();
				break;
				
				case 5 :
					rule.findAll();
				break;
				
				case 6 :
					rule.clearStore();
				break;
				
				default : // 문제에서 정수 7을 입력하면 프로그램 종료라고 했으니 case7로 작성하는 것이 더 좋을 것 같습니다.
					System.out.println("*** 프로그램을 종료합니다. ***");
				break;
				
			}	
		}
		// 여기에서 스캐너 자원해제가 필요합니다.
	}
}
