package good;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				sum = 0;
				for(int k = i; k <= j; k++) {
					sum += arr[k];
				}
				
				if(sum > max) {
					max = sum;
				}
			}
		}
		
		System.out.println("Max is " + max);

	}

}
