package good;

import java.util.Scanner;

public class Code04 {
	public static void main(String[] args) {
		String index;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� ���̿� ����(��, ��)�� �Է����ּ��� : ");
		index = sc.nextLine();
		sc.close();
		
		String[] arr = index.split(" ");

		
		System.out.printf("�̸� : %s, ���� : %s��, ���� : %s��", arr[0], arr[1], arr[2]);
	}
}
