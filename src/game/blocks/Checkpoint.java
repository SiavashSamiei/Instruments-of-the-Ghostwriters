package game.blocks;

/**
 * This is the class that creates and instance of a checkpoint object
 * block. Checkpoint extends Block and overrides the abstract method
 * getType().
 * 
 * <p>
 * <b>Time Spent: </b>
 * <p>
 * Siavash Samiei: 10 minutes
 * 
 * <b> Instance Variables </b>
 * <p>
 * <b> checkpointNum </b> the checkpoint id of this checkpoint block. 
 * 
 * @author Siavash Samiei
 * @version 2 06.08.15
 */
public class Checkpoint extends Block {
  //Stores the value of the checkpoint order in the level.
  private int checkpointNum;
  
  /**
   * Accessor method of the checkpointNum.
   * <p>
   * @author Siavash Samiei June 1, 2015
   * @return the number assigned to this checkpoint. 
   */
  public int getCheckpointNum() {
    return checkpointNum;
  }
  
  
  /**
   * Mutator method for the checkpoint of the number to the number given.
   * <p>
   * @author Siavash Samiei June 1, 2015
   * @param checkpointNum the new checkpointNum to be set to.
   */
  public void setCheckpointNum(int checkpointNum) {
    this.checkpointNum = checkpointNum;
  }
  
  
  /**
   * Creates a new Checkpoint block. 
   * <p>
   * @author Siavash Samiei June 1, 2015
   * @param x desired x value.
   * @param y desired y value.
   */
  public Checkpoint (int x, int y) {
    super(x, y, 5);
  }
  
  
  /**
   * Accessor method the type of the block.
   * <p>
   * @return the type of the block ("checkpoint")
   * @author Siavash Samiei June 1, 2015.
   */
  @Override
  public String getType() {
    return "checkpoint";
  }
  
}
