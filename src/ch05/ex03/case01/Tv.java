package ch05.ex03.case01;

public class Tv {
	private String colorl;
	private boolean power;
	private int channel;
	
	public String getColorl() {
		return colorl;
	}
	 //returnŸ���� boolean�϶� is�� ǥ���� getter����
	public boolean isPower() {
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setColorl(String colorl) {
		this.colorl = colorl;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}	
}
