import java.util.Scanner;
import book.BookManager;

public class AnimalBook {
	
	private static BookManager manager = new BookManager();  
	// private static - 외부 접근x, 메모리에 먼저 할당
	private static Scanner input = new Scanner(System.in);
	
	public Scanner getScanner() {
		return input;
	}
	
	public static void main(String[] args) {
		
			boolean isOperated = true;
			String userValue = "";
			
			while(isOperated)	{
				System.out.print("정보 입력할까요? (Y/N) ... ");
				userValue = input.next();
				
				switch(userValue) {
				case "YES": case "Yes": case "yes": case "Y": case "y":
					manager.inputData(input);
					break;
				case "NO": case "No": case "no": case "N": case "n":
					manager.showBook();
					isOperated = false;
				}
				
			}
			
	}
	
}
