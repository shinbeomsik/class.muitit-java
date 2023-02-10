package 배열응용;

import java.util.Scanner;

public class 작년에갈곳스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] place1 = new String[3];
		String[] place2 = new String[3];

		int count = 0;
		for (int i = 0; i < place2.length; i++) {
			System.out.print("작년에 가보고 싶었던곳");
			place1[i] = sc.next();
		}
		for (int i = 0; i < place2.length; i++) {
			System.out.print("올해에 가고 싶었던곳");
			place2[i] = sc.next();
		}

		for (int i = 0; i < place2.length; i++) {
			if (place1[i].equals(place2[i])) {
				count++;
				System.out.println("가보고 싶었던곳이 동일한 곳은 " + count + "곳입니다.");
			}
		}
		sc.close();

	}

}
