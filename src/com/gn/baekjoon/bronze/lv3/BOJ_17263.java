package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 17263
 * 문제명: Sort 마스터 배지훈
 */
public class BOJ_17263 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split("\\s+");
            long max = 0;
            for(int i = 0 ;i < arr.length ; i++){
                long temp = Long.parseLong(arr[i]);
                if(temp > max) max = temp;
            }
            bw.write(String.valueOf(max));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
