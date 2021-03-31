package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int cicle = 2;
		
		while(cicle <= N) {
			cicle = cicle + (6 * count);
			count++;
		}
		
		System.out.println(count);

	}

}
