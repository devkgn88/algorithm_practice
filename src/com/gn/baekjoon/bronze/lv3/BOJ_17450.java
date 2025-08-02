package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 17450
 * 문제명: 과자 사기
 */
public class BOJ_17450 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            double max = 0;
            String alpha = "";

            for(int i = 0 ; i < 3 ; i++){
                double ga = -1;

                String[] arr = br.readLine().trim().split("\\s+");
                int price = Integer.parseInt(arr[0]);
                int weight = Integer.parseInt(arr[1]);

                ga =  (weight*10.0)/(price*10 >= 5000 ? (price*10.0 - 500) : price*10.0 );

                if(ga >= max){
                    max = ga;
                    switch (i){
                        case 0 : alpha = "S";break;
                        case 1 : alpha = "N";break;
                        case 2 : alpha = "U";break;
                    }
                }
            }

            bw.write(alpha);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
