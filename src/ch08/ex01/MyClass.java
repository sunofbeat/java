package ch08.ex01;

//@Field
@Universal
@Type(name="class", value=1) //�Ӽ��� �߰� //meta data
public class MyClass {
	@Field(1) @Universal
	private String name;
	
	@Constructor
	public MyClass() {
		 
	}
	
	@Method
	public void play(@Param String name, @Param int age) {
		@Local int i = 0;
	}
}
