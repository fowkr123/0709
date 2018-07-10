package lang;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		//1~45까지 정수를 6개 저장할 공간을 생성
		int[] lotto = new int[6];
		//배열의 데이터 개수를 저장할 변수
		int size = lotto.length;
		//인덱스 변수
		int i;
		int j;
		//데이터를 입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < size; i++) {
			try {
				System.out.print("1~45 사이의 정수 입력 : ");
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				//1~45 사의 정수가 아닌 경우 다시 입력받도록 만들기
				if(!(lotto[i] >= 1 && lotto[i] <= 45)) {
					System.out.println("1~45 사이의 숫자를 입력하세요.");
					i--;
					continue;
				}
				
				//이전에 입력된 값들과 비교 - 중복검사
				//i가 0일때 : 0은 비교할 필요가 없기때문에 반복문을 돌지않는다.
				//i가 1일때 : lotto[0]과 비교를 한다.
				//i가 2일때 : lotto[0~1]과 비교를 한다.
				//i가 3일때 : lotto[0~2]와 비교를 한다
				//i가 4일때 : lotto[0~3]과 비교를 한다.
				//i가 5일때 : lotto[0~4]와 비교를 한다.
				for(j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						break;
					}
				}
				//이전 데이터와 방금 입력된 데이터가 동일하면		
				if(j != i) {
					System.out.println("동일한 데이터는 안됩니다.");
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println("숫자를 입력하세요.");
				//무효를 시키기 위해서 i를 1빼준다.
				i--;
			}
		}
		
		//배열의 전체 데이터 순회
		for(i = 0; i < size; i++) {
			System.out.println(lotto[i]);
		}
		
		//스캐너 객체 닫기
		sc.close();
	}

}
