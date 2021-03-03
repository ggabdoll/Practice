package inheritance;

public class CellPhone {

	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	
	public CellPhone() {}
	
	
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		super();
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public void call(String callNumber,int time) {
		System.out.println(callNumber + "번호로" + time + "통화함");
		totalCallTime += time;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	public void calculationTotalFee() {
		this.totalFee = totalCallTime * feePerCallTime;
	}
	
	
	
}
