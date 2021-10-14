package good;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] grades = new int[5];
		int sum = 0, avg = 0;

		for (int i = 0; i < 5; i++) {
			grades[i] = sc.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < grades.length; i++) {
			System.out.println((i + 1) + ": " + grades[i] + "");
			sum += grades[i];
		}

		avg = sum / grades.length;
		System.out.println("ÃÑÁ¡=" + sum + ", Æò±Õ=" + avg);
	}

}
