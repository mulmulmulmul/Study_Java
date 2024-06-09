/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */
import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	public static ItemBusinessRule ir = new ItemBusinessRule();

	public static void main(String[] args) {
		int answer=0;
		
		while(true) {
			ItemView.showMenu();
			answer=ItemView.INPUT.nextInt();
			
			if(answer==1) { // 조건식이 여러개이므로 switch문으로 작성하시면 더 깔끔할 것 같습니다.
				ir.save();
			} else if (answer==2) {
				ir.find();
			} else if (answer==3) {
				ir.update();
			} else if (answer==4) {
				ir.delete();
			} else if (answer==5) {
				ir.findAll();
			} else if (answer==6) {
				ir.clearStore();
			} else if (answer==7) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else {
				System.out.print("다시 입력해 주세요...");
			}
		}
		
		ItemView.INPUT.close();
	}
}
