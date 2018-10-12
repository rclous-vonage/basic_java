package Loops;

public class WhlieAndDo {

	public static void main(String[] args) {
		int count = 0;
		while(count != 6){
			p(Integer.toString(count));
			count++;
		}
		// '' seems to not be a string?
		p("out of loop");
		do {
			p(Integer.toString(count));
			count++;
		} while(count != 10);
		
		p("out of loop 2");
	}
	// continue = ruby next
	public static void p(String str){
		System.out.println(str);
	}

}
