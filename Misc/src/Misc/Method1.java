package Misc;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("your final score was " + highScore);
		//method over loading,  different # of args
		highScore = calculateScore(true, 800, 5);
		System.out.println("your final score was " + highScore);

	}

	//void means do not return any sort of value
	// cast the data type
	// must return the correct data type?
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		} else{
			return -1;
		}
	}
	public static int calculateScore(boolean gameOver, int score, int levelCompleted){

		if(gameOver) {
			int finalScore = score + (levelCompleted);
			finalScore += 1000;
			return finalScore;
		} else{
			return -1;
		}
	}
}
