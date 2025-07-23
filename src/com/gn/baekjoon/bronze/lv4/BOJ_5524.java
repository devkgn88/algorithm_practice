package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 5524
 * 문제명: 입실 관리
 */
public class BOJ_5524 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            long n = Long.parseLong(br.readLine().trim());
            for(long i = 0 ; i < n ; i++){
                String origin = br.readLine().trim();
                bw.write(origin.toLowerCase());
                if(i != n-1) bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
