package hw2;

/*
• 請設計一隻Java程式,輸出結果為以下:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*(char)65='A' 
**/
public class Hw2_7 {
	public static void main(String[] args) {
		int i, j, result = 65;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char) result + "");
			}
			result++;
			System.out.println();
		}
	}
}
