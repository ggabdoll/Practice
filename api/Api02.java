package api;

public class Api02 {

	public static void main (String[] args) {
		Api02 adder = new Api02();
		String espr = "3+5+0+1";
		System.out.println(espr + "="  + adder.execute(espr));
		espr = "11+45+77+3";
		System.out.println(espr + "="  + adder.execute(espr)); 
		espr = "33+51+12+11";
		System.out.println(espr + "="  + adder.execute(espr)); 

	}
	
	public int execute(String espr) {
		int result = 0;
		String strNum = "";
		for(int i =0; i<espr.length();i++) {
			char c = espr.charAt(i);
			if(c == '+') {
				result += Integer.parseInt(strNum);
				strNum = "";
			}else {
				strNum += c;
			}
		}
		return(result + Integer.parseInt(strNum));
	}
	
}
