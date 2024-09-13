package hw9;

/*• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
競賽過程。
• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
• 參考範例:CounterRunnable.java
• 需留意主執行緒執行順序*/
public class Hw901 implements Runnable {
	private String name;
	
	public Hw901() {};
	//1.角色名稱建構子
	public Hw901(String name) {
		setName(name);
	};

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	//2.定義吃飯變數
	int rice = 0;

	public void run() {
		while (rice < 10) {
			//3.亂數抽取sleep時間
			int sleepTime = (int) (Math.random() * 2501 + 500);
			try {
				Thread.sleep(sleepTime);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//4.睡完吃飯
			rice++;
			System.out.println(getname() + "吃了第" + rice + "碗飯");
			
			
		}
		System.out.println(getname() + "吃了第" + rice + "碗飯");
		System.out.println(getname() + "吃完了!");
	}

	//建立執行緒
	public static void main(String[] args) {
		Hw901 h1 = new Hw901("Fairy");
		Thread t1 = new Thread(h1);
		Hw901 h2 = new Hw901("Balala");
		Thread t2 = new Thread(h2);
		
		t1.start();
		t2.start();
	}

}
