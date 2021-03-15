package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.*;



public class RoutN {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringTokenizer st;
		
		int i = N;
		while(i >= 1) {
			bw.write(i + "\n");
			i--;
		}
		
		bw.flush();
		bw.close();
	}

}
