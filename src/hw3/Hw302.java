package hw3;

import java.util.Scanner;

public class Hw302 {
	public static void main(String[] args) {
		// 1.定義亂數答案
		int answer = (int) (Math.random() * 101);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧~");

		while (true) {
			int guess = sc.nextInt();
			if (guess == answer) {
				System.out.println("答對了~");
				break;
			} else if (guess > answer) {
				System.out.println("太大囉~");
			} else {
				System.out.println("太小囉~");
			}
		}
		System.out.println("============");
		System.out.println("正確答案:" + answer);

	}
}
