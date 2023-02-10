package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
		// 인기 투표해봅시다.
		// 1)아이유 2)뉴진스 3)BTS

		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 10; i++) {

			String data = JOptionPane.showInputDialog("인기투표 1.아이유, 2.유재석 3.BTS");

			if (data.equals("1")) {
				a++;
			} else if (data.equals("2")) {
				b++;
			} else if (data.equals("3")) {
				c++;
			} else {
				JOptionPane.showMessageDialog(null, "1번 2번 3번중에 선택해주세요");
				i--;
			}
		}

		System.out.println("인기투표");
		System.out.println("아이유  : " + a + "표.");
		System.out.println("뉴진스  : " + b + "표.");
		System.out.println("BTS  : " + c + "표.");

	}

}
