/*
 * [정은경 코드리뷰]
 * 메인 메소드에서 scanner 메모리해제를 하지 않았습니다.
 * 수고하셨습니다.
 */

import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	private static ItemBusinessRule Buyer = new ItemBusinessRule();

	public static void main(String[] args) {
		
		int answer; 
		
		view:
		while(true) {
			ItemView.showMenu();
			answer = ItemView.INPUT.nextInt();
			
			switch(answer) {
				case 1:
					Buyer.save();
					break;
				case 2:
					Buyer.find();
					break;
				case 3:
					Buyer.update();
					break;
				case 4:
					Buyer.delete();
					break;
				case 5:
					Buyer.findAll();
					break;
				case 6:
					Buyer.clearStore();
					break;
				case 7:
					System.out.println("프로그램을 종료 합니다.");
					break view;
				default:
					System.out.println("1~7 사이의 숫자를 입력해 주세요.");
			}
		}
	}
}
