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
	
	public void setPrQu(Integer price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showInfo() {
		System.out.println(id+"	"+itemName+ "	"+ price+"	"+quantity);
	}
	

}
