package hw4;

import java.util.Scanner;

/*
• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

(提示1:Scanner,陣列)
(提示2:需將閏年條件加入)
(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
*/
public class Hw405 {
	public static void main(String[] args) {

		// 1.鍵盤輸入年、月、日
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年份(YYYY)");
		int year = sc.nextInt();
		System.out.println("請輸入月份(MM)");
		int month = sc.nextInt();
		System.out.println("請輸入日期(DD)");
		int day = sc.nextInt();

		// 2.建立日期陣列
		int[] dayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 3.判斷閏年
		boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		if (leapYear) {
			dayOfMonth[1] = 29;
		}

		// 3.判斷輸入的月份及日期是否正確
		if (year < 1) {
			System.out.println("請輸入正確年份");
			return;
		} else if (month < 1 || month > 12) {
			System.out.println("請輸入正確月份");
			return;
		}
		for (int i = 0; i < dayOfMonth.length; i++) {
			if ((month == i + 1) && day > dayOfMonth[i]) {
				System.out.println("請輸入正確日期");
				return;
			}
		}

		// 4.計算是一年中第幾天
		int count = 0;
		for (int i = 0; i < month - 1; i++) {
			count += dayOfMonth[i];
		}
		count += day;
		System.out.println(year + "/" + month + "/" + day + "是一年中的第" + count + "天");

	}
}
