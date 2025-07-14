package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 6840
 * 문제명: Who is in the middle?
 * 문제 링크: https://www.acmicpc.net/problem/6840
 */
public class BOJ_6840 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            int[] arr = new int[3];
            for(int i = 0 ; i < arr.length ; i++){
                int temp = Integer.parseInt(br.readLine().trim());
                arr[i] = temp;
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
