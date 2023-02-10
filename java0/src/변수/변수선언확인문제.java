package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 149;
		double num2 = 22.15;
		char b = '한';
		boolean c = true;
		
		//기본 데이터 X ==> 너무 많이 쓰기 때문에 기본형처럼 쓸수있는 유일한 데이터
		//스트링, 실!!, 문자열!! 다 같은말
		String name = "홍길동";
				
		System.out.println("정수값은 "+ num + "입니다.");
		System.out.println("실수값은" +num2 + "입니다.");
		System.out.println("문자 1개의 값은 " + b + "입니다.");
		System.out.println("부울렌값은 " + c +"입니다.");
		System.out.println("나의 이름은 " + name);
		
	}

}
