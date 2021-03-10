package Backjoon;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		int multiply = A * B * C;
		String abc = Integer.toString(multiply);
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < abc.length(); j++) {
				if((abc.charAt(j) - '0') == i) {
					count ++;
				}
			}
			System.out.println(count);
		}
	}

}
