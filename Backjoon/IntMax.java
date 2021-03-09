package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class IntMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int i =0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(b);
		
		int b1 = b[0];
		for(int i : b) {
		
		}
		System.out.println(b1 +" "+ b[a-1]);
	}

}
