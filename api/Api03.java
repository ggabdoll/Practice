package api;

public class Api03 {

	public static void main(String[] args) {

		Api03 api = new Api03();
		
		System.out.println(api.leftPad("ABC",6,'#'));
		System.out.println(api.leftPad("ABC",5,'$'));
		System.out.println(api.leftPad("ABC",2,'&'));

	}
	
	public String leftPad(String str, int size, char padChar) {
		int length = str.length();
		
		if(length >= size) {
			return str;
		}
		String result = "";
		for(int i =0; i<size - length; i++) {
			result += padChar;
		}
		result += str;
		return result;
	}

}
