package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 23103
 * 문제명: Academic Distance
 */
public class BOJ_23103 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            int n = Integer.parseInt(br.readLine().trim());
            String[] temp = br.readLine().trim().split("\\s+");
            Point before = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            int d = 0;

            for(int i = 1 ; i < n ; i++){
                String[] arr = br.readLine().trim().split("\\s+");
                Point after = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
                d += Math.abs(after.x-before.x)+Math.abs(after.y-before.y);
                before = after;
            }

            bw.write(String.valueOf(d));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
