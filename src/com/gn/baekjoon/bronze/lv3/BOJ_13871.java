package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 13871
 * 문제명: Farm robot
 */
public class BOJ_13871 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] temp1 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(temp1[0]);
            int c = Integer.parseInt(temp1[1]);
            int s = Integer.parseInt(temp1[2]);

            int[] arr = new int[n+1];
            arr[1] = 1;
            int spot = 1;

            String[] temp2 = br.readLine().trim().split("\\s+");
            for(int i = 0 ; i < c ; i++) {
                int num = Integer.parseInt(temp2[i]);
                if(spot == 1 && num == -1){
                    spot = n;
                } else if(spot == n && num == 1){
                    spot = 1;
                } else{
                    spot += num;
                }
                arr[spot] += 1;
            }

            bw.write(String.valueOf(arr[s]));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
