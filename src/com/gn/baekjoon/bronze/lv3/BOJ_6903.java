package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 6903
 * 문제명: Trident
 */
public class BOJ_6903 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int t = Integer.parseInt(br.readLine().trim()); // 갈래의 높이
            int s = Integer.parseInt(br.readLine().trim()); // 갈래의 간격
            int h = Integer.parseInt(br.readLine().trim()); // 손잡이의 길이

            for(int i = 0 ; i < t ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    bw.write("*");
                    if(j!=2){
                        for(int x = 0 ; x < s ; x++){
                            bw.write(" ");
                        }
                    }
                }
                bw.newLine();
            }
            int a = 3 + (s*2);
            for(int i = 0 ; i < a ; i++){
                bw.write("*");
            }
            bw.newLine();
            for(int i = 0 ; i < h ; i++){
                for(int j = 0 ; j < a/2 ; j++){
                    bw.write(" ");
                }
                bw.write("*");
                if(i != h-1){
                    bw.newLine();
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
