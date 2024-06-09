
/*
 * 
[primitive type] =============================
byte - short - char - int - long
float - double
boolean

[reference type] wrapper class ===============
Byte - Short - Character - Integer - Long
Float - Double
Boolean

 * (( 자동 형변환 )) 박싱과 언박싱이 자동으로 이뤄진다.
              boxing
   기본형	   —--->	참조형
primitive type ←—--	reference type
	          unboxing
 * 
 */

public class WrapperClass {

	public static void main(String[] args) {

		int num = 5;
		Integer num2 = 5; // Integer 객체의 필드에 5가 저장된다.(boxing) 객체에는 메소드들도 있고 그 중에 toString도 있다 
		System.out.println(num);
		System.out.println(num2); 
		System.out.println(num2.toString());  
		
		num2 = num;
		Integer num3 = num; // 기본타입과 참조타입 사이에서 자동 형변환 
		int num4 = num3; // Integer형 객체 필드에 저장된 값을 꺼내서 기본타입에 저장 (unboxing)

		Integer num5 = new Integer(7);
		Integer num6 = Integer.valueOf(7);
	}

}
