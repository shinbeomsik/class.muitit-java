package 상속기본;

public class 볼펜 extends 학용품 {
	
	int size;
	
	public void 글을쓰다() {
		System.out.println("펜을 가지고 글을쓰다");
	}

	@Override
	public String toString() {
		return "볼펜 [size=" + size + ", price=" + price + ", company=" + company + "]";
	}
	
	
	
}
