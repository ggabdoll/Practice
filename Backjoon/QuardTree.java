package Backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class QuardTree {
	
	public static int[][] img;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
		int N = Integer.parseInt(br.readLine());
		img = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < N; j++) {
				img[i][j] = str.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
	}
	
	public static void QuadTree(int x, int y, int size) {
		
		// ������ ������ ��� �ϳ��� �������� �������ش�.
		if(isPossible(x, y, size)) {
			sb.append(img[x][y]);
			return;
		}
		
		int newSize = size / 2;	// ������ �Ұ��� �� ��� ����� �������� ������� �Ѵ�.
		
		sb.append('(');	// �� ����(depth)���� ���°�ȣ�� �����ؾ��Ѵ�. 
		
		QuadTree(x, y, newSize);						// ���� ��
		QuadTree(x, y + newSize, newSize);				// ������ ��
		QuadTree(x + newSize, y, newSize);				// ���� �Ʒ�
		QuadTree(x + newSize, y + newSize, newSize);	// ������ �Ʒ�
		
		sb.append(')');	// �ش� ������ ������ �ݴ°�ȣ�� �ݾ��ش�.
			
		
	}
	
	
	// ������ �������� �ش� ������ üũ���ִ� �Լ�
	public static boolean isPossible(int x, int y, int size) {
		int value = img[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
		

	}


