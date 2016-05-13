package game.blocks;

/**
 * Created by Siavash Samiei May 20, 2015
 * <p>
 * Modified by Justin Pu May 24, 2015
 * <p>
 * <b>Time Spent:</b>
 * <p>
 * Siavash Samiei: 0.1 hours. 
 * <p>
 * Justin Pu: 0.1 hours.
 * <p>
 * 
 * @author Siavash Samiei & Justin pu
 * @version 1 20/05/2015
 */
public class Terrain extends Block {
  
  /**
   * Constructs a new terrain block
   * <p>
   * @param x the x coordinate of this block
   * @param y the y coordinate of this block
   * @param texture the texture ID of this block
   * @author Siavash Samiei May 20, Modified Justin Pu May 24
   */
  public Terrain (int x, int y, int texture){
    super(x, y, texture);
  }
  
  /**
   * Returns the type of the block.
   * <p>
   * @return the type of the block ("terrain")
   * @author Justin Pu June 1, 2015.
   */
  @Override
  public String getType() {
    return "terrain";
  }
}
