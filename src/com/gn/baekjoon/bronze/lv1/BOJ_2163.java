package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 2163
 * 문제명: 초콜릿 자르기
 */
public class BOJ_2163 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] temp = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);

            int max = Math.max(n,m);
            int min = Math.min(n,m);

            bw.write(String.valueOf((min-1) + ((max-1)*min)));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
