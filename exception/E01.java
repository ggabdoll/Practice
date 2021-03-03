package exception;

public class E01 {

	public static void main(String[] args) {

		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge(20);
		myPhone.prinBattery();
		
		myPhone.call(300);
		myPhone.prinBattery();
		
		myPhone.charge(50);
		myPhone.prinBattery();
		
		myPhone.call(40);
		myPhone.prinBattery();
		
		try {
			myPhone.call(-20);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		}else {
			System.out.println("다른 모델입니다.");
		}
	}

}
