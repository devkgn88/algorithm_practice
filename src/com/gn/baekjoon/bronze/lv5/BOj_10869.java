package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10869
 * 문제명: 사칙연산
 * 문제 링크: https://www.acmicpc.net/problem/10869
 */
public class BOj_10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        sc.close();
    }
}
