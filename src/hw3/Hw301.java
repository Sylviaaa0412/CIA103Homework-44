package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw301 {
//1.鍵盤錄入三個數字
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int[] triangle = new int[3];
		for (int i = 0; i < triangle.length;i++) {
				triangle[i] = sc.nextInt();
		}

		// 2.陣列排序
		Arrays.sort(triangle);
		int a = triangle[0];
		int b = triangle[1];
		int c = triangle[2];

		// 3.if判斷三角形類別
		if ((a + b) >= c) {
			if (a == b && a == c) {
				System.out.println("正三角形");
			} else if (a == b || b==c) {
				System.out.println("等腰三角形");
			} else if ((b == Math.sqrt(3) * a) && (c == 2 * a)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

	}

}
