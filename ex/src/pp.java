
abstract class Vehicle {

	public Vehicle() {}
	
	public abstract void run();

}

class Car extends Vehicle {
	@Override
	public void run() {
		System.out.println("Car run");
	}
	
	public void driver() {
		System.out.println("minsu");
	}
}

class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("Bus run");
	}
	
	public void age()	{
		System.out.println("25년");
	}
}

public class pp {
	
	public static void main(String[] args) {
	
	Vehicle v1 = new Car(); // vehicle 상속받는 car 객체
	Vehicle v2 = new Bus(); // vehicle 상속받는 bus 객체
	
//	Car c1;
//	Bus b1;
	
	System.out.println(v1 instanceof Car); 
	System.out.println(v2 instanceof Bus);
	
	System.out.println("--------------------------");
	v1.run();
	v2.run();
	
	System.out.println("--------------------------");
	Car c2 = ((Car)v1); // Parent 클래스로 다형성 구현된 Car 객체를 다시 Car 클래스로 형변환
	c2.run();
	c2.driver();
	
	System.out.println("--------------------------");
	Bus b2 = ((Bus)v2); // Parent 클래스로 다형성 구현된 Bus 객체를 다시 Bus 클래스로 형변환
	b2.run();
	b2.age();
	
	}
	
}