package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixSixSix {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String six = "666";
		int i = 0;
		
		while(i < N){
			i++;
			if(i == (N-1)) {
				System.out.println(i + six);
				break;
			}else if(N==1) {
				System.out.println(six);
				break;
			}
		}
		
	}

}
