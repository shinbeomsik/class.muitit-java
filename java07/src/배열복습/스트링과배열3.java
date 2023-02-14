package 배열복습;

public abstract class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "   011-245-1234   ";
		// 1)양쪽 공백을 제거하시오
		String s1 = s.trim();
		System.out.println(s1);

		// 2)-을 기준으로 분리
		String[] s2 = s1.split("-");
		for (String x : s2) {
			System.out.print(x + " ");
		} // for

		// 3)첫번째 문자열이 011이면SK, 019이면LG,나머지는 APPLE
		System.out.println();
		if (s2[0].equals("011")) {
			System.out.println("SK");
		} else if (s2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		} // if

		// 4)두번쨰 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		if (s2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// 5)전체 전화번호의 길이가 10글자 이상이면 유요한 전화번호 아니면 유효하지않은 전화번호
		int total = s2[0].length() + s2[1].length() + s2[2].length();
		System.out.println(total);
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않는 전화번호");
		}
		
		int total2 = 0;
		for (int i = 0; i < s2.length; i++) {
			total2 = total2 + s2[i].length();
		}
		System.out.println(total2);
		
		String s4 = s1.replace("-", "");
		System.out.println(s4);
				
	}

}
