
public class CastingEx01 {
	public static void main(String[] args) {
		/**
		 * [형변환] ==================
		 */
		
		int n1 = 9;
		int n2 = 2;
		System.out.println("n1/n2 = " + n1/n2); // = 4
		System.out.println("n1/n2 = " + n1/(float)n2); // = 4.5
		System.out.println("n1/n2 = " + (float)(n1/n2)); // =4.0
	}
}
