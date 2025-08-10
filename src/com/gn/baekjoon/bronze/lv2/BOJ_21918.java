package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 21918
 * 문제명: 전구
 */
public class BOJ_21918 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            String[] arr1 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr1[0]);  // 전구의 개수
            int m = Integer.parseInt(arr1[1]);  // 입력된 명령어 개수

            // n개의 전구의 상태
            String[] arr2 = br.readLine().trim().split("\\s+");

            int[] result = new int[n];
            for(int i = 0 ; i < n ; i++){
                result[i] = Integer.parseInt(arr2[i]);
            }

            for(int i = 0 ; i < m ; i++){
                String[] arr3 = br.readLine().trim().split("\\s+");
                int a = Integer.parseInt(arr3[0]);
                int b = Integer.parseInt(arr3[1]);
                int c = Integer.parseInt(arr3[2]);

                switch(a){
                    case 1 : result[b-1] = c; break;
                    case 2 : for(int j = b ; j <= c ; j++){
                                if(result[j-1] == 0) result[j-1] = 1;
                                else result[j-1] = 0;
                            }
                            break;
                    case 3 : for(int j = b ; j <= c ; j++){
                                result[j-1] = 0;
                            }
                            break;
                    case 4 : for(int j = b ; j <= c ; j++){
                                result[j-1] = 1;
                            }
                            break;
                }
            }

            for (int j : result) {
                bw.write(j + " ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
