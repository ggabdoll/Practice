package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class MultiplesAndFactors {

	public static void main(String[] args)throws IOException {
		
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int val1 = Integer.parseInt(st.nextToken());
			int val2 = Integer.parseInt(st.nextToken());
			
			if(val1 == 0 && val2 == 0) break;
			
			
			if(val2 % val1 == 0) {
				sb.append(f);
			
			}else if(val1 % val2 == 0){
				sb.append(m);
			
			}else {
				sb.append(n);
				
			}
		}
		
		System.out.println(sb);
		
	}

}
