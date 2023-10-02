package com.kn.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=(6-i)) {
					System.out.print((char)(70-j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
	}

}
