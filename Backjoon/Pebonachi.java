package Backjoon;

import java.util.Scanner;

public class Pebonachi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		sc.close();
		
		System.out.println(Pebonachi.pebo(p));
		
	}

	public static int pebo(int p) {
		
		if(p == 0) {
			return 0;
		}else if(p == 1) {
			return 1;
		}else {
			return pebo(p-1) + pebo(p-2);
		}
	}
}
