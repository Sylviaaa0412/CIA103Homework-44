package hw2;

/*
• 請設計一隻Java程式,輸出結果為以下:
1 4 9 16 25 36 49 64 81 100
*/
public class hw2_4 {
	public static void main(String[] args) {
		int i, result;
		for (i = 1; i <= 10; i++) {
			result = i * i;
			System.out.print(result + " ");
		}
	}
}
