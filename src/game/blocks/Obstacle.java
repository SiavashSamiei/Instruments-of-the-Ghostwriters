package game.blocks;

/**
 * Created by Siavash Samiei May 20, 2015
 * <p>
 * Modified Justin Pu May 24, 2015
 * <p>
 * <b>Time Spent:</b>
 * <p>
 * Siavash Samiei: 5 minutes
 * <p>
 * Justin Pu: 5 minutes
 * @author Siavash Samiei & Justin Pu
 * @version  3 06.08.15
 */
public class Obstacle extends Block {
  
  /**
   * Returns the type of the block.
   * <p>
   * @return the type of the block ("obstacle")
   * @author Justin Pu June 1, 2015.
   */
  @Override
  public String getType() {
    return "obstacle";
  }
  
  /**
   * Creates an instance of the obstacle class.
   * <p>
   * @author Siavash Samiei and Justin Pu
   * @param x desired x value.
   * @param y desired y value.
   * @param texture desired texture value.
   */
  public Obstacle (int x, int y, int texture) {
    super(x, y, texture);
  }
}
