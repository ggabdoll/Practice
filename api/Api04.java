package api;

import java.util.Vector;

public class Api04 {

	public Vector<String>moveToVector(String[] datas){
		Vector<String> v = new Vector<String>(); 
		
		for(int call = datas.length-1; call >=0; call-- ) {
			v.addElement(datas[call]);
		}
		
		return v;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Api04 ac = new Api04();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}

}
