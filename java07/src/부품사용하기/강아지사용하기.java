package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
			
		강아지 name = new 강아지();
		
		강아지 dog1 = new 강아지();
		dog1.나이 = 20;
		dog1.색깔 ="누렁이";
		dog1.성별 = '남';
		System.out.println("강아지1의 나이는 :" + dog1.나이 ); 
		System.out.println("강아지1의 색깔은 :" + dog1.색깔 ); 
		System.out.println("강아지1의 성별은 :" + dog1.성별 ); 
		
		dog1.먹이주다();
		dog1.산책시키다();
		
		강아지 dog2 = new 강아지();
		dog2.나이 = 15;
		dog2.색깔 = "점박이";
		dog2.성별 = '여';
		System.out.println("강아지2의 나이는 :" + dog2.나이 ); 
		System.out.println("강아지2의 색깔은 :" + dog2.색깔 ); 
		System.out.println("강아지2의 성별은 :" + dog2.성별 ); 
		
		dog2.먹이주다();
		dog2.산책시키다();
	}

}
