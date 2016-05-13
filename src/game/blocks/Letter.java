package game.blocks;

/**
 * Created by Siavash Samiei May 20, 2015
 * <p>
 * Modified Justin Pu May 24, 2015
 * <p>
 * <b>Time Spent:</b>
 * <p>
 * Siavash Samiei: 15 minutes
 * <p>
 * Justin Pu: 10 minutes. 
 * <p>
 * <b> Instance Variables </b>
 * <p>
 * <b> letterNum </b> the id of this letter. 
 * <p>
 * <b>Time Spent:</b>
 * <p>
 * Justin Pu: 0.2 hours
 * 
 * @author Siavash Samiei and Justin Pu
 * @version 3 06.08.15
 */
public class Letter extends Block {
  
  private int letterNum;
  
  /**
   * Returns the number of the letter.
   * <p>
   * @author Justin Pu
   * @return the number assigned to this letter. 
   */
  public int getLetterNum() {
    return letterNum;
  }
  
  
  /**
   * Sets the letter of the number to the number given.
   * <p>
   * @author Justin Pu June 1
   * @param letterNum the new letterNum to be set to.
   */
  public void setLetterNum(int letterNum) {
    this.letterNum = letterNum;
  }
  
  
  /**
   * Creates a new Letter block. 
   * <p>
   * @author Justin Pu June 1
   * @param x desired x value.
   * @param y desired y value.
   */
  public Letter (int x, int y) {
    super(x, y, 8);
  }
  
  
  /**
   * Returns the type of the block.
   * <p>
   * @return the type of the block ("letter")
   * @author Justin Pu June 1, 2015.
   */
  @Override
  public String getType() {
    return "letter";
  }
  
}
