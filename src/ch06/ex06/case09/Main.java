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
		//Chrome.in(); //static�޼���� ȣ��Ұ�
		chrome.out();
		
		//�Ʒ� chrome.play();����� ��밡�������� �����ڵ�!
		chrome.play();
		Chrome.play();
		Browser.play();
		
	}
}
