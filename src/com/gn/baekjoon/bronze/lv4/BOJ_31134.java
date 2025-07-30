package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 31134
 * 문제명: A Hero Named Magnus
 */
public class BOJ_31134 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            int t = Integer.parseInt(br.readLine().trim());
            for(int i = 0 ; i < t ; i++){
                BigInteger x = new BigInteger(br.readLine().trim());
                BigInteger y = new BigInteger("0");
                y = x.subtract(new BigInteger("1"));
                y = y.multiply(new BigInteger("2"));
                y = y.add(new BigInteger("1"));

                bw.write(y.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
