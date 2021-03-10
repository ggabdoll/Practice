package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double arr[] = new double[sc.nextInt()];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		
		sc.close();
		
		double plus = 0;
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length; i++) {
			plus += (arr[i]/arr[arr.length-1])*100;
		}
		
		System.out.println(plus/arr.length);
	}
}
