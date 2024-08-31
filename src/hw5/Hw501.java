package hw5;

import java.util.Scanner;

public class Hw501 {
	/*
	 * 請設計一個方法為starSquare(int width, int height), 當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
	 */

	public static void main(String[] args) {

		// 1. 在main方法鍵盤輸入長寬
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形的寬");
		int width = sc.nextInt();
		System.out.println("請輸入長方形的高");
		int height = sc.nextInt();

		// 3.呼叫方法
		printSquare(width, height);

	}

	// 2.設計方法帶入長寬印出長方形
	public static void printSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
