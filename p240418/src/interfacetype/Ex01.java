package interfacetype;

interface A {}

interface B {}

interface C extends A {} // 같은 타입이면 멤버가 늘어나는 확장

interface D extends A, B {} // 다중 상속 허용

class E {}
class F {}
class G extends E {}
//class H extends E, F {} // Error! 다중 상속 허용 안 함 
//class I extends A {} // Error! interface 상속 시 implement  
class J implements A {} 

class K extends E implements A, B {} 

//class L implements A extends E {} // Error! 상속은 타입이 같은 클래스가 먼저 와야 한다 (멤버 확장 -> 추상클래스)

//interface M implement E {} // Error! 인터페이스는 클래스를 부모로 두지 않는다.
//interface M extends E {} // Error! 인터페이스는 클래스를 부모로 두지 않는다.

public class Ex01 {

}
