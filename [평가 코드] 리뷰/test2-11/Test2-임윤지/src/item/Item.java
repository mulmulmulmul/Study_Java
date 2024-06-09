/*
 * [정은경 코드리뷰]
 * 
 */
// Item 생성자 - id : int // itemName : String // price : Integer // quantity : int
// showinfo를 통해 멤버변수 값 출력 (void)

package item;

public class Item {
	
	private int id;
	private String itemName;
	private Integer price;
	private int quantity; 
	
	// 생성자 생성 
	public Item(String itemName, Integer price, int quantity) { 
		
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void showItemInfo() {
		System.out.println("id >> " + this.id);
		System.out.println("itemName >> " + this.itemName);
		System.out.println("price >>" + this.price);
		System.out.println("quantity >>" + this.quantity);
	}
	
	public void setName(String newitemName) {
		this.itemName = newitemName;
	}
	
	public void setPrice(Integer newPrice) {
		this.price = newPrice;
	}

	public void setQuantity(int newquantity) {
		this.quantity = newquantity;
	}

	public void delete() { //delete() 메소드는 필요하지 않아 보입니다.	
		
	}
		
}


