package wf;

public class While01 {

	public static void main(String[] args) {

		int random1;
		int random2;
		int sum;
		
		while(true) {
			random1 = (int)(Math.random()*6)+1;
			random2 = (int)(Math.random()*6)+1;
			System.out.println("(" + random1 + ", " + random2 + ")");
			sum = random1 + random2;
			
			if(sum==5) {
				break;
			}
		}
	}

}
