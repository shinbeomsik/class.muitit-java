package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {

		Day day1 = new Day("자바공부", 8, "집"); // 4개
		System.out.println(Day.count);
		//객체 생성할떄마다 count , time2
		System.out.println(Day.time2);
		//static이 붙은 메서드나 변수는 객체생성하지않아도
		//클래스이름으로 바로 접근해서 사용가능!!
		
		Day day2 = new Day("복습", 10, "집");
		System.out.println(Day.count);
		System.out.println(Day.time2);
		
		Day day3 = new Day("시험", 2, "MLP");
		System.out.println(Day.count);
		System.out.println(Day.time2);
		// 총 12개가 다이나믹생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴변수
		// 인스턴스 변수라고 부른다.
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
