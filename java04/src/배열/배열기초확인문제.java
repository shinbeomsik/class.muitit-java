package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// 1.int크기가 5인 배열을 생성
		int[] a = new int[5];
		// 2.배열의 크기를 프린트
		System.out.println(a.length);
		// 3.배열의 첫번쨰 위치에 100을 넣어서,프린트
		a[0] = 100;
		System.out.println(a[0]);
		// 4.배열의 마지막 위치에 500을 넣어서,프린트
		a[4] = 500;
		System.out.println(a[4]);
		// 5.배열의 3번쨰 위치에 200을 넣어서,프린트
		a[2] = 200;
		System.out.println(a[2]);
		// 6.배열의 전체 데이터 프린트
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 7.배열의 전체 데이터를 인덱스와 함께프린트
		for (int i = 0; i < a.length; i++) {
			System.out.println("a" + "[" + i + "] :" + a[i]);
		}

	}

}
