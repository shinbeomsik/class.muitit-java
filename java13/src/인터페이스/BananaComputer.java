package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 전원을키다() {
		System.out.println("바나나컴퓨터 전원을 키다");
	}

	@Override
	public void 운영체제를다운받다() {
		System.out.println("바나나컴퓨터 운영체제를 다운 받다.");
	}

	@Override
	public void 재실행하다() {
		System.out.println("바나나컴퓨터를 재부팅 하다");
	}

}
