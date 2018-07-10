package lang;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// 금액을 입력받아서 오만원, 만원짜리를
		// 몇 장 주어야 하는지 계산하는 프로그램을 작성
		// ex) 260000 입력 -> 결과 : 5만원 3장 만원 1장 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시면 5만원, 1만원짜리를 각각 몇 장 주어야 하는지 계산해드리겠습니다 : ");
		int money = sc.nextInt();
		int m1 = 0, m2 = 0;
		while(money >= 10000) {		
			if(money % 50000 == 0) {
				money = money - 50000;
				m2 = m2 + 1;
			}
			else if(money % 10000 == 0) {
				money = money - 10000;
				m1 = m1 + 1;
			}
		}
		
		System.out.println("1만원짜리는 " + m1 + "장 " + "5만원짜리는 " + m2 + "장입니다.");
		
		sc.close();
	}

}
