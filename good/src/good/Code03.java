package good;

import java.util.Scanner;

class Code03 {
	public static void main(String [ ] args) {
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�Է����ּ��� : ");
			String input = sc.nextLine();
			
			if(str.equals(input)) {
				System.out.println("���ڿ��� �����ϴ�.");
				break;

			} else { System.out.println("���ڿ��� �ٸ��ϴ�.\n"); }
			
		}while(true);
		
		sc.close();
	}
}