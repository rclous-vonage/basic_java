package ParsingValueFromString;

public class ParsingValueFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberAsString = "2018";
		p("numberAsString = " + numberAsString);
		int number = Integer.parseInt(numberAsString);
		number += 1;
		numberAsString +=1; // contatenation
		p(Integer.toString(number));
		p(numberAsString);
	}
	public static void p(String str){
		System.out.println(str);
	}
}
