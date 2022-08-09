package section_4;

public class Test1 {
	
	public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 7000;
        int levelCompleted = 8;
        int bonus = 800;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Score is " + finalScore);
        }

        score = 9900;
        levelCompleted = 9;
        bonus = 990;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Score is " + finalScore);
        }

	}

}
