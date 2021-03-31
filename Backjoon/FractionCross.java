package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionCross {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int cross_count = 1;
		int cross_sum =0; 
		
		while(true) {
			
			if(X <= cross_count + cross_sum) {
				
				if(cross_count % 2 != 0) {
					
					System.out.println((cross_count - (X-cross_sum-1)) + "/" + (X - cross_sum));
					
					break;
				
				}else {
					
					System.out.println( (X - cross_sum) + "/" + (cross_count - (X-cross_sum-1)));
				
					break;
				}
				
				
			}else {
				cross_sum += cross_count;
				cross_count++;
			}
		}
		
		
		
	}

}
