package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ShearchDemcial {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean tf = true;
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10000;
		
		for(int i = M; i <= N; i++) {
			if(i == 1) {
				tf = false;
			}
			
			for(int j = 2; j<i; j++) {
				
				if(i%j==0) {
					tf = false;
				}
			}
			if(tf == true) {
				sum += i; 
				if(min>i) {
					min = i;
					}
			}
			tf = true;
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
			
		}
	}

}
