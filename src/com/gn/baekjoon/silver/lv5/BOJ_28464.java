package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 레벨 : 실버 5
 * 문제 번호: 28464
 * 문제명: Potato
 */
public class BOJ_28464 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];

            String[] temp = br.readLine().trim().split("\\s+");
            for(int i = 0 ; i < temp.length ; i++){
                arr[i] = Integer.parseInt(temp[i]);
            }

            Arrays.sort(arr);
            int max = 0;
            int min = 0;

            for(int i = 0 ; i < arr.length/2 ; i++){
                max += arr[arr.length-i-1];
                min += arr[i];
            }
            if(arr.length % 2 != 0){
                max += arr[arr.length/2];
            }

            bw.write(min+" "+max);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
