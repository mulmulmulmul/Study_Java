package interfacetype;

class Vehicle {
	private int number;
	
	public int getNumber() {
		return number;
	}
	
	public Vehicle(int number) {
		this.number = number;
	}
}

class Car extends Vehicle{
//	private int carNumber;
//	
//	public Car(int carNumber) {
//		this.carNumber = carNumber;
//	}
	
	public Car(int number) {
		super(number);
	}
	
	public void drive() {
		System.out.println("자동차 등록번호 : " + getNumber());
		System.out.println("자동차가 고속도로를 달립니다.");
	}
}

class Yacht extends Vehicle {
//	private int yachtNumber;
//	
//	public Yacht(int yachtNumber) {
//		this.yachtNumber = yachtNumber;
//	}
	
	public Yacht(int number) {
		super(number);
	}	
	
	public void sail() {
		System.out.println("요트 등록번호 : " + getNumber());
		System.out.println("요트가 한강 위를 떠다닙니다.");
	}
}

public class Ex06 {

	public static void main(String[] args) {

		Vehicle[] myVehicle = new Vehicle[2];
		myVehicle[0] = new Car(8586); // vehicle 타입으로 다형성 구현된 car 객체
		myVehicle[1] = new Yacht(6789); // vehicle 타입으로 다형성 구현된 요트 객체
		
		info(myVehicle[0]);
		info(myVehicle[1]);
		
	}
	
	public static void info(Vehicle vehicle) {
		
		if (vehicle instanceof Car) {
			((Car) vehicle).drive();
		} else if (vehicle instanceof Yacht) {
			((Yacht) vehicle).sail();
		}
		
		System.out.println();
		// [문제] 메소드 호출
//		vehicle.drive(); // 자동차 등록번호 : 
						 // 자동차가 고속도로를 달립니다.
//		vehicle.sail();  // 요트 등록번호 : 
						 // 요트가 한강 위를 떠다닙니다.
	}

}
