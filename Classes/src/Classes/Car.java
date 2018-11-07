package Classes;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	// bad form to call other methods inside of constructors, ruby does this all the time
	// although do not call setters and getters as the object is not fully formed yet
	public Car() {
		this(4, 4, "van", "v6", "race car red"); //this will call the overloaded method// constructor chaining
		System.out.println("empty constructor called, filling with defaults");
	}

	public Car(	 int doors, int wheels, String model, String engine, String color) {
		//different this, self of class
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
	}
	
	public void giveGas() {
		System.out.println("hmmmmm");
	}
	
	// generate setters available in the source column
	public void setModel(String model) {
		this.model = model; //same as self in ruby
	}
	public String getModel() {
		return this.model; //same as self in ruby
	}
	public String getColor() {
		return this.color; //same as self in ruby
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
