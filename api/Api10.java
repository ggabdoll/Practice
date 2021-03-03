package api;

import java.util.Vector;

public class Api10 {

	public Vector<String> dataChange(String[] strData){
	Vector<String> m = new Vector<String>();	
		
		for(int arr = strData.length-1; arr >= 0; arr--) {
			StringBuffer s = new StringBuffer(strData[arr]);
			s.reverse();
			m.addElement(s.toString());
		
		
		}
		
			return m;
	}
	
	
	
	
	public static void main(String[] args) {

		Api10 st = new Api10();
		String[] strData = {"Java Programing","JDBC","Oracle 10g","JSP/Servlet"};
		Vector<String> v= st.dataChange(strData);
		
		for(int i =0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}

}
