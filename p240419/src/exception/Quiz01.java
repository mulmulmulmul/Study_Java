package exception;

import java.util.Scanner;

// [ 예외 클래스 정의 ]
// 1) Quiz01 class 내
//	  사용자에게 이름을 입력 받고, 출력하는 inputName() 정의 
// 입력 문구 - 이름을 입력하시오(2글자 이상 입력) >>>
//			   입력된 이름 : 
// 2) 이름이 한 글자만 입력되면, NameLengthException 예외 발생
// 3) 예외가 발생했을 때의 메시지는 잘못된 이름 입력
//    catch영역에 참조변수 출력 -> class명 : 잘못된 이름 입력
// 

class NameLengthException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NameLengthException() {
		super("잘못된 이름 입력");
	}
	
}

public class Quiz01 {

	public static void inputName() throws NameLengthException {
		Scanner input = new Scanner(System.in);
		
			System.out.print("이름을 입력하시오 (2글자 이상 입력) >>> ");
			
			String name = input.next();
			input.close();
			
			if(name.length() <= 1) {
				throw new NameLengthException();
			}
			
			System.out.println("입력된 이름 : " + name);
	}
	
	public static void main(String[] args) {
		
		try {
			inputName();
		} catch (NameLengthException e) {
			System.out.println(e);
		}
		
	}
	
}
