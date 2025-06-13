package com.gn.baekjoon.bronze.lv1;

public class BOJ_1952 {
//	public static void main(String[] args) {
//		String[][] arr = new String[5][3];
//		
//		int x = 0;
//		int y = 0;
//		
//		char line = 'x';	// x,y축
//		char side = 'a';	// 앞,뒤
//		
//		int min_x = 0;
//		int min_y = 0;
//		
//		int max_x = arr[0].length-1;	//2
//		int max_y = arr.length-1;		//4
//		
//		for(int i = 0 ; i < 15 ; i++) {
//			if(line == 'x') {
//				if(side == 'a') {
//					x++;
//					y++;
//					System.out.println(x+","+y);
//					
//					if(y == max_y-1) {
//						line = 'y';
//						max_y-=1;
//					}
//				} else {
//					
//					x--;
//					System.out.println(x+","+y);
//					if(x == min_x) {
//						line = 'y';
//						side = 'b';
//					} 
//					
//				}
//				
//			} else {
//				// y축 기준으로 움직일때
//				if(side == 'a') {
//					y++;
//					System.out.println(x+","+y);
//					if(y == max_y) {
//						line = 'x';
//						side='b';
//						min_y += 1;
//					}
//				}else {
//					y--;
//					System.out.println(x+","+y);
//					if(y == min_y) {
//						
//					}
//				}
//			}
//			
//		}
//	}
	public static void main(String[] args) {
		
		int y = 1;
		int x = 1;
		
		int min_y = 1 ;
		int min_x = 1;
		
		int max_y = 5;
		int max_x = 3;
		
		char axis = 'x';
		char way = 'a';
		
		int count = 15+2;
		
		int result = 0;
		
		for(int i = 0 ; i < count ; i ++) {
			System.out.println(axis+"축 "+way+"방향, "+x+" : "+y);
			
			// x축으로 진행하고 있을 때
			if(axis == 'x') {
				// 오른쪽 방향으로 가고 있을 때
				if(way == 'a') {
					
					if(x == max_x) {
						axis = 'y';
						max_x -= 1;
						result++;
						count++;
						continue;
					}
					
					x++;
					
				// 왼쪽 방향으로 가고 있을 때	
				} else {
					
					if(x == min_x) {
						axis = 'y';
						way = 'b';
						min_x += 1;
						result++;
						count++;
						continue;
					}
					x--;
					
				}
				
			// y축으로 진행하고 있을 때	
			} else {
				// 아래로 내려가고 있을 때
				if(way == 'a') {
					
					if( y == max_y) {
						axis = 'x';
						way = 'b';
						max_y -= 1;
						result++;
						count++;
						continue;
						
					}
					
					y++;
					
				// 위로 올라가고 있을 때
				} else {
					
					if(y == min_y) {
						axis = 'x';
						way = 'a';
						min_y += 1;
						result++;
						count++;
						continue;
					}
					
					y--;
				}
				
			}
		}
		System.out.println(result);
		
	}
}
