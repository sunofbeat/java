package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();
		browser.out();
		
		UI.in();
		
		System.out.println();
		Chrome chrome = new Chrome();
		//Chrome.in(); //static메서드라 호출불가
		chrome.out();
		
		//아래 chrome.play();방법도 사용가능하지만 나쁜코드!
		chrome.play();
		Chrome.play();
		Browser.play();
		
	}
}
