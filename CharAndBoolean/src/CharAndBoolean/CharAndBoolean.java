package CharAndBoolean;

public class CharAndBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// single character, 2 bytes
		char myChar = 'a';
		char myChar = '\u00A9';
		System.out.println(myChar);
		String myString = "Awww Yeah";

		boolean myBoolean = true; //false
		String lastString = "20 then";
		int myInt = 50;
		// do not need to declare the type bc it is already declared
		lastString = lastString + myInt;
		System.out.println(lastString);
	}

}
