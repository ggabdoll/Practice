package api;

public class api01 {

	public static void main(String[] args) {
		
		String sourceString = "everyday we have is one more than we deserve";
		String encode = "";
		
		for(int i =0; i < sourceString.length();i++) {
			char m =sourceString.charAt(i);
			if(m == ' ') {
				encode +=' ';
			}else if(m == 'x' || m == 'y' || m == 'z') {
				encode += (char)(m -23);
			}else {
				encode += (char)(m+3);
			}
			
			
		
		

		}
		System.out.println("��ȣȭ�� ���ڿ�: " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ�: " + encode);

	}
}