package com.cg.daytow;

import java.util.Scanner;

public class ifelse {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int score=sc.nextInt();
				//ifelse
				if(score>100) {
					System.out.println("rain");
				}
				else {
					System.out.println("no rain");
				}
				sc.close();
			}
		}
