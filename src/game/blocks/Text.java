package game.blocks;

/**
 * This class generates blocks with letter characters on them.
 * <p>
 * <b> Instance Variables </b>
 * <p>
 * <b> letter </b> the letter that this block displays. 
 * <p>
 * <b>Total hours spent:</b>
 * <p>
 * Justin Pu: 0.5 hours
 * 
 * @author Justin Pu June 6, 2015.
 * @version 3 06.08.15
 */
public class Text extends Block{
  
  private char letter;
  
  /**
   * Constructs a new terrain block
   * <p>
   * @param x the x coordinate of this block
   * @param y the y coordinate of this block
   * @param letter the letter that this block displays
   * @author Siavash Samiei May 20, Modified Justin Pu May 24
   */
  public Text (int x, int y, char letter){
    super(x, y, 10);
    this.letter = letter;
  }
  
  /**
   * Returns the type of the block.
   * 
   * @return the type of the block ("text")
   * @author Justin Pu June 1, 2015.
   */
  public String getType() {
    return "text";
  }
  
  /**
   * Returns the type of the block.
   * 
   * @return that the block displays
   * @author Justin Pu June 1, 2015.
   */
  public char getLetter() {
    return letter;
  }
}