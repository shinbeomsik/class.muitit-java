package 조건문;

import java.util.Date;

public class IF문6옮기기 {

	public static void main(String[] args) {
	
		Date date = new Date();
		
		int year = date.getYear() + 1900;
		
		if (year > 2000) {
			System.out.println("밀레니엄 세대시군요");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("쉬~~~~~~자");
			break;
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("열~~심히 공부하자");
			break;
		}

		int month = date.getMonth() + 1;
		
		switch (month) {
		case 2:
			for (int i = 1; i < 29; i++) {
				System.out.println(i);
			}
			break;
		case 4: case 6: case 9: case 11:
			for (int k = 1; k < 31; k++) {
				System.out.println(k);
			}
			break;
		default:
			for (int m =1 ; m < 32; m++) {
				System.out.println(m);
			}
			break;
		}
		
		
		}
		
	}

