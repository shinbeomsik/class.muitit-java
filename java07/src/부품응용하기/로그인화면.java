package 부품응용하기;

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
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		//font , flowlayout
		//JFrame , ImageIcon3개, ImageLabel
		//idlabel, pwlabel , id입력값, pw입력값
		//로그인버튼. 리셋버튼
		
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서" , 1 , 30);
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디 :");
		JLabel pw = new JLabel("패스워드:");
		id.setFont(font);
		pw.setFont(font);
		
	    ImageIcon icon1 = new ImageIcon("diary.jpg");
	    ImageIcon icon2 = new ImageIcon("2231.png");
	    ImageIcon icon3 = new ImageIcon("22223.png");
	    top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		idText.setFont(font);
		idText.setHorizontalAlignment(JTextField.CENTER);
		
		JTextField pwText = new JTextField(10);
		pwText.setFont(font);
		pwText.setHorizontalAlignment(JTextField.CENTER);
		
		//1) 버튼에 액션기능을 add
		//2) 클릭했을 떄 "어떤 부품"이 처리를 담당할지 new로 만들어주셈
		//3) 클릭했을때 "어떻게 처리할지를" 써주세요.
		
		JButton login = new JButton();
		login.setIcon(icon2);
		login.setBackground(Color.green);
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//idText,pwText에 getText()
				String id2 = idText.getText(); //"root"
				String pw2 = pwText.getText(); //"1234"
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공");
					f.setVisible(false);
					//일기장쓰기 부품의 open()기능 쓰자
					일기장쓰기 diary = new 일기장쓰기();
					diary.open(); //메서드 사용 ==> 메서드 호출!!
				}else {
					JOptionPane.showMessageDialog(f, "로그인실패");
				}
				
				
			}
		});//login add end
		
		
		JButton reset = new JButton();
		reset.setIcon(icon3);
		reset.setBackground(Color.green);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//reset을 누르면 텍스트필드에 공백을 넣어라
				idText.setText("");
				pwText.setText("");
					
			}
		}); //reset add end
		
		
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		
		
		
		
		f.setVisible(true);
	}

}
