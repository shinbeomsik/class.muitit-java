package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 배열을 만들때 이미 알고 있는 경우

		String[][] s = {
				{"축구","농구","야구"},
				{"등산","배구","족구"},
				{"낚시","스키","하키"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				
				System.out.println(s[i][j]);
			}//안쪽에 있는 for
		}//바깥쪽에 있는for
	}

}
