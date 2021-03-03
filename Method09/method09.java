package Method09;

import java.util.Arrays;

public class method09 {

	public static void main(String[] args) {

		
		method09 median = new method09();
		
		int[] values1 = {10,4,53,63,17,37,52,16,33,65};
		System.out.println("input: " +Arrays.toString(values1));
        System.out.println("median: " +median.findMedian(values1));
        System.out.println("========================================================");
        
        int[] values2 = {32,53,52,76,15,98,76,65,36,10};
        System.out.println("input: " + Arrays.toString(values2));
        System.out.println("median:" + median.findMedian(values2));
	}
	
	public int findMedian(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length;i++) {
			sum = sum + values[i];
		}
		int avg = sum / values.length;
		
		int med = values[0];
		int minus = Math.abs(med-avg);
		
		for(int i = 1; i<values.length;i++) {
			int m = Math.abs(values[i] - avg);
			if(m<minus) {
				med = values[i]; 
				minus = m;
					
				}else if(m == minus && values[i] < med) {
					med = values[i];
				 
			}
		}
		return med;
	}

}
