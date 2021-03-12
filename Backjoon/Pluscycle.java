package Backjoon;

import java.util.Scanner;

public class Pluscycle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		int cycle = N;
		
		while(true) {
			
			N = ((N%10)*10) + (((N/10) + (N%10))%10);
			count++;
			
			if(cycle == N) {
				break;
			}
		}
		
		System.out.println(count);
	}

}
