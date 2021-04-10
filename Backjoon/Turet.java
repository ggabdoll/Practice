package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turet {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i =0; i <T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double length = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
			
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}else if(length == Math.pow(r1+r2, 2)) {
				System.out.println(1);
			}else if(length == Math.pow(r1-r2, 2)) {
				System.out.println(1);
			}else if(length > Math.pow(r2+r1, 2)) {
				System.out.println(0);
			}else if(length < Math.pow(r2-r1, 2)) {
				System.out.println(0);
			}else {
				System.out.println(2);
			}
				
			
			
		}
	}

}
