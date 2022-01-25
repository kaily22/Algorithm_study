package algorithm;

import java.util.Scanner;

public class boj11023 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int star;
		
		star = sc.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	
	}
}
