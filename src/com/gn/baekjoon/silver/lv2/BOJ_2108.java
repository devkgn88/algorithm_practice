package com.gn.baekjoon.silver.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 레벨 : 실버 2
 * 문제 번호: 2108
 * 문제명: 통계학
 * 문제 링크: https://www.acmicpc.net/problem/2108
 */
public class BOJ_2108 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            double sum = 0;

            for(int i = 0 ; i < arr.length ; i++){
                int temp = Integer.parseInt(br.readLine().trim());
                arr[i] = temp;
                map.put(temp,map.getOrDefault(temp,0)+1);
                sum += temp;
            }

            Arrays.sort(arr);

            int maxFreq = Collections.max(map.values());
            List<Integer> modeList = new ArrayList<Integer>();
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() == maxFreq){
                    modeList.add(entry.getKey());
                }
            }

            Collections.sort(modeList);
            int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);

            double avg = sum / arr.length ;
            System.out.println(Math.round(avg));
            System.out.println(arr[arr.length/2]);
            System.out.println(mode);
            System.out.println(Math.abs(arr[arr.length-1]-arr[0]));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
