package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 15610
 * 문제명: Abbey Courtyard
 */
public class BOJ_15610 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            double d = Double.parseDouble(br.readLine().trim());
            double a = Math.sqrt(d);
            bw.write(String.valueOf(a*4));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
