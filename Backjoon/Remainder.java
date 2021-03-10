package Backjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<>(); 
		int in[] = new int[10];
		
		for(int i =0; i < in.length; i++) {
			h.add(sc.nextInt()%42);
		}
		
		sc.close();
		
		
		System.out.println(h.size());
	}

}
