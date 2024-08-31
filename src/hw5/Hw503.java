package hw5;

/*利用Overloading,設計兩個方法int maxElement(int x[][])
 *與double maxElement(double x[][]),
 *可以找出二維陣列的最大值並回傳,如圖:*/
public class Hw503 {

	public static void main(String[] args) {

		Hw503 arr = new Hw503();
		int[][] arr1 = { { 23, 45, 12, 56, 77 }, { 24, 87, 56, 84, 23, 55 }, { 67, 34, 86, 55, 73, 25, 35, 74 } };

		double[][] arr2 = { { 12.45, 345.6, 45.7, 23.55, 78.3, 93.4 }, { 34.2, 56.3, 76.5, 12.45, 98.3, 22.4, 33.6 } };

		System.out.println("最大值:" + arr.maxElement(arr1));
		System.out.println("最大值:" + arr.maxElement(arr2));

	}

	// 1.定義int[][]方法

	int maxElement(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	// 定義double方法
	double maxElement(double[][] arr) {
		double max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

}
