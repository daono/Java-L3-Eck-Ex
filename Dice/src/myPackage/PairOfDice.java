package myPackage;

/**
 * @author daono 
 * 
 * This program creates a Pair Of Dice
 */

public class PairOfDice {
	private int die1;
	private int die2;

	/**
	 * This program rolls the dice randomly
	 */
	public void roll() {
		die1 = (int) (Math.random() * 6) + 1;
		die2 = (int) (Math.random() * 6) + 1;
	}

	/**
	 *
	 * @return number showing on the first die
	 */
	public int getDie1() {
		return die1;
	}

	/**
	 * 
	 * @return number showing on the second die
	 */
	public int getDie2() {
		return die2;
	}

	/** 
	 * @return  sum of the two dice
	 */
	public int getTotal() {
		return die1 + die2;
	}

}
