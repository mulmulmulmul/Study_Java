 /*
 * [정은경 코드리뷰]
 */

package item;

import java.util.Scanner;

public class ItemBusinessRule { //1. 문제에서 제시한 필드 구성과 다릅니다.
		private final int MAX_CNT = 100; 
		private Item[] store = new Item[MAX_CNT];		
		private int sequence  = 0;
		
		
		
		
		public void save() { // 2. 상품을 저장할 때 id는 사용자에게 입력받지 않고 자동으로 부여됩니다. 필드에 int형 변수 id를 선언해주고 배열에 저장할 때 1씩 증가시켜주는 것이 좋습니다.
			System.out.println("<< id를 입력하세요.. >>");
			System.out.println("id");
			int id = ItemView.input.nextInt();
			
			System.out.println("상품명");
			String itemName = ItemView.input.next();
			
			System.out.println("가격");
			Integer price =ItemView.input.nextInt();
			
			System.out.println("수량");
			int quantity = ItemView.input.nextInt();
			
			System.out.println("상품 입력이 완료되었습니다.");
			
			store[sequence++] = new Item(id, itemName, price, quantity);
			System.out.println("상품이 저장 되었습니다.");
			
		}
		
		private void findByid(int itemid) { // 3. findByid 메소드가 구현되지 않았습니다.	
			System.out.println("조회할 상품을 입력하세요.");
			int id = ItemView.input.nextInt();
			
			//int check = search(itemid);
			
//				if(check != -1) {
//					store[check].showInfo();
//				}
		}
		
		public void find() {
			// 4. find()메소드가 구현되지 않았습니다.
		}
		public void update() {
			System.out.println("수정할 상품을 입력하세요.");
			String itemName = ItemView.input.next();
			
			int check = search(itemName);
			
			//if(check =! -1) {
//				System.out.println(store[check].getItemName());
//			}
			System.out.println("수정이 완료 되었습니다.");
		}
		public void delete() { // 5. 메소드가 구현되지 않았습니다.
			System.out.println("삭제할 상품을 입력하세요");
			
			System.out.println("삭제가 완료 되었습니다.");
		}
		public void findAll() { // 6. 메소드가 구현되지 않았습니다.
			System.out.println("전체 상품을 조회합니다.");
			
		}
		public void clearStore() { 
			System.out.println("저장 된 상품을 모두 삭제합니다."); // 7. 배열에 요소값이 저장되어 있지 않을 때 삭제를 진행해야 합니다. (if문 사용)
		}
		
		public int search(String itemName) {
			for(int i=0; i<sequence; i++) {
				if(store[i].equals(itemName)) {
					return i;
				}
			}
			return -1;
		}
}
