package kr.ac.kopo.day01.lotto01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoView_2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] six = new int[6];
		int [] numarr = new int[45];
		
		Random random = new Random();
		
		
		
		
		for (int i = 0; i < numarr.length; i++) {
			numarr[i]= i+1;
		}
		
		
		  
		int n = 0;
		int s = 0;
		
		while(n<6) {
			n++;
		for (int i = 0; i < six.length; i++) {
			
			int randomIndex = random.nextInt(numarr.length - s);
			 
			  int temp = numarr[numarr.length - 1 - s];
	            numarr[numarr.length - 1 - s] = numarr[randomIndex];
	            numarr[randomIndex] = temp;
	            
	            six[i] = numarr[numarr.length - 1 - s];
	            s++;
	            
		}
		   System.out.println(Arrays.toString(six));
		}
		
	}
}
