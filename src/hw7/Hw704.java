package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,
 * 寫到C:\data\Object.ser裡。注意物件寫入需注意的事項,
 * 若C:\內沒有data資料夾,請用程式新增這個資料夾*/
public class Hw704 {

	public static void main(String[] args) {
		// 1.建立Cat、Dog物件實體
		Cat ccc = new Cat("ccc");
		Cat aaa = new Cat("aaa");
		Dog ddd = new Dog("ddd");
		Dog ooo = new Dog("ooo");

		// 2.檢查、建立Object資料夾
		File data = new File("C:\\data");
		if (!data.exists()) {
			System.out.println(data.mkdir());
		}

		// 3.資料來源接fos、oos
		try {
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// 4.寫入ccc、ddd
			oos.writeObject(ccc);
			oos.writeObject(aaa);
			oos.writeObject(ddd);
			oos.writeObject(ooo);

			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
