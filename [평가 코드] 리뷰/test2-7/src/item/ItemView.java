package item;

import java.util.Scanner;

public class ItemView {
	
	public final static Scanner INPUT = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("<< 상품 관리 >>");
		System.out.println("1. 상품 저장");
		System.out.println("2. 상품 조회");
		System.out.println("3. 상품 수정");
		System.out.println("4. 상품 삭제");
		System.out.println("5. 상품 전체 조회");
		System.out.println("6. 상품 전체 삭제");
		System.out.println("7. 프로그램 종료");
	}
}
