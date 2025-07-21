package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 16561
 * 문제명: 3의 배수
 */
public class BOJ_16561 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            int count = 0 ;
            for(int a = 3 ; a <= n-6 ; a+= 3){
                for(int b = 3 ; b <= n-6 ; b += 3){
                    if(a+b < n){
                        count++;
                    }
                }
            }

            bw.write(String.valueOf(count));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
