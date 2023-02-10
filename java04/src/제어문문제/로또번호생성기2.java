package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		// 가짜 랜덤한 값을 만들어주는 부품.
		Random r = new Random(10);//씨앗값,seed값!
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45) + 1)); //0부터 시작해서 ()수보다 1작은 숫자까지
		}
		
		Random r1 = new Random();
		
		for (int i = 0; i < 6; i++) {
			System.out.println( + (r1.nextInt(9) + 2));
		}
		
		Random r2 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println(" >> " + (r2.nextInt(28) + 3));
		}
		
		
	}

}
