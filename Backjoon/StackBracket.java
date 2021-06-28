package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackBracket {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i =0; i < T; i++){
            sb.append(slove(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static String slove(String s){

        Stack<Character> stack = new Stack<>();

        for(int i =0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }
            else if (stack.empty()){
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        if (stack.empty()){
            return "YES";
        }
        else {
            return  "NO";
        }
    }
}
