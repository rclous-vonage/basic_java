package Classes;

public class raceCar extends Car {
	private int horsePower;
	private int maxMilage;
	private String sponsor;
	
	public raceCar() {
		super();
		this.horsePower = 500;
		this.maxMilage = 125;
		this.sponsor = "Wheetes";
		
		// TODO Auto-generated constructor stub
	}
	public raceCar(String model, String engine, String color, int horsePower, int maxMilage, String sposor) {
		super(2, 4, model, engine, color);
		this.horsePower = horsePower;
		this.maxMilage = maxMilage;
		this.sponsor = sponsor;
		
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getMaxMilage() {
		return maxMilage;
	}
	public void setMaxMilage(int maxMilage) {
		this.maxMilage = maxMilage;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
	public void vroomVroom() {
		System.out.println("Vroom Vroom");
	}
	@Override
	public void giveGas() {
		// TODO Auto-generated method stub
		super.giveGas();
		vroomVroom();
	}
	
	
	
	
}
