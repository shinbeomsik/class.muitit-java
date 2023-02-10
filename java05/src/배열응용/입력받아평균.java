package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을떄 ==>배열을사용!!
		// 1.배열을 만들어두셈
		int[] jumsu = new int[5];

		// 배열에 값을 넣을때에는 인덱스가 필요하다 ==>그래서 i 가 있는 for문사용
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣는다.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		// 1.합계구해서, 평균 구해보기
		int sum = 0;
		int aver = 0;
		for (int i = 0; i < jumsu.length; i++) {
			aver++;
			sum = sum + jumsu[i];
		}
		System.out.println("전체 합계 :" + sum);
		System.out.println("평균 :" + (double) sum / aver);

//           	1. 전체 합계구해서, 평균구해보세요.
//				==> 평균 = 합계 / 전체갯수
//				int sum = 0;
//				for (int x : jumsu) {
//					sum = sum + x; // sum += x; 서로 같은의미
//				}
//				System.out.println("전체합계: " + sum);
//				double avg = (double)sum / jumsu.length;
//				System.out.println("전체평균: " + avg);

		// 2.300이상되는 숫자만 찾아서, 합계구하기.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계 :" + sum2);

		// 3.300이상 되는 위치인 index를 프린트

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.print("jumsu[" + i + "]" + " ");
			}
		}
	}

}
