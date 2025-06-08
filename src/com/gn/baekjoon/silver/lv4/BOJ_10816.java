package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 실버 4
 * 문제 번호: 10816
 * 문제명: 숫자 카드 2
 * 문제 링크: https://www.acmicpc.net/problem/10816
 */
public class BOJ_10816 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			String[] nArr = br.readLine().trim().split("\\s+");
			
			for(int i = 0 ; i < n ; i++) {
				int key = Integer.parseInt(nArr[i]);	
				if(map.containsKey(key)) {
					int val = map.get(key);
					map.put(key, val+1);
				}else {
					map.put(key, 1);
				}
			}
			
//			Set<Integer> keySet = map.keySet();
//			Iterator<Integer> itr = keySet.iterator();
//			while(itr.hasNext()) {						
//				int tempKey = itr.next();
//				int tempVal = map.get(tempKey);
//				System.out.println(tempKey+" : "+tempVal);
//			}
			
			int m = Integer.parseInt(br.readLine().trim());
			String[] mArr = br.readLine().trim().split("\\s+");
			for(int i = 0 ; i < m ; i++) {
				int key = Integer.parseInt(mArr[i]);	
				if(map.containsKey(key)) {
					bw.write(String.valueOf(map.get(key))+" ");
				}else {
					bw.write("0 ");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
