package lang;

public class Main9 {

	public static void main(String[] args) {
		// 아래와 같은 모양을 출력하세요
		// ***
		// **
		// *
		// **
		// ***
		// *********
		// *******
		// *****
		// ***
		// *
		int i, j;
		
		for(i = 0; i < 5; i++) {
			if(i < 3) {
				for(j = 0; j < 3 - i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			else {
				for(j = 0; j < i - 1; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
		for(i = 0; i < 10; i = i + 2) {
			for(j = 0; j < 9 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
