package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");

            arr[i] = Integer.parseInt(st.nextToken());

            for(int j = i+1; j < i+1; j++){

                int d = gcd(arr[0], arr[j]);

                sb.append(arr[0] / d).append('/').append(arr[j] / d).append('\n');
            }
        }

        System.out.println(sb);

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
