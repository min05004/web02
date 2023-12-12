package study.code.out;

import java.io.FileOutputStream;

public class FileOutTest01 {
public static void main(String[] args) {
	
	FileOutputStream out = null;
	
	try {
		/**
		 * FileOutputStream(쓰기대상, 이어쓰기 옵션)
		 * 이어쓰기 옵션 : flase -> 동일 파일명 무시 전체 덮어쓰기
		 * 				true -> 기존파일에 내용 추가
		 */
		out = new FileOutputStream("write.txt",true);
		
		out.write('B');
		out.write('Y');
		out.write('C');
		
	}catch(Exception e){
		
	}finally {
		try {
			if(out != null) {
				out.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
