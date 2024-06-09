import area.CircleArea;
import per.CirclePerimeter;

public class Circle {

	public static void main(String[] args) {
		
		CirclePerimeter c1 = new CirclePerimeter(1.5); 
		System.out.println("반지름이 1.5인 원의 둘레 : " + c1.getPerimeter());
		
		CircleArea c2 = new CircleArea(1.5); 
		System.out.println("반지름이 1.5인 원의 둘레 : " + c2.getArea());
		
	}
}
