package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	public Citrus() {
		//this.name = "������";
		//this.Citrus("������")
		//new Citrus("������");
		this("������");
	}
	
	public Citrus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
