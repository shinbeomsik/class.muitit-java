package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("ID입력>>");
//		String id = sc.next();
//		System.out.print("pw입력>>");
//		String pw = sc.next();
//		
//		//조건이 여러개인 경우 ==> 논리연산자(조건1 &&조건2)
//		
//		if (id.equals("root") && pw.equals("1234")) {
//			JOptionPane.showMessageDialog(null, "로그인성공");
//		} else {
//			JOptionPane.showMessageDialog(null, "로그인실패");
//		}
//		
//		
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
//		
//		
//
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

		System.out.print("시작값 >> ");
		int start = sc.nextInt();
		System.out.print("종료값 >> ");
		int end = sc.nextInt();
		System.out.print("점프값 >> ");
		int jump = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i = i + jump) {
			sum = sum + i;
			if (sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + sum);

		
		sc.close();
			
	}

}
