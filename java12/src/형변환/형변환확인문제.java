package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); //Object <-업캐스팅- Integer <-오토박싱- int
		me.add(189.1); //Object <- Double <- double
		me.add(false); //Object <- Boolean <- boolean
		me.add('남'); //Object <- Character <- char
		
		//ArrayList는 toString()가 재정의
		//me라는 참조형이기 때문에 me를 프린트하면 주소가 프린트
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String 으로 만들어주도록 정의함
		//me를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		System.out.println(me);
		
		int money = (Integer)me.get(0) + 2000; //int 이렇게 해도 상관없음  int <-오토언박싱- Integer <-다운캐스팅- Object
		System.out.println(money);
		
		double height = (Double)me.get(1) + 10; //double <- Double <- Object
		System.out.println(height);
		
		boolean breakfast = (boolean)me.get(2); //boolean <- Boolean <- Object
		System.out.println(breakfast);
		if (breakfast) { //if(조건) :조건이 true이면,
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		
		char gender = (char)me.get(3); // char <- Character <- Object
		if (gender == '남') {
			System.out.println("주빈 번호는 1, 3입니다.");
		} else {
			System.out.println("주민 번호는 2, 4입니다.");
		}
		
	}
}
