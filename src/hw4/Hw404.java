package hw4;

import java.util.Scanner;

/*
小華上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
表如下:

請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
員工編號: 25 19 27 共 3 人!」

(提示:Scanner,二維陣列)
*/
public class Hw404 {
	public static void main(String[] args) {
		// 1.Scanner要借的金額
		Scanner sc = new Scanner(System.in);
		System.out.println("請問你要借多少錢?");
		int money = sc.nextInt();

		// 2.建立二維陣列存入員編及現金
		int[][] coworker = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		
		//3.循環比現金大小
		for (int j = 0; j < coworker[1].length; j++) {
			if (coworker[1][j] >= money) {
				System.out.print(coworker[0][j] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人");

	}

}
