package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 22193
 * 문제명: Multiply
 */
public class BOJ_22193 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] arr = br.readLine().trim().split("\\s+");

            BigInteger a = new BigInteger(br.readLine().trim());
            BigInteger b = new BigInteger(br.readLine().trim());

            bw.write(a.multiply(b).toString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
