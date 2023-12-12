package study.code.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputTest01 {
	public static void main(String[] args) {
		
		//파일을 읽는 객체
		FileInputStream in =null;
		try {
		in = new FileInputStream("test.txt");
		
		//파일을 읽어서 출력해 봅시다
		int read =0;
		while((read = in.read()) != -1) { //-1이 아닐때까지 파일을 읽기(한자,한자 받는것)
			System.out.print((char)read); //글자형태로 (한글은 깨짐)
			//print 로 쳤는데도 줄바뀌는 이유 - 엔터, 스페이스 모두 문자로 취급하기에
		}
		} catch (Exception e) { //파일이 없을때 
 			e.printStackTrace(); //추척할 결과 내용을 모두 출력해라.(에러난 부분 찾을 수 있음)
		}finally { 
			try {
				if(in != null) {
					in.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
	
	


