package gun;

public class Gun {
		public int bullet;
		
		public Gun(int bnum) {
			bullet = bnum;
		}
		public void shoot() {
			System.out.println("BBANG!");
			bullet--;
		}
		
}
