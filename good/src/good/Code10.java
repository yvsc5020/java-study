package good;

public class Code10 {

	public static void main(String[] args) {
		int[] sosu = new int[100];
		int x = 0;
		
		for(int i = 2; i <= 100; i++) {
			boolean Prime = true;
			for(int j = 2; j*j < i && Prime == true; j++) {
				if(i % j == 0) {
					Prime = false;
				}
			}
			if(Prime) {
				sosu[x] = i;
				x++;
			}
		}
		
		for(int i : sosu) {
			if(i != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
