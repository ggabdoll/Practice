package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Wordarr {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] word = new String[N];
		
		for(int i =0; i < N; i++ ) {
			word[i] = br.readLine();
		}
		
		Arrays.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(word[0]).append('\n');
		
		for(int i = 1; i <N; i++) {
			
			if(!word[i].equals(word[i -1])) {
				sb.append(word[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

}
