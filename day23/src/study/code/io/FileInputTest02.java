package study.code.io;

import java.io.FileInputStream;

public class FileInputTest02 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("Test.txt");
			//읽기 위한 배열 선언
			byte[] readBuffer = new byte [100];
			int read =0;// 한번에 읽어오는 개수
			
			while((read = in.read(readBuffer)) != -1) {
				//읽어온 개수가 -1인건 읽을게 더 없다는 뜻.
				System.out.write(readBuffer, 0, read); //println 못씀
				// 콘솔에 배열을 시작부터 읽은 만큼 쓴다 는 뜻.(깨지지않음.- 배열에 한번에 담아서 가지고옴)
				//System.out.write(readBuffer, 0, read); --0번부터 읽어온곳 까지.
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch(Exception e) {
				
			}
		}
	}

}
