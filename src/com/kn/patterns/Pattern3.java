package com.kn.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
			if(j>=1) {
				System.out.print(i);
			}else {
				System.out.println(" ");
			}
			}
			System.out.println(" ");
		}
	}

}
