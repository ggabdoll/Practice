package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		br.close();
		
		int day = 0;
		int length = 0;
		
		for(int i =0; i < 1000000000; i++) {
			
			length += (A-B);
			int today = length + A;
			day++;
			
			if(today >= V) {
				break;
			}
		}
		System.out.println(day+1);
	}

}
