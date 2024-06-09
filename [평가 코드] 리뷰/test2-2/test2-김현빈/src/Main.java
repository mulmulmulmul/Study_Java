/*[정은경 코드리뷰]
 * 수고하셨습니다.
 */
import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	private static ItemBusinessRule business = new ItemBusinessRule();

	public static void main(String[] args) {
		int choice; 

		outer: while (true) {
			ItemView.showMenu();
			choice = ItemView.INPUT.nextInt();

			switch (choice) {
			case 1:
				business.save();
				break;
			case 2:
				business.find();
				break;
			case 3:
				business.update();
				break;
			case 4:
				business.delete();
				break;
			case 5:
				business.findAll();
				break;
			case 6:
				business.clearStore();
				break;
			case 7:
				System.out.println("++ 프로그램을 종료합니다. ++");
				break outer;
			default:
				System.out.println("잘못입력했습니다. 다시 입력해주세요!");
			}

		}
		ItemView.INPUT.close();
	}

}
