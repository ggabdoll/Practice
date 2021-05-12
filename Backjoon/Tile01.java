package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile01 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(Tile(N));
		
		
	}
	
	public static int Tile(int t) {
		
		if(t == 1) {
			return 1;
		}
	    if(t == 2) {
	    	return 2;
	    }
	    
	    int val1 = 1;
	    int val2 = 2;
	    int sum = 0;
	    
	    for(int i =2 ; i < t ; i++) {
	    	sum = (val2 + val1) % 15746;
	    	val1 = val2;
	    	val2 = sum;
	    }
	    
	    return sum;
	}

}
