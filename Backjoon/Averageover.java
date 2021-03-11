package Backjoon;

import java.util.Scanner;

public class Averageover {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int N = sc.nextInt();
		int smallarr[] = new int[N];
		
		int bigarr[] = new int[C];
		
		double sum = 0;
		
		for(int i = 0 ; i < C; i++) {
			
			for(int j = 0; j < N; j++) {
				int val = sc.nextInt();
				smallarr[j] = val;
				sum += val;
				
			}
			double avg = (sum / N);
			double count = 0;
			
			for(int j =0; j < N; j++) {
				if(smallarr[j] > avg) {
					count++;
				}
			}
			System.out.println((count/N)*100.0);
		}
		
	}

}
