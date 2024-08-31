package hw4;

/*
班上有8位同學,他們進行了6次考試結果如下:
請算出每位同學考最高分的次數
*/
public class Hw406 {
	public static void main(String[] args) {

		// 1.建立二維陣列儲存成績
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 2.建立陣列紀錄每位學生最高分次數
		int[] topScore = new int[score[0].length];

		// 3.循環找出每次考試最高分

		for (int i = 0; i < score.length; i++) {
			int index = 0, max = score[i][0];
			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] > max) {
					max = score[i][j];
					index = j;
				}
			}
			topScore[index]++;
		}
		for (int i = 0; i < topScore.length; i++) {
			System.out.println((i + 1) + "號同學考了" + topScore[i] + "次最高分");
		}
	}
}