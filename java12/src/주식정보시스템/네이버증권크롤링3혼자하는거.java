package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3혼자하는거 {
//크롤리은 인터넷 문서(html)를 다 받아와서
//html문서를 분석(parser,파싱)을 해서 내가 원하는 정보를 추출하는 것
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=000660");

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			
			Elements codeList = doc.select(".today");
			System.out.println(codeList);
			
//			System.out.println("=====");
			Elements list = doc.select("span.blind");
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(i +": " + list.get(i));
//			}

			Element tag1 = list.get(15);
			String yes = tag1.text();
			System.out.println("전일가 : " + yes);
			
			Element tag2 = list.get(19);
			String tod = tag2.text();
			System.out.println("시가 : " + tod);
			
			//aside_invest_info
			
			Elements codeList2 = doc.select(".f_up");
			for (int i = 0; i < codeList2.size(); i++) {
				System.out.println( i + ":" + codeList2.get(i));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}
