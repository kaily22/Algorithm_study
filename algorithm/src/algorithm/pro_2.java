package algorithm;


public class pro_2 {

	public long[] pro_2(int x, int n) {
	
		long[] answer = new long[n];
		long num = x;
		
		for(int i=0; i<answer.length; i++) {
			answer[i]=num;
			num += x;
		}
		
		
		return answer;
		
		
		}
	}

