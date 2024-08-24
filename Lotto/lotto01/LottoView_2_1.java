package kr.ac.kopo.day01.lotto01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoView_2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int[] numarr = new int[45];
		int[] six = new int[6];
		
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = i+1;
		}
		
		
		
		
		
		int s = 0;
		
		for (int i = 0; i < six.length; i++) {
			int n = 0;
			
			while(n < 6) {
				
				int randomnum = random.nextInt(numarr.length - s);
				boolean tf = false;
				int temp = numarr[numarr.length-1-s];
				numarr[numarr.length-1-s] = numarr[randomnum];
				numarr[randomnum] = temp;
				
				six[n] = randomnum;
				s++;
				
				for (int j = numarr.length; j < numarr.length-1-s; j--) {
					if(six[i] == numarr[j]) {
						tf =true;
					}
					if(!tf) {
						six[i] = random.nextInt(numarr.length);
						n++;
					}
				}
			
				
				}
			
			System.out.println(Arrays.toString(six));
		}
	
			
	}

}
