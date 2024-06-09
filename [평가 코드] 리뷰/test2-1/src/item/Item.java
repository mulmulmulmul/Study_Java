/*
 * [정은경 코드리뷰]
 * 멤버 순서는 일반적으로 필드 > 생성자 > 메소드 순으로 작성합니다.	
 */

package item;

public class Item {

	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	public Item(int id, String itemName, Integer price, int quantity) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item() {}
	
	public void showInfo() {
		System.out.println(id+"    "+itemName+"    "+price+"  "+quantity);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
