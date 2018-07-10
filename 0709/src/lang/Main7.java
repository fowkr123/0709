package lang;

public class Main7 {

	public static void main(String[] args) {
		//문자로 나누고, 소문자를 대문자로 바꿀 문자열을 선언한다.
		String str = "Hello";
		//결과값을 넣을 변수
		String result = "";
		//str의 문자열 개수이다 ( 5 )
		int size = str.length();
		
		for(int i = 0; i < size; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - 32);
			}
			result = result + ch;
		}
		System.out.println(result);
	}
}
