interface People {
    String name();
}

interface Action {
    String eat();
    String grab();
    String sale();
}

class Jelly {
    // [Jelly class] 젤리의 맛과 수량을 저장하는 클래스입니다.
    // 목적에 맞게 작성해주세요.
	private String plavor;
	private int count;
	
	public Jelly(String plavor, int count) {
		this.plavor = plavor;
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getplavor() {
		return plavor;
	}
}

class Me implements People, Action {
    // [Me class] 만들어진 interface를 상속받아 기능을 구현하시오.
    // Jelly 클래스를 적절히 사용하여 기능을 구현하시오.
    // [출력 형태]
    // 홍길동은(는) 망고맛젤리를 5개 먹습니다.
    // 홍길동은(는) 망고맛젤리를 5개 집습니다.
    // 홍길동은(는) 망고맛젤리를 5개 구매합니다.
	public static Jelly jelly = new Jelly("망고맛젤리", 5);
	
	@Override
	public String name() {
		return "홍길동";
	}
	
	@Override
	public String eat() {
		return name() + "은(는) " + jelly.getplavor() + "를 " + jelly.getCount() + "개 먹습니다.";
	}
	
	@Override
	public String grab() {
		return name() + "은(는) " + jelly.getplavor() + "를 " + jelly.getCount() + "개 집습니다.";
	}
	
	@Override
	public String sale() {
		return name() + "은(는) " + jelly.getplavor() + "를 " + jelly.getCount() + "개 구매합니다.";
	}
}

public class Second {
	public static Me me = new Me();
	
    public static void main(String[] args) {
    	
        // [main method] Me 클래스를 이용하여 프로그램이 실행될 수 있도록 코딩하십시오.
    	System.out.println(me.eat());
    	System.out.println(me.grab());
    	System.out.println(me.sale());
    }
}