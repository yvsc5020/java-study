package good;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("이동 횟수 지정  : ");
		int num = sc.nextInt();
		
		for(int j = 0; j < num; j++) {
			int tmp = arr[n - 1];
			for(int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = tmp;
		}
		
		for(int i = 0; i < n; i++) {
			if(i + 1 == n) {
				System.out.print(arr[i]);
			} else { System.out.print(arr[i] + ", "); }
		}

	}

}
