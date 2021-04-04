package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class SelectDemical {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		
		for(int i =0; i <T; i++) {
			int N = Integer.parseInt(st.nextToken());
			
			if(N==2) {
				count++;
				
			}else if(N!=1 && N%2 == 1 ) {
				count ++; 
			}
		}
		
		System.out.println(count);
	}

}
