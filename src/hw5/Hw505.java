package hw5;

import java.math.*;
/*
* 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,
* 請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,
* 此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:*/

public class Hw505 {

	public static void main(String[] args) {
		Hw505 autoCode = new Hw505();
		System.out.println(autoCode.genAuthCode());
	}

	public char[] genAuthCode() {

		// 1.存入0~9、A~Z、a~z
		String allLetter = "0123456789" + 
							"ABCDEFGHIJKLMNOPQRSTUVWXYZ" + 
							"abcdefghijklmnopqrstuvwxyz";
		int index;
		char []autoCode=new char[8];
		for (int i = 0; i <autoCode.length; i++) {
			index = (int) (Math.random() * allLetter.length());
			autoCode[i]=allLetter.charAt(index);
			
		}
		return autoCode;
	}
}
