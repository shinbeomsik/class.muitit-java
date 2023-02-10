package 복습;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
		
		String no = "A100EX";
		char ch = no.charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("아무데도 아님");
			break;
		}
		
	}

}
