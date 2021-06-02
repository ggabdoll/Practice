package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// �Է��� ������ 1 ~ 1000�̹Ƿ� 1001���� index�� �д�.
		int[] arr = new int[1001];
 
		// Counting Sort 
		while (N-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
 
		int prev = 0;	// ���������� ���ð� ������
		int sum = 0;	// ����� ���ð� ����
		
		for (int i = 0; i < 1001; i++) {
			
			// �ش� i index�� 0�� �� �� ���� �ݺ� 
			while (arr[i]-- > 0) {
				// ���������� ���ð��� ���� ����� �ɸ��� �ð��� �����ش�.
				sum += (i + prev);
				
				// ���������� �����տ� ���� �ɸ��� �ð��� �����ش�.
				prev += i;
			}
		}
		System.out.println(sum);

	}

}