package study.code.io;

import java.io.FileInputStream;

public class ImegeReadTest01 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("good_img.jpg");
			
			int read =0;// 한번에 읽어오는 개수
			long start = System.currentTimeMillis(); //  현재 시간을 초로 나타냄.
			
			
			while((read = in.read()) != -1) {
				//읽어온 개수가 -1인건 읽을게 더 없다는 뜻.
			//**배열을 이용하지 않으면 속도가 느림....! 	
			}
			long end = System.currentTimeMillis();
			double time =(double) (end-start)/1000 ;
			System.out.println("복사에 걸린 시간 : " + time + "초");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
