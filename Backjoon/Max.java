package Backjoon;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int count = 0;
		int max = arr[0];
		
		for(int i =0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int a = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				count = i+1;
				
			}
		}
		System.out.println(max +"\n" + count);
	}

}
