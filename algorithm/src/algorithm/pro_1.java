package algorithm;

import java.util.Scanner;

public class pro_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		n= sc.nextInt();
		m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
				System.out.println("*".repeat(n));
			}
		}
	}

