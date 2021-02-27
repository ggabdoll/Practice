package method13;

public class Method013 {

	public static void main(String[] args) {

        int limit = 67;
		
		Util util = new Util();
		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~" + limit + "까지의 소수의 개수는: " + primeCount+ "EA이며 소수는 아래와 같다.");
		
		System.out.println("/////////////////////////////////////////////////////////");
		
		int[] pirmeArray = util.findPrimeReturnArray(limit);
		
		for(int i = 0; i <pirmeArray.length;i++) {
			System.out.print(pirmeArray[i] + ((pirmeArray.length-1)!=i?",":""));
		}
		
	}

}


	