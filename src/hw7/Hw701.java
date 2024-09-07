package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料*/
public class Hw701 {
	public static void main(String[] args) {
		try {

			// 1.第一次讀取檔案，取得字數
			File file = new File(".\\src\\hw7\\Sample.txt");
			FileReader fr = new FileReader(file);
			int wordcount = 0;
			while (fr.read() != -1) {
				wordcount++;
			}

			// 2.第二次讀取檔案，取得行數
			File file2 = new File(".\\src\\hw7\\Sample.txt");
			FileReader fr2 = new FileReader(file2);
			BufferedReader br2 = new BufferedReader(fr2);
			int linecount = 0;
			while (br2.readLine() != null) {
				linecount++;
			}

			// 3.輸出結果
			System.out.print("Sample.txt檔案共有" + file.length() + "個位元組，" + wordcount + "個字元，" + linecount + "列資料");
			br2.close();
			fr2.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
