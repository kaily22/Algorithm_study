package algorithm;

import java.util.ArrayList;
import java.util.Arrays;


//프로그래머스 level1 같은 숫자는 싫어!
public class solution8 {

	public static void main(String[] args) {
	
		int[] arr = {1,1,3,3,0,1,1};
		
		int[] answer = {};
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				arr1.add(arr[i]);
			}else {
				if(arr[i] != arr[i-1]) {
					arr1.add(arr[i]);
				}
			}
		}
		
		answer = new int[arr1.size()];
		for(int i=0; i<arr1.size(); i++) {
			answer[i] = arr1.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
	}

}
