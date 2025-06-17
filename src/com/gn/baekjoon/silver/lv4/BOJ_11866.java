package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BOJ_11866 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            
            String[] temp = br.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(temp[0]); 
            int k = Integer.parseInt(temp[1]);
            
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i = 1 ; i <= n ; i ++) {
                list.add(i);
            }
            
            int idx = k - 1;
            bw.write("<");
            
            while(list.size() != 0) {
                int delete = list.remove(idx);
                bw.write(String.valueOf(delete));
                
                idx -= 1;
    
                if(idx + k >= list.size()) {
                    idx += k;
                    
                    while(true) {
                        idx -= list.size();
                        if(idx < list.size()) break;
                    }
                } else {
                    idx += k;
                }
                
                if(list.size() != 0) {
                    bw.write(", ");
                }
            }
            bw.write(">");
            bw.flush();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
