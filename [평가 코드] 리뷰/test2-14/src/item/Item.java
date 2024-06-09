package item;

public class Item {

	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	public Item() {}
	
	public Item(int id, String itemName, Integer price, int quantitiy) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantitiy;
		this.id = id;
	}
	
	public int incrementId() {
		return id += 1;
	}
	
	public int getId() {
		return id;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void showInfo() {
		System.out.println(id + "	" + itemName + "	" + price + "	" + quantity);
	}
	
}
