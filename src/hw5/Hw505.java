package hw5;

public class Hw505 {

	public static void main(String[] args) {
		Hw505 autoCode = new Hw505();
		System.out.println(autoCode.genAuthCode());
	}

	public char[] genAuthCode() {

		// 1.存入0~9、A~Z、a~z
		String allLetter = "0123456789" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
		int index;
		char[] autoCode = new char[8];
		for (int i = 0; i < autoCode.length; i++) {
			index = (int) (Math.random() * allLetter.length());
			autoCode[i] = allLetter.charAt(index);

		}
		return autoCode;
	}
}
