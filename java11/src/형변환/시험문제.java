package 형변환;

import java.util.LinkedList;

public class 시험문제 {

	public static void main(String[] args) {
		
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		
		for (int i = 0; i < test.size(); i++) {
			test.remove();
			System.out.println(test);
		}
		
//		System.out.println(test);
//		test.remove(); //국어삭제
//		System.out.println(test);
//		test.remove(); //수학삭제
//		System.out.println(test);
//		test.remove(); //컴퓨터 삭제
//		System.out.println(test);
		
	}

}
