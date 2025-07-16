package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 29766
 * 문제명: DKSH 찾기
 */
public class BOJ_29766 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String str = br.readLine().trim();
            String cut = str.replaceAll("DKSH","");
            bw.write(String.valueOf((str.length()-cut.length())/4));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
