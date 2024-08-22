package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class hw1_3 {
	public static void main(String[] args) {
		int day = (int) (256559 / (60 * 60 * 24));
		int hour = (256559 % (60 * 60 * 24)) / (60 * 60);
		int min = ((256559 % (60 * 60 * 24)) % (60 * 60)) / 60;
		int sec = ((256559 % (60 * 60 * 24)) % (60 * 60)) % 60;

		System.out.println("256559秒為" + day + "天、" + hour + "小時、" + min + "分與" + sec + "秒");

	}
}
