/*
 * 1. 랜덤 크기의 배열 RacdomArr 을 생성하시오 max 10
 * 2. 생성된 배열에 각각 다른 값을 대입하시오3. 
 * 3. 데이터로 총합, 평균, 최소값, 최대값을 구하시오
 * 
 * 생성된 배열 arr[]의 크기는 + randomArr.length + 입니다
 * INJECT >> 1 
 * 총합
 */

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {

		int length = (int)(Math.random()*10)+1;
		int[] randomArr = new int[length];
		int index = 0; 
		
		System.out.println("생성된 배열 RandomArr의 크기는 " + length + "입니다.");
		
		Scanner input = new Scanner(System.in);
		
		while(index < length) {
			System.out.print("INJECT >> ");
			int num = input.nextInt();

			randomArr[index++] = num;
		}
		
		int sum = 0;
		float avg = 0.0F;
		int min = randomArr[0];
		int max = 0;
		
		for(int element: randomArr) {
			sum += element;
		}
		
		for(int element: randomArr) {
			avg = (float)sum / length;
		}
		
		for(int element: randomArr) {
			if(element < min) {
				min = element;
			}
		}
		
		for(int element: randomArr) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.printf("총합 : %d, 평균 : %f, 최소값 : %d, 최대값 : %d", sum, avg, min, max);
	}

}
