package hw1;

/*
• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因
*/
public class Hw1_6 {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 兩個int5相加，5+5=10
		System.out.println(5 + '5');
		// int5+char5串接為新字串，char5根據unicode1編碼是8，顯示為58
		System.out.println(5 + "5");
		// int5+String5會串接成新字串，顯示為55
	}
}
