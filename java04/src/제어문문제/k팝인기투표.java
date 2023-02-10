package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class k팝인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(430, 600);
		Font font = new Font("D2coding",1,50);
		Font font1 = new Font("고딕",1,20);
		Font font2 = new Font("궁서",1 ,20);
		f.getContentPane().setBackground(Color.gray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label0 = new JLabel();
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JButton b = new JButton();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		
		
		ImageIcon icon = new ImageIcon("ive.jpg");
		b.setIcon(icon);
		ImageIcon icon1 = new ImageIcon("nw2.png");
		b1.setIcon(icon1);
		ImageIcon icon2 = new ImageIcon("oyu.jpg");
		b2.setIcon(icon2);
		
		b.addActionListener(new ActionListener() {
			int a = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				label.setText(a + "표");
				
			}
		});
		b1.addActionListener(new ActionListener() {
			int b = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b++;
				label1.setText(b + "표");
				
			}
		});
		b2.addActionListener(new ActionListener() {
			int c = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c++;
				label2.setText(c + "표");
				
			}
		});
		
		label0.setFont(font);
		label0.setText("K-pop 인기투표");
		
		
		label3.setText("1.아이브 After LIKE");
		label3.setFont(font1);
		label3.setForeground(Color.pink);
		label4.setText("2.뉴진스  Attention");
		label4.setFont(font1);
		label4.setForeground(Color.blue);
		label5.setText("3.윤하 사건의 지평선");
		label5.setFont(font1);
		label5.setForeground(Color.cyan);
		
		label.setText("");
		label.setFont(font2);
		label1.setText("");
		label1.setFont(font2);
		label2.setText("");
		label2.setFont(font2);
		
		f.add(label0);
		f.add(b);
		f.add(label3);
		f.add(label);
		f.add(b1);
		f.add(label4);
		f.add(label1);
		f.add(b2);
		f.add(label5);
		f.add(label2);
		
		f.setVisible(true);

	}

}
