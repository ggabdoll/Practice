package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beltran {
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_fac();
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			int count = 0;
			
			for(int i = N +1; i<= 2*N; i++) {
				if(!prime[i]) count++;
			}
			
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static void get_fac() {
		
		prime[0] = prime[1] = true;
		
		for(int i =2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j< prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
