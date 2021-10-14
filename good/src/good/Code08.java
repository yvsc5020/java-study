package good;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
		int min = 999999999;
		
		int[] data = new int[n];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		for(int i : data) {
			sum += i;
			if(max < i) {
				max = i;
			}
			if(min > i) {
				min = i;
			}
		}
		
		System.out.println("총합: " + sum);
		System.out.println("최대: " + max);
		System.out.println("최소: " + min);

	}

}
