package hw5;

/*• 請另外建立一個MyRectangleMain類別,此類別只有main方法
(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果*/
public class MyRectangleMain {

	public static void main(String[] args) {
		// 1.無參數建構子建立物件
		MyRectangle Rectangle1 = new MyRectangle();
		Rectangle1.setDepth(20);
		Rectangle1.setWidth(10);
		System.out.println("長方形面積:" + Rectangle1.getArea());

		// 2.帶參數建構子建立物件
		MyRectangle Rectangle2 = new MyRectangle(10, 20);
		System.out.println("長方形面積:" + Rectangle2.getArea());

	}
}
