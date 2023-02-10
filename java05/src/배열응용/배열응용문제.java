package 배열응용;

import java.util.Scanner;

public class 배열응용문제 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count1 = 0;// 2학기 성적이 오른학생
		int count2 = 0;// 1학기 2학기 성적이 같은학생

		// 1. 2학기에 성적이 오른 학생은 몇명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			} // if
				// 2. 1학기,2학기 성적이 동일한학생은 몇명?
			if (term1[i] == term2[i]) {
				count2++;
			} // if
		} // for
		System.out.println("2학기에 성적이 오른 학생 수:" + count1);
		System.out.println("1학기,2학기 성적이 동일한 학생 수:" + count2);
		// 3. 2학기 학생 중 만점(100)인 학생의 이름은과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기에 만점인 학생의 이름은 " + names[i] + " 번호는 " + i + "번입니다.");
			} // if
		} // for
			// 4. 1학기 성적의 평균과 2학기 성적의 평균중 어느쪽이 더 높은가요?
		int sum1 = 0; // 1학기 점수의 합
		int sum2 = 0; // 2학기 점수의 합
		double aver1 = 0; // 1학기 점수의 평균
		double aver2 = 0; // 2학기 점수의 평균
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];

		} // for
		aver1 = (double) sum1 / term2.length;
		aver2 = (double) sum2 / term2.length;

		if (aver1 > aver2) {
			System.out.println("1학기 평균이 더 큽니다.");
		} else if (aver1 < aver2) {
			System.out.println("2학기 평균이 더 큽니다.");
		} else {
			System.out.println("평균이 같습니다.");
		} // if

		// 5. 심화) 뉴진스의 1학기 성적,2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 위치는 " + i);
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + "\n뉴진스의 2학기 성적은" + term2[i]);
			}
		}

	}

}
