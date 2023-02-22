package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 전원을키다() {
		System.out.println("애플컴퓨터 전원을 키다");
	}

	@Override
	public void 운영체제를다운받다() {
		System.out.println("애플컴퓨터 운영체제를 다운을 받다.");
	}

	@Override
	public void 재실행하다() {
		System.out.println("애플컴퓨터를 다시 재부팅한다.");
	}

}
