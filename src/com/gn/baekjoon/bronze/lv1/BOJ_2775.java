package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 2775
 * 문제명: 부녀회장이 될테야
 * 문제 링크: https://www.acmicpc.net/problem/2775
 */
public class BOJ_2775 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int t = Integer.parseInt(br.readLine().trim());
			int[] arrK = new int[t];
			int[] arrN = new int[t];
			
			int maxK = 0;
			int maxN = 0;
			

			for(int i = 0 ; i < t ; i++) {
				int k1 = Integer.parseInt(br.readLine().trim());
				int n1 = Integer.parseInt(br.readLine().trim());
				arrK[i] = k1;
				arrN[i] = n1;
				
				if(k1 > maxK) maxK = k1;
				if(n1 > maxN) maxN = n1;
			}
			
			int[][] apt = new int[maxK+1][maxN+1];
			for(int i = 1 ; i <= maxN ; i++) {
				apt[0][i] = i;
			}
			
			for (int f = 1; f <= maxK; f++) {
	            for (int r = 1; r <= maxN; r++) {
	                apt[f][r] = apt[f][r - 1] + apt[f - 1][r];
	            }
	        }
			
			for(int i = 0 ; i < arrK.length ; i++) {
				bw.write(String.valueOf(apt[arrK[i]][arrN[i]]));
				bw.newLine();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
}
