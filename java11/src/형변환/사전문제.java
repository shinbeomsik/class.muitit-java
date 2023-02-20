package 형변환;

import java.util.HashMap;

public class 사전문제 {

	public static void main(String[] args) {
		HashMap map = new HashMap();

		// map.put(키,값)
		map.put("사과", "Apple");
		map.put("멜론", "Melon");
		map.put("물", "Water");
		System.out.println(map);
		System.out.println(map.get("사과")); // get(키)
		map.remove("물");
		System.out.println(map);
		map.replace("멜론", "Melons");
		System.out.println(map);
}

}
