package Classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car porsche = new Car();
		porsche.setModel("carrera");
		System.out.println(porsche.getModel());
		System.out.println(porsche.getColor());
		// what is naming convention for classes?
		raceCar indyCar = new raceCar();
		indyCar.vroomVroom();
		indyCar.giveGas();
	}

}
