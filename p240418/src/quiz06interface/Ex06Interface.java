/*
 * [문제]
 * Vehicle의 모든 자식이 take()를 오버라이딩하도록
 * vehicle type을 interface로 변경하시오. // ex06과 동일한 결과
 * 
 */

package quiz06interface;

interface Vehicle {
//	int NUMBER;
	
//	public Vehicle(int number) {
//		this.number = number;
//	}
	public abstract void take();
}

class Car implements Vehicle{
	int number;
	
	public Car(int number) {
		this.number = number;
	}
	
	@Override
	public void take() {
		System.out.println("자동차 등록번호 : " + this.number);
		System.out.println("자동차가 고속도로를 달립니다.");
	}
}

class Yacht implements Vehicle {
	int number;
	
	public Yacht(int number) {
		this.number = number;
	}
	
	@Override
	public void take() {
		System.out.println("요트 등록번호 : " + this.number);
		System.out.println("요트가 한강 위를 떠다닙니다.");
	}
}

public class Ex06Interface {

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
