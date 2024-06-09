// [정은경 코드리뷰]

import java.util.Scanner;

import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	
	private static ItemBusinessRule rule = new ItemBusinessRule();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 1. 스캐너 객체는 ItemView에서 이미 생성해줬으므로 여기서는 필요하지 않습니다.
		
	out: while(true) { 
			
		ItemView.showMenu();
		
		int answer = input.nextInt();
		
		switch(answer) { 
			case 1:
				rule.save(input);
				break;
			case 2:
				rule.find(input);
				break;
			case 3:
				rule.update(input);
				break;
			case 4:
				rule.delete(input);
				break;
			case 5:
				rule.findAll(input);
				break;
			case 6:
				rule.clearStore(input);
				break;
			default:
				break out;
			}
		}
		input.close();
	}
}

