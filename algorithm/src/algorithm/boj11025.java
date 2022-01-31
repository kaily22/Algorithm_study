package algorithm;

import java.util.Scanner;

public class boj11025 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int star;
		
		star = sc.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=star-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	
	}
}
