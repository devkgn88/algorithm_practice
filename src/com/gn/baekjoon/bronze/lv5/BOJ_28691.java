package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 28691
 * 문제명: 정보보호학부 동아리 소개
 */
public class BOJ_28691 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

            Map<String,String> map = new HashMap<>();
            map.put("M","MatKor");
            map.put("W","WiCys");
            map.put("C","CyKor");
            map.put("A","AlKor");
            map.put("$","$clear");

            String str = br.readLine().trim();
            bw.write(map.get(str));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
