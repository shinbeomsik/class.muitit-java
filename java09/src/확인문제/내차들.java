package 확인문제;

public class 내차들 {

	public static void main(String[] args) {
		
		CoffeeTruck cot = new CoffeeTruck();
		cot.기름 = "휘발유";
		cot.몇톤 = "8톤";
		cot.브랜드 = "뺵다방";
		cot.색깔 = "노란색";
		cot.오토 = false;
		cot.종류 = "깔쌈한 트럭";
		
		cot.운전하다();
		cot.기름값();
		cot.크다();
		cot.커피만들다();
		
		System.out.println(cot);
	}

}
