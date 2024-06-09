/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */

import item.ItemBusinessRule;
import item.ItemView;

public class Main {

    private static final ItemBusinessRule itemBusinessRule = new ItemBusinessRule();

    public static void main(String[] args) {

        quit:while(true) {
            ItemView.showMenu();
            int choice = ItemView.INPUT.nextInt();

            switch(choice) {
                case 1:
                    itemBusinessRule.save();
                    break;
                case 2:
                    itemBusinessRule.find();
                    break;
                case 3:
                    itemBusinessRule.update();
                    break;
                case 4:
                    itemBusinessRule.delete();
                    break;
                case 5:
                    itemBusinessRule.findAll();
                    break;
                case 6:
                    itemBusinessRule.clearStore();
                    break;
                case 7:
                    break quit;
            }
        }

        ItemView.INPUT.close();
    }
}
