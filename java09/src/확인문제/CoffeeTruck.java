package 확인문제;

public class CoffeeTruck extends Truck {
	
	String 브랜드;
	
	
	public void 커피만들다() {
		System.out.println("커피를 만든다");
	}


	@Override
	public String toString() {
		return "CoffeeTruck [브랜드=" + 브랜드 + ", 몇톤=" + 몇톤 + ", 오토=" + 오토 + ", 종류=" + 종류 + ", 색깔=" + 색깔 + ", 기름=" + 기름
				+ "]";
	}
}
