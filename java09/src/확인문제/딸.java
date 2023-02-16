package 확인문제;

public class 딸 {

//static 확인문제
//딸.java ==> 멤버변수(이름, 성별), static변수(아빠지갑), 멤버멤서드(tv보다())
//- 딸이 태어날때마다 아빠지갑에서 1000원씩 꺼내서 줌.
//- 딸이 태어날때마다 카운트
//우리집.java ==>
//	딸 d1 = new 딸("홍길순", "여");
//	딸 d2 = new 딸("홍길진", "여");
//           a. 딸들의 정보 출력
//           b.딸이 몇명인지 카운트한 것 프린트
//           c. 현재 남은 아빠 지갑에 들어있는 돈 프린트
	String 이름;
	char 성별;
	
	static int wallet = 100000; 
	static int count = 0;
	
	public void tv보다() {
		System.out.println("전원을 키다");
		System.out.println("채널을 조정하다");
		System.out.println("음량을 조정하다");
		System.out.println("재미있게 시청하다");
	}

	public 딸(String 이름, char 성별) {
		wallet = wallet - 10000;
		count++; //count = count + 1;   count =+ 1;
		this.이름 = 이름;
		this.성별 = 성별;
	}

	@Override
	public String toString() {
		return "딸 [이름=" + 이름 + ", 성별=" + 성별 + "]";
	}
	
	
	
	
	

}
