package good;

import java.util.Scanner;

public class Code04 {
	public static void main(String[] args) {
		String index;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름과 나이와 성별(남, 여)을 입력해주세요 : ");
		index = sc.nextLine();
		sc.close();
		
		String[] arr = index.split(" ");

		
		System.out.printf("이름 : %s, 나이 : %s살, 성별 : %s성", arr[0], arr[1], arr[2]);
	}
}
