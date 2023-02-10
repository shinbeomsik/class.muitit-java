package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10]; //legnth: 10
//		//index는 0부터 시작, 마지막 위치에 인덱스는 분명히 마지막 length보다 한개 작다
//		//0~9
//		System.out.println(x.length);
//		x[0] = 10;
//		x[1] = 20;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(x[i] + " ");
//		}
////		System.out.println(x[0]);
////		System.out.println(x[1]);
////		System.out.println(x[2]);

		// 우리가족은 성별을 char[]로 저장 ,프린트
		// 우리가족의 이름을 String[]로 저장 ,프린트
		// 우리가족의 시력을 double[]로 저장 ,프린트
		// 우리가족이 점심을 먹었는지 boolean[]로 저장 ,프린트
		char[] gender = { '남', '남', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println("");
		String[] name = { "홍길동", "허준", "신사임당" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println("");
		double[] cm = { 172.3, 168.4, 159.6 };
		for (int i = 0; i < cm.length; i++) {
			System.out.print(cm[i] + " ");
		}
		System.out.println("");
		boolean[] lunch = { true, true, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
		
		System.out.println();
		
		String[] s = new String[4];
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}

}
