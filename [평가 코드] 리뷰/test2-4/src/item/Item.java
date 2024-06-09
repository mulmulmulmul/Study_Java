package item;

public class Item {
	
	private int id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	
	//멤버메소드
	public Item(int id, String itemName, Integer price, int quantity) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setItemName (String itemName) {
		this.itemName = itemName;
	}
	
	public void setPrice (Integer price) {
		this.price = price;
	}
	
	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	
	public int getId () {
		return id;
	}
	
	public String getItemName (String itemName) {
		return itemName;
	}
	
	public Integer getPrice (Integer price) {
		return price;
	}
	
	public int getQuantity (int quantity) {
		return quantity;
	}
	
	//생성자 5.상품전체조회 => 기능추가해야하는거,, 1. 상품id 올라가게하기 반복될때마다.(for문을써야할까)
 	public void showInfo() {
		System.out.println();
		System.out.println(this.id + " " + this.itemName + " " +  this.price + " " +  this.quantity);
		
	}
	

}
