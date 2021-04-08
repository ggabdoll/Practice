package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class FourthPoint {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] loc_1 =  br.readLine().split(" ");
		String[] loc_2 =  br.readLine().split(" ");
		String[] loc_3 =  br.readLine().split(" ");
		
		String x;
		String y;
        
		
		if(loc_1[0].equals(loc_2[0])){
        	x = loc_3[0];
		}
        
		
		else if (loc_1[0] == loc_3[0]) {
			x = loc_2[0];
		}
		
		else {
			x = loc_1[0];
		}
  
		if (loc_1[1] == loc_2[1]) {
			y = loc_3[1];
		}
		
		else if (loc_1[1] == loc_3[1]) {
			y = loc_2[1];
		}
		
		else {
			y = loc_1[1];
		}
		
		System.out.println(x + " " + y);
	}

}
