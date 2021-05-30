package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int firstRing = Integer.parseInt(st.nextToken());

        for(int i =1; i < N; i++){

            int otherRing = Integer.parseInt(st.nextToken());

            int d = gcd(firstRing, otherRing);

            System.out.println(firstRing / d + "/" + otherRing/d);

        }

    }

    public static int gcd(int a, int b) {

        while( b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;

    }

}
