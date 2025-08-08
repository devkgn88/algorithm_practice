package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 29736
 * 문제명: 브실이와 친구가 되고 싶어
 */
public class BOJ_29736 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] temp1 = br.readLine().trim().split("\\s+");
            int a = Integer.parseInt(temp1[0]);
            int b = Integer.parseInt(temp1[1]);

            String[] temp2 = br.readLine().trim().split("\\s+");
            int k = Integer.parseInt(temp2[0]);
            int x = Integer.parseInt(temp2[1]);

            int min = k < x ? 0 : k-x;
            int max = Math.min(k + x, 10000);

            int count = 0;
            for(int i = a ; i <= b ; i++){
                if(min <= i && i <= max){
                    count++;
                }
            }

            if(count == 0){
                bw.write("IMPOSSIBLE");
            } else{
                bw.write(count+"");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
