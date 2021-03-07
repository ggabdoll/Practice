package method13;

public class Util {
	public int findPrimeCount(int limit) {
		boolean Primecount = true;
		int count =0;
		
		for(int i = 2; i <= limit; i++) {
			Primecount = true;
			for(int j = 2; j<i; j++) {
				if(i%j == 0 ) { 
			        Primecount = false;	
					break;
				}
			}
			if(Primecount) {
				count++;
			}
		}
		return count;
	}

	public int[] findPrimeReturnArray(int limit) {
		boolean Primecount = true;
		int count = this.findPrimeCount(limit);
		int[] prime = new int[count];
		int abs = 0;
		for(int i = 2; i <= limit; i++) {
			Primecount = true;
			for(int j = 2; j<i; j++) {
				if(i%j == 0 ) {
			        Primecount = false;	
					break;
				}
			}
			if(Primecount) {
			prime[abs]=i;
			abs++;
			
			}
		}
		return prime;
	}
}


