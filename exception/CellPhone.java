package exception;

public class CellPhone {

	private String model;
	private double battery;
	
	public CellPhone() {}
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	
	public void call(int time) {
		if(time<0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		}
		
		System.out.println("통화 시간 : " + time + " 분");
		double sb = time * 0.5;
		
		if(sb < 0) {
			this.battery = 0;
		}else {
			this.battery = sb;
		}
	}
	
	public void charge(int time) {
		if(time<0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		}
		
		System.out.println("충전시간 : " + time + "분");
		double pb = time *3;
		
		if(pb>100) {
			this.battery = 100;
		}else {
			this.battery = pb;
		}
	}
	
	public void prinBattery() {
		System.out.println(this.battery);
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}else if(!(obj instanceof CellPhone)) {
			return false;
		}else {
			CellPhone otherPhone = (CellPhone)obj;
			return this.model.equals(otherPhone.model);
		}
		
	}
	
}
