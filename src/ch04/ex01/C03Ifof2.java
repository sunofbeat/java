package ch04.ex01;

public class C03Ifof2 {

	public static void main(String[] args) {
		int hour = 23;
		String spk = "";
		if(hour < 12) {
			spk = "Good Morning.";
		} else if (hour < 18) {
			spk = "Good Afternoon.";
		} else if (hour < 21) {
			spk = "Good Evening.";
		} else {
			spk = "Good Night.";
		}
		System.out.println(spk);
	}
}
