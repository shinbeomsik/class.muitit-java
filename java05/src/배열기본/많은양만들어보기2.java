package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];

		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(19) + 2;

		}

		for (int x : jumsu) {
			System.out.println(x);
		}
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 15) {
				count++;
				sum = sum + jumsu[i]; 
				
				}
			}
		
		System.out.println("15이상의 숫자의 갯수" + count);
		System.out.println("15이상 총합: " + sum);

	}

}
