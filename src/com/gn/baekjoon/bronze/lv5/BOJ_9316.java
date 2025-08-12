package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 9316
 * 문제명: Hello Judge
 */
public class BOJ_9316 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            for(int i = 1 ; i <= n ; i++){
                bw.write("Hello World, Judge "+i+"!");
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
