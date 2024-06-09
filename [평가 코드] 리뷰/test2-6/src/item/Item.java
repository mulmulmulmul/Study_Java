package item;

public class Item {
	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
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

	public Item(int id, String itemName, Integer price, int quantity) {
		
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		
	}

	public Item(String itemName, Integer price, int quantity) {	}

	public void showInfo() {
		System.out.println("id >> " + id);
		System.out.println("itemName >> " + itemName);
		System.out.println("price >> " + price);
		System.out.println("quantity >> " + quantity);
	}
	
}
