package algorithm;

import java.util.*;

//프로그래머스 level1 나누어 떨어지는 숫자 배열  
public class Solution7 {

	public static void main(String[] args) {
	
		int arr[] = {5, 9, 7, 10};
		
		int divisor = 5;
		
		int[] answer = {};
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor ==0) {
				arr1.add(arr[i]);
			}
		}
		
		if(arr1.isEmpty()) {
			arr1.add(-1);
		}
		
		answer = new int[arr1.size()];
		
		for(int i=0; i<arr1.size(); i++) {
			answer[i]= arr1.get(i);
		}
		
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}

}
