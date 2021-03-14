package Backjoon;

import java.util.Scanner;

public class StarStar {
	static char[][] arr;

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		arr = new char[N][N];
		

	}
	
	public static void star(int x, int y, int N, boolean ok) {
		
		if(ok) {
			for(int i = x; i<x+N; i++) {
				for(int j =y; j<j+N; j++) {
					arr[i][j] = ' ';
				}
			}
			}
		
	}

}
