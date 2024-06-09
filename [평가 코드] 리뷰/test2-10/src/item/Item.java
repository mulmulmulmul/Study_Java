package item;

public class Item {
	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	
	
	
	
	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public Item(int id, String itemName, Integer price, int quantity ) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showInfo() {
		System.out.println(id +"\t"+ itemName +"\t"+ price +"\t"+ quantity);
		
	}
	
	

}
