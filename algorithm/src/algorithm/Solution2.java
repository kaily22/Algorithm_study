package algorithm;

public class Solution2 {

	public static void main(String[] args) {
	
	String phone_number = "01012341234";
	String answer = "";
	int length = phone_number.length()-4;
	
		for(int i=0; i<length; i++) {
			answer += "*";
		}
		answer += phone_number.substring(length);
		System.out.println(answer);
	}
}
