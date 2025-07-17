package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 29720
 * 문제명: 그래서 님 푼 문제 수가?
 */
public class BOJ_29720 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] arr = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int k = Integer.parseInt(arr[2]);

            int min = (n - (m*k));
            int max = min + (m-1);

            bw.write((Math.max(min,0))+" "+max);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
