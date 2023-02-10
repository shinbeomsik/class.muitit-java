package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입문제나중에풀기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(450, 600);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 40);
		Font font1 = new Font("D2coding", 1, 30);

		ImageIcon icon = new ImageIcon("6.png");

		JLabel label = new JLabel();
		label.setIcon(icon);
		JLabel label1 = new JLabel();
		label1.setText("아이디 입력");
		label1.setFont(font);
		label1.setForeground(Color.blue);
		JLabel label2 = new JLabel();
		label2.setText("패스워드 입력");
		label2.setFont(font);
		label2.setForeground(Color.blue);
		JLabel label3 = new JLabel();
		label3.setText("이름 입력");
		label3.setFont(font);
		label3.setForeground(Color.blue);
		JLabel label4 = new JLabel();
		label4.setText("전화번호 입력");
		label4.setFont(font);
		label4.setForeground(Color.blue);

		JTextField input = new JTextField(15);
		input.setFont(font1);
		input.setBackground(Color.yellow);
		input.setForeground(Color.red);

		JTextField input1 = new JTextField(15);
		input1.setFont(font1);
		input1.setBackground(Color.yellow);
		input1.setForeground(Color.red);
		JTextField input2 = new JTextField(15);
		input2.setFont(font1);
		input2.setBackground(Color.yellow);
		input2.setForeground(Color.red);
		JTextField input3 = new JTextField(15);
		input3.setFont(font1);
		input3.setBackground(Color.yellow);
		input3.setForeground(Color.red);

		JButton b = new JButton();
		b.setText("회원가입처리");
		b.setFont(font);
		b.setBackground(Color.pink);
		b.setForeground(Color.blue);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a1 = input.getText();
				String a2 = input1.getText();
				String a3 = input2.getText();
				String a4 = input3.getText();
				
				String result = "아이디: "  + a1 + "\n패스워드 : " + a2 + "\n이름 : " + a3 + "\n전화번호 :"+ a4;
				JOptionPane.showMessageDialog(f, result);
			}
			
		});

		f.add(label);
		f.add(label1);
		f.add(input);
		f.add(label2);

		f.add(input1);
		f.add(label3);
		f.add(input2);
		f.add(label4);
		f.add(input3);
		f.add(b);

		f.setVisible(true);
	}

}
