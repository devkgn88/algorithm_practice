package com.gn.baekjoon.silver.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BOJ_2606 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int c = Integer.parseInt(br.readLine().trim());
			Map<Integer,Set<Integer>> map = new HashMap<Integer,Set<Integer>>();
			
			int l = Integer.parseInt(br.readLine().trim());
			
			
			for(int i = 0 ; i < l; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[1]);
				
				Set<Integer> set_a = map.getOrDefault(a, new HashSet<Integer>());
				set_a.add(a);
				set_a.add(b);
				map.put(a, set_a);
				
				Set<Integer> set_b = map.getOrDefault(b, new HashSet<Integer>());
				set_b.add(a);
				set_b.add(b);		
				map.put(b, set_b);
			}
			
			int max = 0;
						
			Set<Integer> keySet = map.keySet();
			Iterator<Integer> itr = keySet.iterator();
			while(itr.hasNext()) {
				int key = itr.next();
				Set<Integer> set_r = map.get(key);
				Set<Integer> toAdd = new HashSet<>();
				
				Iterator<Integer> itr2 = set_r.iterator();
				while(itr2.hasNext()) {
					int key2 = itr2.next();
					toAdd.addAll(map.get(key2));
				}
				set_r.addAll(toAdd);
				
				map.put(key, set_r);
				if(set_r.contains(1) && set_r.size() > max) {
					max = set_r.size()-1;
				}
			}
			
			bw.write(String.valueOf(max));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
