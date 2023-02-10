package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자(사칙연산자, + - * / (%=>나머지)
		
		int x = 20;
		int y = 10;
		
		//하나라도 문자열이면 +이건 결합의 기능을 한다 ,결합연산자
		System.out.println("더한 값은 " +(x + y));
		System.out.println("뺸 값은 " + (x - y));
		System.out.println("곱한 값은 " +(x * y));
		System.out.println("나눈 값은 " +(x / y));
		System.out.println("나머지 값은 " +(x % y));

	}

}
