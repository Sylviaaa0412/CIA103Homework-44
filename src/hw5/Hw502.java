package hw5;

public class Hw502 {
	/*
	 * 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中 取平均值並印出這10個亂數與平均值,如圖:
	 */

	public static void main(String[] args) {
		Hw502 rand = new Hw502();
		rand.randAvg();

	}

	// 1.定義方法
	void randAvg() {

		System.out.print("本次亂數結果：" + "\n");
		// 2.陣列存入亂數
		int[] randArr = new int[10];
		int sum = 0;
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = (int) (Math.random() * 101);
			System.out.print(randArr[i] + " ");
			sum += randArr[i];
		}

		// 3.計算平均
		double avg = (double) sum / randArr.length;
		System.out.println("\n" + "平均:" + avg);

	}
}
