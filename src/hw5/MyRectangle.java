package hw5;
/*• 請設計一個類別MyRectangle:
(1) 有兩個double型態的屬性為width, depth
(2) 有三個方法:

void setWidth(double width): 將收到的引數指定給width屬性
void setDepth(double depth): 將收到的引數指定給depth屬性
double getArea(): 能計算該長方形的面積

(3) 有兩個建構子:

public MyRectangle(): 不帶參數也無內容的建構子
public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性*/
public class MyRectangle {
	
	//4.定義建構子
	public MyRectangle() {};
	public MyRectangle(double width, double depth) {
		if(width>0 && depth>0) {
			this.width=width;
			this.depth=depth;
		}else {System.out.println("請輸入大於零的數字");}
		
	}
	
	//1.定義參數
	private double width;
	private double depth;
	
	//2.定義setter、getter
	void setWidth(double width) {
		if(width>0) {
			this.width=width;
		}else {System.out.println("請輸入大於零的數字");}
	}
	
	double getWidth() {
		return width;
	}
	
	void setDepth(double depth) {
		if(depth>0) {
			this.depth=depth;
		}else {System.out.println("請輸入大於零的數字");}
	}
	
	double getDepth() {
		return depth;
	}
	
	//3.定義計算面積方法
	double getArea() {
		double area=width*depth;
		return area;
	}
	

}
