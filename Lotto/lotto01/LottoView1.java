package kr.ac.kopo.day01.lotto01;

import java.util.Arrays;
import java.util.Random;

public class LottoView1 {
	
	public static void main(String[] args) {
	
		int[] arr = new int[45];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		Random random = new Random();
		int [] randomarr = new int[6];
		
		
		
		int n = 0;
		
		while(n < 6) {
		
			
			int rannumindex = random.nextInt(arr.length);  
			int selectnum = arr[rannumindex];	
			
			boolean tf = false;
			for (int i = 0; i < n; i++) {
			 	if(randomarr[i] == selectnum) {
			 			tf = true;
			 			break;
			 	}
			}
			
			
			if(!tf) {
				randomarr[n] = selectnum;
				int temp = arr[arr.length-1-n];
				arr[arr.length-1-n] = selectnum;
				arr[rannumindex] = temp;
				n++;
			}
			
			
		
		}
		
		 
		
		
		
}
	
	
	
	
	
}
