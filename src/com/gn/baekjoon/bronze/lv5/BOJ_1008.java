package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 1008
 * 문제명: A/B
 * 문제 링크: https://www.acmicpc.net/problem/1008
 */
public class BOJ_1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((double)a/b);
        sc.close();
    }
}
