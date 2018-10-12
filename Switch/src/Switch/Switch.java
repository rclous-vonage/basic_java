package Switch;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int switchValue = 4;
		// needs breaks or it will run through each case
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
			case 2:
				System.out.println("Value was 2");
			case 3:case 4: case 5:
				System.out.println("Value was " + switchValue);
			default:
				System.out.println("Value was not 1 or 2");

		}

	}

}
