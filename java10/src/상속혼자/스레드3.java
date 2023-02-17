package 상속혼자;


public class 스레드3 extends Thread{
	
		@Override
		public void run() {
			for (int i = 1; i < 1000; i++) {
				try {
					Thread.sleep(7000);
					System.out.println("채팅방에" + i + "명이 퇴장하였습니다.");
				} catch (Exception e) {
					System.out.println("에러 발생");
				}
			}
			
		}
}
