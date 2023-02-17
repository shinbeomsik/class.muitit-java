package 상속기본;

public class FlyCar extends Car{
	boolean fly;
	
	public void fly() {
		System.out.println("날아서 앞으로 운전하다");
	}

	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", color=" + color + "]";
	}
	
	
	
}
