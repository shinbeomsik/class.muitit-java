package 제어문문제;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0; 
		int b = 0;
		int c = 0;
		int data = 0;
		System.out.println("인기 투표 시스템");
		System.out.println("=============");

		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			data = sc.nextInt();
			if (data == 4) {
				System.out.println("시스템을 종료합니다");
				System.out.println("===============");
				System.out.println("아이유" + a + "표");
				System.out.println("방탄" + b + "표");
				System.out.println("뉴진스" + c + "표");
				System.out.println("===============");
				break;
			} else if (data == 1) {
				a = a + 1;
			} else if (data == 2) {
				b = b + 1;
			} else {
				c = c + 1;
			}

		}
		sc.close();
	}

}
