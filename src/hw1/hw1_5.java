package hw1;

/*• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)*/
/*【複利公式】FV ＝ PV×（1 ＋ R）n 次方
 * FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數*/
public class Hw1_5 {
	public static void main(String[] args) {
		int pv = 1500000;
		double r = 0.02;
		double fv = pv;
//		fv = pv * Math.pow( (1+r) , 10 );

//		for(i=1 ; i <= 10 ; i++) {
//		fv = pv * Math.pow( (1+r) , i );
//		}

		for (int i = 1; i <= 10; i++) {
			fv *= (1 + r);
		}
		System.out.printf("10年後本利和:%.2f%n", fv);
	}

}
