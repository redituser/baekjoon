package kr.ac.kopo.day01.lotto01;


import java.util.Arrays;
import java.util.Random;

public class LottoUtil {


	public static String getLotto() {
		Random random = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45)+1;
			
			
		}
		String arr1 = Arrays.toString(arr);
		return arr1;
	
	}

}
