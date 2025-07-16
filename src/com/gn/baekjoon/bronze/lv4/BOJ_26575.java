package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 26575
 * 문제명: Pups
 * 문제 링크: https://www.acmicpc.net/problem/26575
 */
public class BOJ_26575 {
    public static void main(String[] args) {
       try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

           int n = Integer.parseInt(br.readLine().trim());
           for(int i = 0 ; i < n ; i++){
               String[] arr = br.readLine().trim().split("\\s+");
               double d = Double.parseDouble(arr[0]);
               double f = Double.parseDouble(arr[1]);
               double p = Double.parseDouble(arr[2]);
               double multiple = d * f * p;
               bw.write(String.format("$%.2f",(Math.round(multiple* 100.0) / 100.0)));
               if(i != n-1) bw.newLine();
           }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
