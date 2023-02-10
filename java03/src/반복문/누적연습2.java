package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		//1.숫자누적
		int sum1 = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("전체 더한값은 >>" + sum1);
		
		//2.문자누적
		String sum = "";
		for (int i = 0; i <4; i++) {
			String data = JOptionPane.showInputDialog("먹고싶은 음식입력");
			sum = sum + data + "랑 ";
		}
		System.out.println(sum);
		
	}

}
