package 확인문제;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 구매갯수");
		int apple = sc.nextInt();
		System.out.print("사과 한개당 가격");
		int count = sc.nextInt();
		System.out.print("딸기 구매갯수");
		int st = sc.nextInt();
		System.out.print("딸기 한개당 가격");
		int count1 = sc.nextInt();
		
		System.out.println("사과의 구매 가격은" + count + "입니다.");
		System.out.println("딸기의 구매 가격은" + count1 + "입니다.");
		System.out.println("전체 구매 가겨은" + ((apple * count) + (st * count1)) + "원 입니다.");
		
		
		
		//강사님꺼
//		System.out.print("사과 구매갯수 >> ");
//		int aCount = sc.nextInt();
//		System.out.print("사과 한개당 가격입력 >> ");
//		int aPrice = sc.nextInt();
//		System.out.print("딸기 구매갯수 >> ");
//		int bCount = sc.nextInt();
//		System.out.print("딸리 한개당 가격입력 >> ");
//		int bPrice = sc.nextInt();
//		
//		
//		int aTotal = aCount * aPrice;
//		int bTotal = bCount * bPrice;
//		int total = aTotal + bTotal;
//		
//		System.out.println("사과 구매 금액은 " + aTotal + "원");
//		System.out.println("딸기 구매 금액은 " + bTotal + "원");
//		System.out.println("전체 구매 금액은 " + total + "원");
		
		
		
		sc.close();

	}

}
