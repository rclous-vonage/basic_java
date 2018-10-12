package IfKeywordcodeBlocks;

public class IfKeywordcodeBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver =true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;

		if(score == 5000)
			System.out.println("line 1 w/o brackets");
			System.out.println("line 2 w/o brackets");
		System.out.println("line 3 w/o brackets tabbed in");
		if(score == 4000)
			System.out.println("line 1 w/o brackets");
			System.out.println("line 2 w/o brackets");
		System.out.println("line 3 w/o brackets tabbed in");
		//w/o brackets only 1 line is printed after the conditional
		// this code block is similar to ruby's iterative function, vars created inside 
		// aren't accessable outside, but have to be created before the cb to mutate
		// this is known as scope
		if(score == 4000) {
			System.out.println("line 1 w/ brackets");
			System.out.println("line 2 w/ brackets");
		}//else if {}
		else {
		System.out.println("line 3 w/in else conditional");
		}


	}

}
