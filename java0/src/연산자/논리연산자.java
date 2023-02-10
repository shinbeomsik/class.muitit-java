package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
	//논리적으로 판단을 하고 싶은데, 조건이 2개 이상이여서 어떻게 판단할지 모르는 경우 사용
		
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		
		System.out.println("아이디가 동일한가? " + (id == id2));
		System.out.println("패스워드가 동일한가? " + (pw == pw2));
		
		//&& and조건 두 조건이 모두 맞아야 맞다라고 판단
		//로그인 처리!!
		System.out.println("로그인처리 " + (id == id2 && pw == pw2));
		
		int mem1 = 111;
		int mem2 = 222;
		//||, or 조건, 조건중에 한개라도 맞으면 맞다고 판단
		//||은 원에 포함되어있음 백스페이스 주변에 있는 원 표시
		System.out.println(mem1 == 111 || mem2 == 222);
	}

}
