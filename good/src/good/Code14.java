package good;

import java.util.Scanner;

public class Code14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt, tmp;
		
		int[] data = new int[n];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		sc.close();
		
		do{
			cnt = 0;

			for(int i = 0; i < n - 1; i++) {
				if(data[i] < data[i + 1]) {
					tmp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = tmp; 
				}
				else {
					cnt++;
				}
			}
			
		}while(cnt < n - 1);
		
		for(int i = 0; i < n; i++) {
			if(i + 1 == n) {
				System.out.print(data[i]);
			} else { System.out.print(data[i] + " "); }
		}
	}
}
