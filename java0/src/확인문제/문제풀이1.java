package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일 인가요?");
		String play = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String result = day + "에 수업후에 나는 " + play + "를 할 예정입니다.";
		
		System.out.println(result);

	}

}
