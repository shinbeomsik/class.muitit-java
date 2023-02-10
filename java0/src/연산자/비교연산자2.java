package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		
		//기본형은 연산자(기호)를 이용해서 비교가능???
		//기본형 데이터는 비교연산자를 가지고 비교가능
		//기본형 데이터가 아니면 비교연산자를 가지고는 비교 불가능 (다른 부품이 필요하다)
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println("아이디가 동일한가? " + (id == id2));
		System.out.println("패스워드가 동일한가? " + (pw == pw2));
	}

}

//정수 실수 문자 논리형 + String
//산술연산자 + - * / %  비교 연산자 == != > >=  논리연산자  && || !
// int 변수명 = 초기값;
// double 변수명 = 초기값;
//데이터타입  변수명 = 초기값;