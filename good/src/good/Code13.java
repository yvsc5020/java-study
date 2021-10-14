package good;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long num = 0;
		long maxP = 0;
		boolean truePrime = true;
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				num = 0;
				for (int k = i; k <= j; k++) {
					num = num * 10 + arr[k];
				}

				truePrime = true;
				for(int p = 2; p*p <= num && truePrime; p++) {
					if(num % p == 0) {
						truePrime = false;
					}
				}
				
				if(truePrime && num > 1 && num > maxP) {
					maxP = num;
				}
			}
		}
		
		if(maxP > 0) {
			System.out.println(maxP);
		}
		
		else {
			System.out.println("소수가 없습니다.");
		}
		
	}

}
