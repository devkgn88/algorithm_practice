package com.gn.baekjoon.bronze.lv4;

import java.util.Scanner;

public class BOJ_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			for(int a = num-1 ; a > i ; a--) {
				System.out.print(" ");
			}
			for(int b = 0 ; b <= i ; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
