package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 16769
 * 문제명: Mixing Milk
 */
public class BOJ_16769 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int[] c = new int[3];
            int[] m = new int[3];
            for(int i = 0 ; i < 3 ; i++){
                String[] temp = br.readLine().trim().split("\\s+");
                c[i] = Integer.parseInt(temp[0]);
                m[i] = Integer.parseInt(temp[1]);
            }
            for(int i = 1 ; i <= 100; i ++){
                if(i % 3 == 1){
                    if((m[0]+m[1])<=c[1]){
                        m[1] += m[0];
                        m[0] = 0;
                    } else{
                        int temp = m[1];
                        m[1] = c[1];
                        m[0] = m[0] + temp - c[1];
                    }

                }else if(i % 3 == 2){
                    if((m[1]+m[2])<=c[2]){
                        m[2] += m[1];
                        m[1] = 0;
                    } else{
                        int temp = m[2];
                        m[2] = c[2];
                        m[1] = m[1] + temp - c[2];
                    }
                }else{
                    if((m[2]+m[0])<=c[0]){
                        m[0] += m[2];
                        m[2] = 0;
                    } else{
                        int temp = m[0];
                        m[0] = c[0];
                        m[2] = m[2] + temp - c[0];
                    }
                }
            }

            for(int i = 0 ; i < m.length ; i++){
                bw.write(String.valueOf(m[i]));
                bw.newLine();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
