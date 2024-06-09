/*
 * [문제]
 * Vehicle의 모든 자식이 take()를 오버라이딩하도록
 * vehicle type을 abstract class로 변경하시오.
 * 
 */

package quiz06abstract;

abstract class Vehicle {
	private int number;
	
	public int getNumber() {
		return number;
	}
	
	public Vehicle(int number) {
		this.number = number;
	}
	
	public abstract void take();
}

class Car extends Vehicle{
	public Car(int number) {
		super(number);
	}
	
	@Override
	public void take() {
		System.out.println("자동차 등록번호 : " + super.getNumber());
		System.out.println("자동차가 고속도로를 달립니다.");
	}
}

class Yacht extends Vehicle {
	public Yacht(int number) {
		super(number);
	}	
	
	@Override
	public void take() {
		System.out.println("요트 등록번호 : " + super.getNumber());
		System.out.println("요트가 한강 위를 떠다닙니다.");
	}
}

public class Ex06AbstractClass {

	public static void main(String[] args) {

		Vehicle[] myVehicle = new Vehicle[2];
		myVehicle[0] = new Car(8586);
		myVehicle[1] = new Yacht(6789);
		
		info(myVehicle[0]);
		info(myVehicle[1]);
		
	}
	
	public static void info(Vehicle vehicle) {
		// [문제] 메소드 호출
//		vehicle.drive();
//		vehicle.sail();
		vehicle.take();
		System.out.println();
	}

}
