package 확인문제;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값입력");
		int num = sc.nextInt();
		System.out.print("종료값입력");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for (int i = num; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
//		System.out.print("시작값 >> ");
//		int start = sc.nextInt();
//		System.out.print("종룍값 >> ");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("최종 더한값은 " + sum);
//		
		sc.close();
		

	}

}
