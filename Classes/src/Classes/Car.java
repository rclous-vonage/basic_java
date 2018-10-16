package Classes;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public Car() {
		this(4, 4, "van", "v6", "race car red"); //this will call the overloaded method
		System.out.println("empty constructor called, filling with defaults");
	}

	public Car(	 int doors, int wheels, String model, String engine, String color) {
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model; //same as self in ruby
	}
	public String getModel() {
		return this.model; //same as self in ruby
	}
	public String getColor() {
		return this.color; //same as self in ruby
	}
}
