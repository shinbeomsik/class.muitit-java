package 배열응용;

import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {

		// 수능 10000명의 점수를 처리!
		// 랜덤으로 10000명을 넣어주세요
		// 0~450

		// 1)만점자가 몇명인지 ??
		// 2)0점이 몇명인지??
		// 3)편균은 어떻게 되었는지??
		// 4)평균보다 +- 50점 주변에 있는사람은?

		int[] a = new int[10000];
		Random r = new Random(42);
		int per = 0;
		int zero = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(451);
			if (a[i] == 450) {
				per++;
			} else if (a[i] == 0) {
				zero++;
			}

		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double result = (double) sum / a.length;
		double aver1 = result - 50;
		double aver2 = result + 50;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= aver2 && aver1 <= a[i]) {
				count++;
			}
		}

		System.out.println(per);
		System.out.println(zero);
		System.out.println(sum);
		System.out.println(result);

		System.out.println(count);
	}

}
