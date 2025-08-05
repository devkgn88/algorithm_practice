package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 23972
 * 문제명: 악마의 제안
 */
public class BOJ_23972 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] arr = br.readLine().trim().split("\\s+");
            long k = Long.parseLong(arr[0]);
            long n = Long.parseLong(arr[1]);

            if(n == 1){
                bw.write("-1");
            } else{
                long result = (k * n + (n - 2)) / (n - 1);
                bw.write(result + "\n");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
