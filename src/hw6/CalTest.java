package hw6;

import java.util.Scanner;

/* *CalTest.java執行後,使用者可以輸入x與y的值
 * * 3. x與y皆正確情況下,會顯示運算後結果*/
public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 用建構子建立Calculator
		while (true) {
			try {
				System.out.println("請輸入x的值");
				int x = sc.nextInt();
				System.out.println("請輸入y的值");
				int y = sc.nextInt();
				Calculator c1 = new Calculator(x, y);
				System.out.println(x + "的" + y + "次方=" + c1.powerXY(x, y));
				break;
			} catch (CalException c) {
				c.printStackTrace();

			}
		}
	}
}
