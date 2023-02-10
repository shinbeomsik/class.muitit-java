package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		//조건을 쓸때는 비교하는것으로 쓰고, 결과는 true/false가 나와야한다
		//비교연산자로 비교할수있는것은 기본형 데이터만 가능!
		if (x == 0) { 
			System.out.println("내가 실행되겠지요?");
		}else {//false일때 처리하고 싶은 내용을 쓰기!
			System.out.println("나는 조건이 맞지않을때 실행됨");
		}
		
		if (x == 1) {
			System.out.println("나는 실행될까요?");
		}
	}

}
