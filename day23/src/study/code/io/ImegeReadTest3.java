package study.code.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ImegeReadTest3 {
	public static void main(String[] args) {
		
		FileInputStream in = null; //메인
		BufferedInputStream bf = null; //보조스트림 초기화
		try {
			//메인
			in = new FileInputStream("good_img.jpg");
			//보조스트림 선언 --  메인스트림을 집어넣어서 유용하게 사용할수 있게!
			bf = new BufferedInputStream(in);
			
			int read =0;// 한번에 읽어오는 개수
			long start = System.currentTimeMillis(); //  현재 시간을 초로 나타냄.
			
			
			while((read = bf.read()) != -1) {
				//읽어온 개수가 -1인건 읽을게 더 없다는 뜻.
			//보조스트림을 읽음!	
			}
			long end = System.currentTimeMillis();
			double time =(double) (end-start)/1000 ;
			System.out.println("복사에 걸린 시간 : " + time + "초");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(bf != null) { ////보조스트림부터 -- 마지막으로 선언한것 부터 닫는다!
					bf.close();
				}
				if(in != null) { 
					in.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
