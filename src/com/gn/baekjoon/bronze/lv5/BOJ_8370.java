package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 8370
 * 문제명: Plane
 */
public class BOJ_8370 {
    public static void main(String[] args) {
        try(BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] temp = br.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(temp[0]);
            int k1 = Integer.parseInt(temp[1]);
            int n2 = Integer.parseInt(temp[2]);
            int k2 = Integer.parseInt(temp[3]);

            bw.write(String.valueOf(n1*k1 + n2*k2));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
