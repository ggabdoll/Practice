package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliverSuger {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		if (N % 5 == 0) {
			System.out.println(N / 5);
		
		}else if (N % 5 !=0 && N > 6) {
			int small = (N%5);
			
			
			if(small%3 == 0) {
				
				System.out.println((N%5) + (small/3));
			
			}else {
				System.out.println(-1);
			}
			
		}
		
//		if(N<=6 && N%3 == 0) {
//			System.out.println(N/3);
//		}else if(N <=6 && N%3 != 0) {
//			System.out.println(-1);
//		}
		}

	}


