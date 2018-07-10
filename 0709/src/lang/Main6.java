package lang;

import java.io.IOException;

public class Main6 {

	public static void main(String[] args) {
		// Hello World를 백만번 출력하는데 걸리는 시간 구하기
		long start =  System.currentTimeMillis();
		
		for(int i = 0; i < 1000000; i++) {
			System.out.println("Hello World!");
		}

		long end = System.currentTimeMillis();
		System.out.println("작업시간 : " + (end - start));
		
		//환경변수 확인
		System.out.println(System.getenv("path"));
		//시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		//Runtime 인스턴스 생성 ( Runtime 클래스의 인스턴스는 static인 getRuntime()으로 만든다 )
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://naver.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
