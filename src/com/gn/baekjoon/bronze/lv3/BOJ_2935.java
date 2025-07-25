package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 2935
 * 문제명: 소음
 */
public class BOJ_2935 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            BigInteger a = new BigInteger(br.readLine().trim());
            String op = br.readLine().trim();
            BigInteger b = new BigInteger(br.readLine().trim());
            BigInteger or = new BigInteger("0");

            if(op.equals("*")){
                a = a.multiply(b);
            } else{
                a = a.add(b);
            }
                bw.write(a.toString());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
