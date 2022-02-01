package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Solution5 {

	public static void main(String[] args) {
	
	long n = 118372;
	
	String str = Long.toString(n);
	
	String[] arr = str.split("");
	Arrays.sort(arr,Collections.reverseOrder());;
	
	str = String.join("", arr);
	
	long answer = Long.parseLong(str);
	System.out.println(answer);
	
	
	}
}
