package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 1703
 * 문제명: 생장점
 */
public class BOJ_1703 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String line;
            while(!(line=br.readLine().trim()).equals("0")){
                int b = 1;
                String[] arr = line.split("\\s+");
                int a = Integer.parseInt(arr[0]);
                for(int i = 1 ; i <= a ; i++){
                    int y = Integer.parseInt(arr[2*i-1]);
                    int n = Integer.parseInt(arr[2*i]);
                    b = b * y -n;
                }
                bw.write(String.valueOf(b));
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
