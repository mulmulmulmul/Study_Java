/*
 *[정은경 코드리뷰]
 * 수고하셨습니다.
 */

import item.*;

public class Main {
	public static ItemBusinessRule item = new ItemBusinessRule();
	public static void main(String[] args) {
		int sc = 0;
		
		endlist:
		while(true) {
			ItemView.show();
			sc = ItemView.input.nextInt();
			
			if(sc == 1) { //  조건식이 여러개여서 if ~ else if문보다는 switch문을 활용하면 더 깔끔했을 것 같습니다.
				item.save();
			}else if(sc == 2) {
				//item.findByid; //findById 메소드는 Main에서 호출할 용도가 아니므로 명령어로 오지 않아야 합니다. 이후부터 사용자가 선택한 정수와 호출된 메뉴 번호가 일치하지 않습니다.
			}else if(sc == 3) {
				item.find();
			}else if(sc == 4) {
				item.update();
			}else if(sc == 5) {
				item.delete();
			}else if(sc == 6) {
				item.findAll();
			}else if(sc == 7) {
				item.clearStore();
				System.out.println("프로그램을 종료합니다.");
				break endlist;
			}
		}
		
		ItemView.input.close();
	}

}
