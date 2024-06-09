import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	private static ItemBusinessRule itemRule = new ItemBusinessRule(); // 메모리에 객체 생성 미리 올려둠
	
	public static void main(String[] args) {
		outer:
		while(true) {
			
			ItemView.showMenu();
			int user = ItemView.INPUT.nextInt();
			
			switch(user) {
			case 1:
				itemRule.save();
				break;
			case 2:
				itemRule.find();
				break;
			case 3:
				itemRule.update();
				break;
			case 4:
				itemRule.delete();
				break;
			case 5:
				itemRule.findAll();
				break;
			case 6:
				itemRule.clearStore();
				break;
			case 7:
				System.out.println("++프로그램 종료++");
				break outer;
			}
		}       
		ItemView.INPUT.close(); 
	}      

}
