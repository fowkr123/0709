package lang;

public class Main5 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i < 3) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0; j <= 5 - i - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
