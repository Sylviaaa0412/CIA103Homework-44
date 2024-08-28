package hw4;

/*
 有個字串陣列如下 (八大行星):
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
(提示:字元比對,String方法)
*/
public class Hw403 {

	public static void main(String[] args) {

		// 1.建立字串陣列
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 3.循環字元比對計算母音
		int result = 0;
		for (int i = 0; i < planet.length; i++) {
			result += count(planet[i]);
		}

		System.out.println("字串中共有" + result + "個母音");
	}

	// 2.設計方法比對字元
	public static int count(String planet) {
		int count = 0;
		for (int i = 0; i < planet.length(); i++) {
			switch (planet.charAt(i)) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}
		}
		return count;
	}
}
