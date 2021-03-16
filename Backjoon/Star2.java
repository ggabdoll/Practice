package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star2 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i =1; i<=N; i++) {
			for(int j =N-i-1; j>=0; j--) {
				bw.write(" ");
			}
			for(int k = 0; k<i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
