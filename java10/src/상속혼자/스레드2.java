package 상속혼자;

import java.util.Date;

public class 스레드2 extends Thread{
	
		@Override
		public void run() {
			for (int i = 1000; i > 0; i++) {
				Date date = new Date();
				
				try {
					Thread.sleep(1000);
					System.out.println(date);
					
				} catch (Exception e) {
					System.out.println("에러발생");
				}
			}
			
		}
}
