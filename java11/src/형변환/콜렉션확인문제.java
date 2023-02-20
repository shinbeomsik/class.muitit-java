package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1.한번 갔던 여행지는 가지 않으려고 합니다 . 가고 싶은 여행지 5곳을 컬렉션으로 만들어서 프린트
		HashSet place = new HashSet();
		place.add("부산");
		place.add("강릉");
		place.add("춘천");
		place.add("대구");
		place.add("속초");

		System.out.println(place);

		// 2.각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파 , 부엌에는 냉장고, 현관에는 신발의 정보를 컬렉션으로 만들어서
		// 1-전체 프린트, 2- 현관에는 무엇이 있나요? 3- 거실에 책상으로 변경하여 전체 프린트
		HashMap room = new HashMap();
		room.put("안방", "TV");
		System.out.println(room);
		room.put("거실", "쇼파");
		System.out.println(room);
		room.put("부엌", "냉장고");
		System.out.println(room);
		room.put("현관", "신발");
		System.out.println(room);

		System.out.println(room.get("현관"));
		room.replace("거실", "책상");
		System.out.println(room);

		// 3. 오늘 내가 항일 우선순위 5개 목록을 만들어서 순서가 있으면 ArrayList
		// 1- 전체 프린트 2- 첫번쨰 할 일과 마지막 할 일 프린트 3- 2번쨰 할 일을 "청소"로 변경해서 전체 프린트

		ArrayList doing = new ArrayList();
		doing.add("공부");
		doing.add("복습");
		doing.add("식사");
		doing.add("쉬기");
		doing.add("명상");

		System.out.println(doing);
		System.out.println(doing.get(0));
		System.out.println(doing.get(doing.size() - 1));
		// doing.add(1, "청소");
		doing.set(1, "청소");
		System.out.println(doing);

	}

}
