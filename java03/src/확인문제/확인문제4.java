package 확인문제;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값입력 >> ");
		int start = sc.nextInt();
		System.out.print("종료값입력 >> ");
		int end = sc.nextInt();
		System.out.print("점프값입력 >> ");
		int jump = sc.nextInt();
		
		int sum = 0;
		
		for (int i = start; i < end; i = i + jump) {
			sum = sum + i;
			if (sum >= 100) {
				
			}
			
		}

		
		
		
//		System.out.print("시작값 >> ");
//		int start = sc.nextInt();
//		System.out.print("종료값 >> ");
//		int end = sc.nextInt();
//		System.out.print("점프값 >> ");
//		int jump = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i = i + jump) {
//			sum = sum + i;
//			if (sum >= 100) {
//				System.exit(0);
//			}
//		}
//		System.out.println("최종 더한 값은 " + sum);
//		
		
		sc.close();
	}

}
