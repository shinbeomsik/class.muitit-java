package 상속혼자;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 움직이는스레드 {

	public static void main(String[] args) {
		
		스레드1 thread1 = new 스레드1();
		스레드2 thread2 = new 스레드2();
		스레드3 thread3 = new 스레드3();
		
		
		
		
		thread2.start();
		thread1.start();
		thread3.start();
		
		
	}

}
