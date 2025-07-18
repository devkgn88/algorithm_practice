package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 31009
 * 문제명: 진주로 가자!
 */
public class BOJ_31009 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            int j = 0;
            for(int i = 0 ; i < n ; i++){
                String[] arr = br.readLine().trim().split("\\s+");
                String d = arr[0];
                int c = Integer.parseInt(arr[1]);
                if(d.equals("jinju")) j = c;
                map.put(c, map.getOrDefault(c,0)+1);
            }

            Set<Integer> set = map.keySet();
            Iterator<Integer> itr = set.iterator();
            int count = 0;
            while(itr.hasNext()){
                int key = itr.next();
                if(key > j) count += map.get(key);
            }

            bw.write(String.valueOf(j));
            bw.newLine();
            bw.write(String.valueOf(count));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
