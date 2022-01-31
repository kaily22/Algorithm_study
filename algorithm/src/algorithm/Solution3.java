package algorithm;

public class Solution3 {

	public static void main(String[] args) {
	
	String phone_number = "01012341234";
	
	char[] ch1 = phone_number.toCharArray();
	
	for(int i=0; i<ch1.length-4; i++) {
		ch1[i] = '*';
	}
		System.out.println(String.valueOf(ch1)); 
	
	}
}
