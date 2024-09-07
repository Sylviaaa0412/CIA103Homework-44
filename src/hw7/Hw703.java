package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
 * 呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案*/
public class Hw703 {

	public static void main(String[] args) {
		Hw703 test = new Hw703();
		test.copyFile(".\\src\\hw7\\input.txt", ".\\src\\hw7\\output.txt");
	}

	public void copyFile(String fileIn, String fileOut) {

		try {
			// 1.建立input/output檔案
			File inputFile = new File(fileIn);
			File outputFile = new File(fileOut);

			// 2.接input/output
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);

			// 3.迴圈將資料讀入、寫出
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
				System.out.flush();
			}
			fis.close();
			fos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
