package good;

import java.util.Scanner;

class Code03 {
	public static void main(String [ ] args) {
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("입력해주세요 : ");
			String input = sc.nextLine();
			
			if(str.equals(input)) {
				System.out.println("문자열이 같습니다.");
				break;

			} else { System.out.println("문자열이 다릅니다.\n"); }
			
		}while(true);
		
		sc.close();
	}
}