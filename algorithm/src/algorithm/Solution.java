package algorithm;

public class Solution {

	public static void main(String[] args) {
	
	String phone_number = "01012341234";
	String a = phone_number.substring(0,phone_number.length()-4);
	String b = a.replaceAll(".", "*");
	
	String back = phone_number.substring(phone_number.length()-4);
	String c = b+back;
	
	System.out.println(c);
	
	}

}
