package hw3;

import java.util.Scanner;

public class Hw302 {
	public static void main(String[] args) {
		// 1.定義亂數答案
		int answer = (int) (Math.random() * 10);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧~");

		while (true) {
			int deta = sc.nextInt();
			if (deta == answer) {
				System.out.println("答對了~");
				break;
			} else {
				System.out.println("猜錯囉~");
			}
		}
	}
}
