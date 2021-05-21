package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make1 {

	public static void main(String[] args)throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
				

		System.out.println(recur(N, 0));
	}
	
 
	static int recur(int N, int count) {
		// N�� 2 �̸��� ��� ������ count���� ��ȯ
		if (N < 2) {
			return count;
		}
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
 
	}

}
