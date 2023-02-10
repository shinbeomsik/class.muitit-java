package 확인문제;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요");
		String id = sc.next();
		System.out.print("비밀번호를 입력해주세요");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}
		
		
		sc.close();
		
		//강사님꺼
//		1.id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
////		  아니면 로그인 실패!
////		  ==> String은 ==비교 불가능. equals() 비교해야함.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("id입력>> ");
//		String id = sc.next(); //String입력
//		System.out.print("pw입력>> ");
//		String pw = sc.next(); //String입력
//		//조건이 여러개인 경우 ==> 논리연산자(조건1 && 조건2), ||
//		if (id.equals("root") && pw.equals("1234") ) {
//			JOptionPane.showMessageDialog(null, "로그인 성공");
//		} else {
//			JOptionPane.showMessageDialog(null, "로그인 실패");
//		}

	}

}
