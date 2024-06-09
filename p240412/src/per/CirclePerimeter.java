package per;

class Test{
	public Test(){ // default 해도 되지만 일반적으로 붙여준다.
		System.out.println("생성자 Test() 실행 됨!"); 
	}
	
}

public class CirclePerimeter { 
	double rad;
	final double PI;
	
	public CirclePerimeter(double r) {
		rad = r;
		PI = 3.14;
		Test test = new Test();
	}
	
	public double getPerimeter() {
		return (rad*2)*PI;
	}
}


