package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2154
 * 문제명: 수 이어 쓰기 3
 */
public class BOJ_2154 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            int N = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            for(int i = 1 ; i <= N ; i++) {
                sb.append(i);
            }
            System.out.println(sb.indexOf(String.valueOf(N))+1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
