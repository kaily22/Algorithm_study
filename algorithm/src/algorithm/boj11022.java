package algorithm;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
	
		int total;
		Scanner sc = new Scanner(System.in);
		
		total = sc.nextInt();
		int A;
		int B;
		int C=0;
		
		int i=1;
	for(i=1; i<total+1; i++) {
		A = sc.nextInt();
		B = sc.nextInt();
		C = A+B;
		System.out.println("Case #"+i+": "+A+" + "+B+" = "+C);
	}
	}

}
