package hw3;

import java.util.Scanner;

public class Hw303 {
	public static void main(String[] args) {
		// 1.鍵盤錄入1~9任意數
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文，請問你討厭的數字是?");
		int ignore = sc.nextInt();
		if (ignore >= 1 && ignore <= 9) {
			System.out.println("要忽略的數字是:" + ignore);
		} else {
			System.out.println("請輸入介於1~9的整數");
		}

		// 2.列出可以選擇的數字及個數
		int count = 0;
		int[] lotto = new int[50];

		ignoreCount:

		for (int i = 1; i <= 49; i++) {

			if (i % 10 == ignore || (int) i / 10 == ignore) {
				continue ignoreCount;
			} else {
				lotto[i] = i;
				System.out.print(i + " ");
				count++;
			}
			if (count % 10 == 0) {
				System.out.print("\t" + "\n");
			}
		}
		System.out.println("\n"+"可選取的數字共" + count + "個"+"\n");

		// 3.亂數抽取6個數字
		int[] randomLotto = new int[6];
		for (int i = 0; i < randomLotto.length;) {
			int index = (int) (Math.random() * 50);
			if (lotto[index] == 0 || checkRandom(randomLotto, lotto, index)) {
				continue;
			} else if ((lotto[index] != 0) && (!checkRandom(randomLotto, lotto, index))) {
				randomLotto[i] = lotto[index];
				i++;
			}
		}
		
		System.out.println("抽出的數字為:");
		for (int i = 0; i < randomLotto.length; i++) {
			System.out.print(randomLotto[i] + " ");
		}
	}

	// 4.定義方法判斷重複
	public static boolean checkRandom(int[] randomLotto, int[] lotto, int index) {
		for (int i = 0; i < randomLotto.length; i++) {
			if (randomLotto[i] == lotto[index]) {
				return true;
			}
		}
		return false;
	}

}
