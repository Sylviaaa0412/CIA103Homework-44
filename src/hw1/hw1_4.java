package hw1;
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class hw1_4 {
	public static void main(String [] args) {
		final double pi = 3.1415;
		int radius = 5;
		double circlearea = (Math.pow(radius, 2))*pi;
		double circumference = radius*2*pi;
		System.out.printf("半徑為5的圓面積:%.2f%n", circlearea);
		System.out.printf("半徑為5的圓周長:%.2f%n", circumference);
	}
}
