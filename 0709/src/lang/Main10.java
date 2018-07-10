package lang;

public class Main10 {

	public static void main(String[] args) {
		// 다음과 같이 출력하세요
		//                   0
		//               1      2
		//             3          4
		//          5               6
		//        7                   8
		//     9 0 1 2 3 4 5 6 7 8 9 
		
		int i, j;
		int sum = 0;
		int[][] array = new int[6][11];
		int mid;

		mid = 11 / 2;
		
		for(i = 0; i < 6; i++) {
			if(i < 5) {
				for(j = mid - i; j <= mid + i; j = mid + i) {
					sum = sum + 1;
					array[i][j] = sum;
					if(j == mid + i) {
					break;
				}
				}
			}
			else if(i >= 5){
				sum--;
				for(j = 0; j < 11; j++) {
					sum = sum + 1;
					if(sum > 9) {
						sum = 0;
					}
					array[i][j] = sum;
				}
			}
		}

		for(i = 0; i < 6; i++) {
			if(i < 5) {
				for(j = 0; j < 11; j++) {
					if(array[i][j] == 0) {
						System.out.print("   ");
					}
					else {
						System.out.print(array[i][j] - 1);
					}
				}
			}
			else {
				for(j = 0; j < 11; j++) {
					System.out.printf("%2d", array[i][j]);
				}
			}
			System.out.println("");
		}
	}

}
