package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;

	public static void main(String[] args) {
	
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(500, 300);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JLabel number = new JLabel("0");
		Font font = new Font("바탕" ,Font.BOLD , 150 );
		number.setFont(font);
		number.setForeground(Color.white);
		
		JButton b0 = new JButton("2 빼기");
		b0.setBackground(Color.magenta);
		b0.setForeground(Color.black);
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = count - 2;
				number.setText(count + "");
				number.setForeground(Color.magenta);
			}
		});
		
		JButton b1 = new JButton("1 빼기");
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = count - 1;
				number.setText(count + "");
				number.setForeground(Color.green);
			}
		});
		JButton b2 = new JButton("0으로 초기화");
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
				number.setForeground(Color.white);
			}
		});
		
		JButton b3 = new JButton("1더하기");
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
				number.setForeground(Color.green);
			}
		});
		
		JButton b4 = new JButton("2더하기");
		b4.setBackground(Color.magenta);
		b4.setForeground(Color.black);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = count + 2 ;
				number.setText(count + "");
				number.setForeground(Color.magenta);
			}
		});
		
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(number);
		
		
		f.setVisible(true);
	}

}
