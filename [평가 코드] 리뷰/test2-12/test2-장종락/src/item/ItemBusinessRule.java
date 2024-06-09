/*
 * [정은경 코드리뷰]
 * 수고하셨습니다.
 */

package item;

public class ItemBusinessRule {

    private static final Item[] store = new Item[100];
    private static int sequence;
    private int itemId = 1;

    public void save() {
        System.out.print("상품명, 가격, 수량을 순서대로 입력하세요... ");
        String itemName = ItemView.INPUT.next();
        int price = ItemView.INPUT.nextInt();
        int quantity = ItemView.INPUT.nextInt();

        store[sequence++] = new Item(itemId++, itemName, price, quantity);

        System.out.println("상품 정보가 저장되었습니다.\n");
    }

    private Item findById(int itemId) {
        for(Item item : store) {
            if(item != null && item.getId() == itemId) {
                return item;
            }
        }

        return null;
    }

    public void find() {
        System.out.print("조회를 원하는 아이디를 입력하세요... ");
        int itemId = ItemView.INPUT.nextInt();

        Item item = findById(itemId);

        if(item == null) {
            System.out.printf("아이디가 %d인 상품이 없습니다.%n%n", itemId);
            return;
        }

        item.showInfo();
        System.out.println("상품 조회가 완료되었습니다.\n");
    }

    public void update() {
        System.out.print("수정하기 원하는 아이디 입력하세요... ");
        int itemId = ItemView.INPUT.nextInt();

        Item item = findById(itemId);

        if(item == null) {
            System.out.printf("아이디가 %d인 상품이 없습니다.%n%n", itemId);
            return;
        }

        System.out.print("가격, 수량을 입력하세요... ");
        int price = ItemView.INPUT.nextInt();
        int quantity = ItemView.INPUT.nextInt();

        item.setPrice(price);
        item.setQuantity(quantity);

        System.out.println("상품 수정이 완료되었습니다.\n");
    }

    public void delete() {
        System.out.print("삭제를 원하는 아이디 입력하세요... ");
        int itemId = ItemView.INPUT.nextInt();

        Item item = findById(itemId);

        if(item == null) {
            System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
            return;
        }

        int index = item.getId() - 1;

        for(int i = index; i < sequence; i++) {
            store[i] = store[i + 1];
        }
        sequence--;

        System.out.printf("%d번 상품이 삭제되었습니다.%n", itemId);
        System.out.println("상품 삭제가 완료되었습니다.\n");
    }

    public void findAll() {		// sequence == 0 을 먼저 처리해주고 return으로 종료시킨 후, 나머지 상품 정보를 출력하는 방법도 좋아 보입니다.
        if(sequence > 0) {
            for(Item item : store) {
                if(item == null) {
                    System.out.println();
                    break;
                }

                item.showInfo();
            }
        } else {
            System.out.println("저장된 상품 정보가 없습니다.\n");
        }


    }

    public void clearStore() {
        for(int i = 0; i < sequence; i++) {
            store[i] = null;
        }

        sequence = 0;

        System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
    }
}
