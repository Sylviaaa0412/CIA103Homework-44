package classtest;

public class TestNineNine {
	public static void main(String[] args) {
		int i,j;
		// 1.:使用for+while
//		
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println("");
//		}
		
		//2.:使用for + do while
//		
//		for(i = 1; i<=9; i++) {
//			j =1;
//			do {System.out.print(i + "*" + j + "=" + i * j + "\t");
//			j++;}while(j<=9);
//			System.out.println("");
//		}
		
		//3.:使用while + do while
		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println("");
			i++;
		}

	}

}
