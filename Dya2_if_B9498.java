import java.util.Scanner;

public class B9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score > 89) {
			System.out.println("A");
		}
		else if(79 < score && score < 90) {
			System.out.println("B");
		}
		else if(69 < score && score < 80) {
			System.out.println("C");
		}
		else if(59 < score && score < 70) {
			System.out.println("D");
		}
		else System.out.println("F");
		
		sc.close();
	}
}
