package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 15295
 * 문제명: Chanukah Challenge
 */
public class BOJ_15295 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int p = Integer.parseInt(br.readLine().trim());
            for(int i = 0 ; i < p ; i++){
                String[] temp = br.readLine().trim().split("\\s+");
                int k = Integer.parseInt(temp[0]);
                int n = Integer.parseInt(temp[1]);
                bw.write(k+" "+(((n+1)*(n+2)/2)-1));
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
