import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H == 0 && M < 45) {
			System.out.printf("23 %d", M + 15);
		}
		else if(H != 0 && M < 45) {
			System.out.printf("%d %d", H - 1, M + 15);
		}
		else System.out.printf("%d %d", H, M - 45);
		
		sc.close();
	}
}
