package good;

import java.util.Scanner;

class Code02 {
	public static void main(String [ ] args) {
		int number = 123;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int input = sc.nextInt();
		sc.close();
		if(input == number) {
			System.out.println("Numbers match! :-)");

		} else {

			System.out.println("Numbers do not match! :-(");

		}
	}
}