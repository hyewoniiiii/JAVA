package Day4

import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cycle = 0, add = N;
		
		while(true) {
			N = (N % 10) * 10 + ((N / 10 + N % 10) % 10);
			cycle++;
			
			if(N == add) break;
		}
		
		System.out.println(cycle);
    sc.close();
	}

}
