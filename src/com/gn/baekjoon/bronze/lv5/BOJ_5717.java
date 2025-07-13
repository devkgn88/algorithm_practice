package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 5717
 * 문제명: 상근이의 친구들
 * 문제 링크: https://www.acmicpc.net/problem/5717
 */
public class BOJ_5717 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            String line;
            while(!(line = br.readLine()).equals("0 0")){
                String[] arr = line.split("\\s+");
                int m = Integer.parseInt(arr[0]);
                int f = Integer.parseInt(arr[1]);
                System.out.println(m+f);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
