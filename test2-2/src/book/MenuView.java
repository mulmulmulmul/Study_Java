package book;

import java.util.Scanner;

public class MenuView {

	public static final Scanner INPUT = new Scanner(System.in); 
	
	public static void showMenu() {
		System.out.printf("<< 동물병원 회원 정보 관리 >>\n1. 정보 저장\n2. 정보 조회\n3. 정보 수정\n4. 정보 삭제\n5. 정보 전체 출력\n6. 정보 전체 삭제\n7. 프로그램 종료\n");
		System.out.print("선택 : ");
	}
	
}
