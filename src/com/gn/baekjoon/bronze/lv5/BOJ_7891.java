package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 7891
 * 문제명: Can you add this?
 * 문제 링크: https://www.acmicpc.net/problem/7891
 */
public class BOJ_7891 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            int t = Integer.parseInt(br.readLine().trim());
            for(int i = 0 ; i < t ; i++){
                String[] arr = br.readLine().trim().split("\\s+");
                BigInteger x = new BigInteger(arr[0]);
                BigInteger y = new BigInteger(arr[1]);
                BigInteger sum = x.add(y);
                bw.write(sum.toString());
                bw.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
