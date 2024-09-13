package hw9;
/*• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
1000元,寫一個Java程式模擬匯款10次與提款10次的情
形。

• 參考範例:TestWaitNotify.java*/

//1.建立受java控制的class
class Money {
	private int cash = 0;

	// 2.定義媽媽匯款過程
	synchronized public void deposit(int pocket) {
		// 當帳戶餘額大於3000暫停匯款
		while (cash > 3000) {
			// 匯款後通知熊大
			System.out.println("媽媽看到帳戶餘額在3000以上，暫停匯款");
			System.out.println("媽媽通知熊大，帳戶已有錢");
			try {
				// 媽媽等待熊大提款至餘額不足
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 餘額不足3000媽媽匯款過程
		cash += pocket;
		System.out.println("媽媽存了" + pocket + "，帳戶餘額:" + cash);
		notifyAll();
	}

	// 3.定義熊大提款過程
	synchronized public void withdraw(int spend) {
		// 餘額小於提領金額時停止提款
		while (cash < spend) {
			System.out.println("熊大看到帳戶沒錢，停止提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				// 停止提款，等待媽媽通知匯款
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 提款過程
		cash -= spend;
		System.out.println("熊大領了" + spend + "，帳戶餘額:" + cash);
		// 餘額不足2000時通知媽媽匯款
		if (cash < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notifyAll();
		}
	}
}

//4.建立媽媽類別執行緒
class Mom extends Thread {
	Money money;

//參數帶入定義的提、匯款過程
	public Mom(Money money) {
		this.money = money;
	}

//迴圈10次，每次存2000
	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.deposit(2000);
		}
	}
}

//5.建立兒子類別執行緒
class Son extends Thread {
	Money money;

	// 參數帶入定義的提、匯款過程
	public Son(Money money) {
		this.money = money;
	}

	// 迴圈10次，每次領1000
	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.withdraw(1000);
		}
	}
}

public class Hw902 {
	public static void main(String[] args) {
		// 建立存匯款實體
		Money money = new Money();
		// 新媽媽執行緒
		Mom mom = new Mom(money);
		// 新兒子執行緒
		Son son = new Son(money);
		// 開始執行
		mom.start();
		son.start();
	}
}
