package 복습;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)에서 선택");
		
		switch (food) {
		case "자장면":
			System.out.println("중국집으로가요");
			break;
		case "라면":
			System.out.println("분식집으로가요");
			break;
		case "회":
			System.out.println("횟집으로가요");
			break;
		default:
			System.out.println("안먹어요");
			break;
		}

	}

}
