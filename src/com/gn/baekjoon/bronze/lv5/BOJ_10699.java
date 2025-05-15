package com.gn.baekjoon.bronze.lv5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 문제 번호: 10699
 * 문제명: 오늘 날짜
 * 문제 링크: https://www.acmicpc.net/problem/10699
 */
public class BOJ_10699 {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(ld.format(formatter));
    }
}
