package contract;

public interface IView {

	/**
	 * 
	 * @param x
	 * @param y
	 * @param sprite
	 */
	void show(int x, int y, String sprite);

	/**
	 * 
	 * @param messageGameOver
	 */
	void displayGameOver(String messageGameOver);

	/**
	 * 
	 * @param Score
	 */
	void displayScore(int Score);

}