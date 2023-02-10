package 배열응용;

import java.util.Scanner;

public class 풀어보기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1번문제
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("정수를 입력해 주세요 >>");
			a[i] = sc.nextInt();
		}

		System.out.println("==============");
		System.out.println(a[0] + a[2]);

		// 2번문제
		String[] com = new String[3];

		for (int i = 0; i < com.length; i++) {
			System.out.print("무엇을 넣겠습니까?");
			com[i] = sc.next();
		}

		System.out.println("===============");
		System.out.println(com[0] + "보다는" + com[1]);

		sc.close();
	}

}
