package hw6;

/*在Calculator.java裡有個自訂方法為powerXY(int x, int y),
* 功能是會計算x的y次方並回傳結果。
* 1. x與y同時為0,(產生自訂的CalException例外物件)
2. y為負值,而導致x的y次方結果不為整數*/
public class Calculator {

	// 1.宣告xy變數
	private int x;
	private int y;

	// 2.建構子
	public Calculator() {
	};

	public Calculator(int x, int y) throws CalException {
		setX(x);
		setY(y);
	}

	// 3.setter/getter
	public void setX(int x) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else {
			this.x = x;
		}
	}

	public int getX() {
		return x;
	}

	public void setY(int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else {
			this.y = y;
		}
	}

	public int getY() {
		return y;
	}

	// 4.powerXY(int x, int y)計算x的y次方並回傳結果
	public int powerXY(int x, int y) {
		int result = (int) Math.pow(x, y);
		return result;
	}

}
