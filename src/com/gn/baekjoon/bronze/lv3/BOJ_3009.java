package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 3009
 * 문제명: 네번째 점
 */
public class BOJ_3009 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            Map<Integer,Integer> map_x = new HashMap<Integer,Integer>();
            Map<Integer,Integer> map_y = new HashMap<Integer,Integer>();

            for(int i = 0 ; i < 3 ; i++){
                String[] temp = br.readLine().trim().split("\\s+");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);

                map_x.put(x, map_x.getOrDefault(x,0)+1);
                map_y.put(y, map_y.getOrDefault(y,0)+1);
            }

            Set<Integer> keySet1 = map_x.keySet();
            Iterator<Integer> itr1 = keySet1.iterator();
            while(itr1.hasNext()){
                int key = itr1.next();
                int value = map_x.get(key);
                if(value % 2 != 0){
                    bw.write(String.valueOf(key));
                }
            }

            bw.write(" ");

            Set<Integer> keySet2 = map_y.keySet();
            Iterator<Integer> itr2 = keySet2.iterator();
            while(itr2.hasNext()){
                int key = itr2.next();
                int value = map_y.get(key);
                if(value % 2 != 0){
                    bw.write(String.valueOf(key));
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
