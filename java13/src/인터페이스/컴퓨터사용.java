package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer Apple = new AppleComputer();
		BananaComputer Banana = new BananaComputer();
		Apple.전원을키다();
		Apple.운영체제를다운받다();
		Apple.재실행하다();
		
		Banana.전원을키다();
		Banana.운영체제를다운받다();
		Banana.재실행하다();
	}

}
