package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何
 *(請利用多型簡化本題的程式設計)*/
public class Hw705 {

	public static void main(String[] args) {
		// 1.fis、fos讀入Object.ser
		try {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				// 建立共同父類別Pets讓Cat、Dog繼承，強轉後呼叫speak()
				((Pets) ois.readObject()).speak();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
