package Day17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lotto {
	Scanner sc = new Scanner(System.in);

	int input_num, lotto_num, get;
	int another_num;
	int[][] lotto;
	int[] num;
	void menu() {
		System.out.println("복권점에 오신걸 환영합니다.");
		System.out.println("구매하고자 하시는 복권의 수량을 적어주세요:");
		input_num = sc.nextInt();
		lotto = new int[input_num][6];
		lotto();
		print();
	}
public lotto() {
	// TODO Auto-generated constructor stub
	num = new int[6];
	
}
	void lotto() {

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				lotto_num = (int) (Math.random() * 45 + 1);
				/*
				 * Random r = new Random(); r.nextInt(45)+1; 랜덤 함수 적용 하는 또 다른 기법
				 */

				lotto[i][j] = lotto_num;
				for (int k = 0; k < j; k++) {
					if (lotto[i][j] == lotto[i][k]) {
						j--;
						break;
					}
				}
			}
		}
	}
	void print(){

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + " ");
				sort();
			}
			System.out.println();
		}
	}

	
	void sort(){
		Arrays.sort(num);
	}

}
