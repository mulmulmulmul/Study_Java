package array;

import java.util.Scanner;

public class Arrayscores {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner input = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = input.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = input.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0;i<studentNum;i++) {
				System.out.print("score[" + i + "] > ");
				scores[i] = input.nextInt(); // 입력값을 배열 요소에 바로 저장
				}
			} else if(selectNo == 3) {
				for(int i=0;i<studentNum;i++)
				System.out.println("scores[" + i + "] > " + scores[i]);
			} else if(selectNo == 4) {
				int max=0;
				int sum=0;
				double avg = 0.0;
				for(int i=0;i<studentNum;i++) {
					max = (max<scores[i])?scores[i]:max;
//					if(max<scores[i]) // max값 구하는 식 -> 삼항연산자로 출력 가능
//						max = scores[i];
						sum += scores[i];
				}
				avg = (double)sum / studentNum; // 피연산자가 모두 int형이므로 둘 중 하나 또는 둘 다 double로 형변환
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}