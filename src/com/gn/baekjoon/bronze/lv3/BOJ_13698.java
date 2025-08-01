package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 13698
 * 문제명: Hawk eyes
 */
public class BOJ_13698 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int[] arr = new int[]{1,0,0,2};

            // A : 65
            String[] role = new String[]{"0,1","0,2","0,3","1,2","1,3","2,3"};


            char[] temp = br.readLine().trim().toCharArray();
            for(int i = 0 ; i < temp.length ; i++){
                char alpha = temp[i];
                String[] role_temp = role[(int)alpha-65].split(",");
                int a = Integer.parseInt(role_temp[0]);
                int b = Integer.parseInt(role_temp[1]);

                int foo = arr[b];
                arr[b] = arr[a];
                arr[a] = foo;
            }

            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 1) bw.write(String.valueOf(i+1));
            }
            bw.newLine();
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 2) bw.write(String.valueOf(i+1));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
