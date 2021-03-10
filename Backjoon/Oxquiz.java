package Backjoon;

import java.util.Scanner;

public class Oxquiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr[] = new String[sc.nextInt()];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		
		for(int i =0; i<arr.length; i++) {
			int plus = 0;
			int sum = 0;
			
			for(int j =0; j<arr[i].length();j++) {
				arr[i].charAt(j);
				
				if(arr[i].charAt(j) == 'o') {
					plus ++;
				}else {
					plus = 0;
				}
				
				sum += plus;
			}
			
			System.out.println(sum);
		}
		
			
	}

}
