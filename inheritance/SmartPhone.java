package inheritance;

public class SmartPhone extends CellPhone{
	
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;
	
	public SmartPhone() {}

	

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber,int feePerCallTime,boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber,feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}



	public void calculateTotalFee() {
		if(isMonthlyFixedRate) {
			System.out.println("고객님은"+this.monthlyFixedFee+"정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
		}else {
			super.calculationTotalFee();
		}
	}

	
	}
	

