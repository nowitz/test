package cz.extended.model;

public class People {
	
	private String name;
	private int age;
	
	private String tmpextended = "funguje to";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void addAge(){
		this.age = this.age + 1;
	}
	
	public String getTmpextended() {
		return tmpextended;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	

}
