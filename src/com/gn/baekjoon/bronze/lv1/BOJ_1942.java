package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 1942
 * 문제명: 디지털시계
 * 문제 링크: https://www.acmicpc.net/problem/1942
 */
public class BOJ_1942 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			
			for(int i = 0 ; i < 3 ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				LocalTime start = LocalTime.parse(arr[0],dtf);
				LocalTime end = LocalTime.parse(arr[1],dtf);
				int count = 0;
				
                do {
                    int hour = start.getHour();
                    int min = start.getMinute();
                    int second = start.getSecond();

                    String time = hour+""+
							(min<10 ? "0"+min : min)+""+
							(second<10 ? "0"+second : second)+"";
				
                    int num = Integer.parseInt(time);
                    if(num % 3 == 0) count++;		
						

                    start = start.plusSeconds(1);
                } while (!start.equals(end.plusSeconds(1)));

                bw.write(count + "\n");
   			}
			
			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

