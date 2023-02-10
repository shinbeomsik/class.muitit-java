package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String health = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 좋아하는 요일은?");
		
		String result = day + "에 저는 " + health +"을 합니다.";
		
		System.out.println(result);
				
		
	}

}
