
public class GreatestAndLeast {
	private int num;			//hold number user chooses
	private int greatestNumber = -2147483648; //holds the largest number that user has chosen
	private int leastNumber = 2147483647; 	//holds the smallest number that user has chosen
	public GreatestAndLeast() {
		
	}
	/**
	 * returns the number most recently chosen by the user
	 * @return
	 */
	public int getNum() {
		return num;
	}
	/**
	 * stores the number most recently chosen by the user
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * returns the greatest number chosen so far
	 * @return
	 */
	public int getGreatestNumber() {
		return greatestNumber;
	}
	/**
	 * stores the greatest number chosen so far
	 * @param gn
	 */
	public void setGreatestNumber(int gn) {
		this.greatestNumber = gn;
	}
	/**
	 * returns the least number chosen so far
	 * @return
	 */
	public int getLeastNumber() {
		return leastNumber;
	}
	/**
	 * stores the least number chosen so far
	 * @param ln
	 */
	public void setLeastNumber(int ln) {
		this.leastNumber = ln;
	}
	
}
