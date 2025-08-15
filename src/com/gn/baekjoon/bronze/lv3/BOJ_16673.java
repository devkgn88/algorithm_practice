package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 16673
 * 문제명: 고려대학교에는 공식 와인이 있다
 */
public class BOJ_16673 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] arr = br.readLine().trim().split("\\s+");
            int c = Integer.parseInt(arr[0]);   // 와인을 모은 년수
            int k = Integer.parseInt(arr[1]);   // 수빈이의 고려대 애착 정도
            int p = Integer.parseInt(arr[2]);   // 수빈이의 구매중독 정도
            int wine = 0;

            for(int i = 1 ; i <= c ; i++){
                wine += ((k*i) + (p*Math.pow(i,2)));
            }

            bw.write(String.valueOf(wine));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
