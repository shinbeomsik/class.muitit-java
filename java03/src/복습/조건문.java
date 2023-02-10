package 복습;

public class 조건문 {

	public static void main(String[] args) {
		
		int target = 77; //숫자 맞추기
		int me = 77; //내가 시도한값
		
		//조건은 비교연산자가 들어감 , 결과는 무조건 논리형!!
		if (target == me) {//true
			System.out.println("정답입니다.!");
		} else {
			System.out.println("오답입니다.!");
		}
		
		//if 는 조건이 만족하면 더이상 처리하지않음
		//if문은 자체 break기능이 있다
		
		//switch case는 자체 break가 없음
		//그래서 내가 멈추고 싶은곳에 break를 써줘야함
		
		String you = "신나";
		
		switch (you) {
		case "로또":
			System.out.println("정답이다!!!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!!!");
			break;
		default: //위에 조건이 다 아닐때 실행하고 싶은 내용이 있으면 여기에 넣어주셈!!
			System.out.println("그만해");
			break;
		}
		
	}

}
