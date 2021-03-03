package api;

public class Api05 {

	public static void main(String[] args) {

		String[] arr = {"java program", "array","java program area","append"};
		String result = Api05.replaceString(arr);
		System.out.println("변경된 문자열: " +result);	
	}

		private static String replaceString(String[]arr) {
			String path;
			int index =0, aplus =0 , max =0;
			
			for(int i = 0; i < arr.length;i++) {
				aplus = 0;
				
				for(int j = 0; j < arr[i].length();j++) {
					if(arr[i].charAt(j) == 'a') {
						aplus ++;
					}
				}
				if(aplus >= max) {
					max = aplus;
					index = i;
				}
			}
			
			path = arr[index].replace('a','A');
			return path;
		}
	}

