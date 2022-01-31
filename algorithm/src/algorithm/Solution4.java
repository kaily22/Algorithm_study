package algorithm;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	int min = (n < m) ? n:m; //참이면 n, 거짓이면 m
	int gcd = 0;
	
	for(int i=1; i<=min; i++) {
		if(n%i ==0 && m%i==0) {
			gcd=i;
		
		}
		}
		
		System.out.println("최대공약수 : " +gcd);
		System.out.println("최대공배수 : " +(n*m)*gcd);
	
	}
}
