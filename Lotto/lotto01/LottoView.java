package kr.ac.kopo.day01.lotto01;

import java.util.Arrays;

public class LottoView {

	public void start() {
		
		String[] arr= new String[6];
		
	
	
		for (int i = 1; i <= 6; i++) {
			String arr1 = LottoUtil.getLotto();
			System.out.println("게임" + i + ":" + arr1);
		}
		
		
		
		
		
	}
	

}
