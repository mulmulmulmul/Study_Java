/*
 * [정은경 코드리뷰]
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
	public int getId() {
		return id;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void showInfo() { //문제에서 제시한 출력문구와 일치시키는 게 좋을 것 같습니다.	
		System.out.print("id >>" + this.id);
		System.out.print("itemName >>" + this.itemName);
		System.out.print("price >>" + this.price);
		System.out.print("quantity >>" + this.quantity);
	}
}
