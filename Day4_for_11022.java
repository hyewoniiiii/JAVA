package Day4;

import java.util.Scanner;

public class B11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, A + B);
		}
		
		sc.close();
	}

}
