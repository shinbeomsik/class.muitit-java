package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		//정렬을 할 때는  Arrays
		Random r = new Random(42);//씨앗값(seed)
		
		int[] jumsu = new int[10000];
		//for: 입출력 가능 , i를 활용해서 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;//0~999==>1~1000
		}//for
		//for-each: 알아서 위치값을 옮겨주면서 하나씩 꺼내온다!!
		//          출력용!
		for (int x : jumsu) {
			System.out.println(x);
		}//for-each
		//오름차순[적-->큰(오른차순), 큰-->작(내린차순)]
		Arrays.sort(jumsu);//오름차순
		System.out.println("---------------------");
		
		//정렬 후 확인
		for (int x : jumsu) {
			System.out.println(x);
		}//for-each
		
		//정열후 최대값, 최소값을 프린트
		System.out.println("최소값: " +jumsu[0]);
		System.out.println("최대값: " +jumsu[jumsu.length-1]);
		
		//상위30%, 인원 3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i]; // sum +=i;
		}//for
		System.out.println("상위 30%의 평균:" + sum30 / 3000.0);
		
		//하위 30프로의 평균
		
		int sum = 0;
		for (int i = 0; i < 3000; i++) {
			sum = sum + jumsu[i];
		}//for
		System.out.println("하위 30%의 평균:" + sum/3000.0);
	    String result =	Arrays.toString(jumsu);//비파괴, String
	    System.out.println(result);
	}
}


















