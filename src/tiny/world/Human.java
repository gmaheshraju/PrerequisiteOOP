package tiny.world;

public class Human {
	
	String name;
	int age;
	int height;
	String color;
	
	
	public Human(String name, int age, int height, String color) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.color = color;
	}
	
	public void speak(){
		System.out.println("hello my name is "+name);
		System.out.println("I am "+age+" years old");
		
		System.out.println("my height is "+height+" inches");
		
		System.out.println("My color is "+color);
	}
	

}
