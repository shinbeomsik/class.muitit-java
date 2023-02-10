package 배열응용;

import java.util.Random;

public class 수능만점자강사님꺼1나중에2상위30프로풀기 {

	public static void main(String[] args) {

		// 수능 10000명의 점수를 처리! ==>배열 필요
		int[] jumsu = new int[10000];
		// jumsu = {0,0,0,0,0,....0};
		// 랜덤으로 10000명을 넣어주세요 ==> Random 필요
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0~450
		}

		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		// 1)만점자가 몇명인지 ??
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : jumsu) {
			// 점수가 450과 동일한지 체크해서 true이면 카운트증가!
			if (x == 450) {
				maxCount++; // maxCount = maxCount + 1 ;
			} // if
				// 2)0점이 몇명인지??
			if (x == 0) {
				zeroCount++;
			} // if
		} // for

		System.out.println("수능 만점자 수 :" + maxCount + "명");
		System.out.println("수능 0자 수 :" + zeroCount + "명");

		// 3)편균은 어떻게 되었는지??
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 수험생의 평균은 " + avg);
		// 4)평균보다 +- 50점 주변에 있는사람은?(포함, >=

		int avgPlusMinus = 0; // 선언!할떄 자바는 변수를 만들어준다.!!

		for (int x : jumsu) {
			if ((avg - 50 <= x) && (x <= avg + 50)) {
				avgPlusMinus++;
			} // if
		} // for
		System.out.println("평균 범위에 있는 수험생 수는 " + avgPlusMinus + "명입니다.");

		// 점수의 상위 30%
		

	}

}
