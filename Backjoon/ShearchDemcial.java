package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ShearchDemcial {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			
			if(i == 2 || i != 1 && i%2 == 1) {
				sb.append(i);
			}
		}
		System.out.println(sum);
	}

}
