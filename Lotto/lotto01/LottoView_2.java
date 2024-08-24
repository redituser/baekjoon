package kr.ac.kopo.day01.lotto01;

import java.util.Arrays;
import java.util.Random;

public class LottoView_2 {
	
	public static void main(String[] args) {
		
		int[] numarr = new int[45];
		int[] six = new int [6];
		
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = i+1;
		}
		
		Random random = new Random();
		int n = 0;
		int a = 0;
		int c = 0;
		while(n < 6) {
			boolean tf = false;
			n ++;
			int randomnum = random.nextInt(numarr.length); //현재 랜덤에 선택된 숫자
			//randomnum 이 six 배열에 들어갈때 중복된 값이 있는지 검사해야함 
			//단 six 배열에 randomnum이 들어간다면 randomnum 의 마지막부터(length - i++) 
			//값을 넣고 배열의 (length - i++) 부터 값이 들어가야함
			
		

			
			//첫 번째 반복(일단 값을 넣고 numarr 배열의 뒤쪽에 넣은 값을 넣음)

			int temp = 0;
			for (int i = 0; i < six.length; i++) {
				six[i] = randomnum;
				temp = numarr[numarr.length -1 - a];
				numarr[numarr.length -1 - a] = numarr[randomnum];
				numarr[randomnum] = temp;
				a++;
			}
			
			
			//두번째 반복
			for (int i = 0; i < six.length; i++) {
				c++;
				if(six[i] == numarr[numarr.length -1 - c]) {
					tf = true;
				}
				if(!tf) {
					six[i] = random.nextInt(numarr.length);
				}	
			}
			
			
			System.out.println(Arrays.toString(six));
			
			
		}
		
		
		
	}

}
