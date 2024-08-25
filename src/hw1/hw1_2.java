package hw1;

//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class Hw1_2 {
	public static void main(String[] args) {
		int eggs = 200;
		int dozen = (int) (eggs / 12);
		int single = eggs % 12;
		System.out.println("200顆蛋共是" + dozen + "打" + single + "顆");
	}
}
