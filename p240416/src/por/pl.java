package por;

import por.Thing.Animal;

class Thing {

@Override
public String toString() {
	return "나는 사물이다";
}

class Animal{
	@Override
	public String toString() {
		return "나는 동물이다";
	}
}



public class pl {

	Thing thing = new Thing();
	
	Animal animal = new Animal();

	
	
}
