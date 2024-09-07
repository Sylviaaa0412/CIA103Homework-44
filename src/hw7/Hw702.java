package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
 * (請使用append功能讓每次執行結果都能被保存起來)*/
public class Hw702 {
	public static void main(String[] args) {
		try {

			// 2.呼叫Set取得10個亂數集合
			Set<Integer> randomSet = randomSet();

			// 3.將亂數集合寫入檔案
			FileWriter fw = new FileWriter(".\\src\\hw7\\random.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			// 4.使用迭代器取得亂數並印出
			Iterator<Integer> it = randomSet.iterator();
			while (it.hasNext()) {
				pw.print(it.next() + " ");
			}

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 1.定義方法將亂數存入Set並返回
	public static Set<Integer> randomSet() {
		Set<Integer> randomSet = new HashSet<Integer>();
		for (int i = 1; i <= 10; i++) {
			int x = (int) (Math.random() * 1000) + 1;
			randomSet.add(x);
		}
		return randomSet;
	}

}
