package 순차문;

//부품이 있는 위치를 알려주는 역활
import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 --> 처리 -->출력
		//입력 ->부품 사용, 망치같이 언제나 바로 사용할수 있는거
		String data1 = JOptionPane.showInputDialog("당신의 취미는? ");
		String data2 = JOptionPane.showInputDialog("언제하시나요? ");
		
		//처리 ->글자 연결 (+연산자이용, 결합연산자)
		//			 더해지는 데이터가 하나라도 String 이면 결과는 무조건 String
		String result = data1 + "" +  data2;
		
		//출력 ->모니터 화면에 띄움
		
		System.out.println(result);
		

	}

}
