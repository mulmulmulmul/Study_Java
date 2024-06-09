// [정은경 코드리뷰]

package item;

public class Item {

	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	public Item(int id, String itemName, Integer price, int quantity ) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	 public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	 public void showInfo() {
		System.out.print(this.id + "   "+this.itemName + "   " + this.price + "    " + this.quantity);
		System.out.println();
	 }


}


