package com.kn.patterns;

public class Pattern12 {
			public static void main(String[] args) {
				for(int i=1;i<=5;i++) {
					for(int j=1;j<=9;j++)
					{
						if(j<=6-i||j>=(4+i)) 
						{
							System.out.print(j);
						}
						else 
						{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}

		}
	


