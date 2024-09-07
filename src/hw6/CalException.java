package hw6;

/*請加入例外處理機制,讓程式能解決以下狀況*/
public class CalException extends Exception {
	public CalException() {
	};

	public CalException(String message) {
		super(message);
	};

}
