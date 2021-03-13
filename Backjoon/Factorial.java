package Backjoon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		
		sc.close();
		
		System.out.println(Factorial.recursion(f));
	}
	
	public static int recursion(int f) {
		
		if(f == 1) {
			return 1;
		}else {
			return f * recursion(f-1);
			}

	   
	}
}
