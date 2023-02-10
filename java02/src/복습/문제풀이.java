package 복습;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

	}

}
