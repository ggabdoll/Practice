package Programers;

public class Year2016 {

	public String solution(int a, int b) {
		String answer = "";
		String[] w = {"FRI","SAT","SUN","MON","TUE","WED","THU",};
		int [] m = {31,29,31,30,31,30,31,31,30,31,30,31};
		int t = 0;
		
		for(int i =0; i<a-1;i++) {
			t += m[i];
		}
		
		t += b-1;
		answer = w[t%7];
		
		return answer;
	}
	
	public static void main(String[] args) {
		Year2016 y = new Year2016();
		
		System.out.println(y.solution(1, 3));
		
	}
}
