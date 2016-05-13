package game.blocks;

/**
 * The block class for all blocks that make up a level. 
 * <p>
 * <b>Time spent:</b>
 * <p>
 * Siavash Samiei: 0.5 hours
 * <p>
 * Justin Pu: 0.5 hours
 * <br>
 * 
 * <b> Instance Variables </b>
 * <p>
 * <b> texture </b> the texture id of the block.
 * <p>
 * <b> x </b> the x coordinate of the block.
 * <p>
 * <b> y </b> the y coordinate of the block. 
 * <p>
 * <b> random </b> a variable for randomized textures. 
 * 
 * @author Siavash Samiei May 20, 2015
 * @version 2 06.08.15 
 */
public abstract class Block {
    
    /**
     * Abstract method that is used to return the type
     * of each block.
     * <p>
     * @author Justin Pu June 1, 2015
     * @return the type of block. 
     */
    public abstract String getType();
    
    // The texture of the block (code).
    private int texture;
    // The x coordinate of the block
    private int x;
    // The y coordinate of the block
    private int y;
    //Random number variable, generates and stores a random value.
    private double random = Math.random();
    
    /**
     * Constructor of the block class that initializes the
     * x, y, and texture values of a block.
     * <p>
     * Modified by Justin Pu May 24, 2015
     * @param x desired x value.
     * @param y desired y value.
     * @param texture desired texture value.
     * @author Siavash Samiei May 20, 2015
     */
    public Block(int x, int y, int texture) {
        this.x = x;
        this.y = y;
        this.texture = texture;
    }
    
    /**
     * Accessor method for the random number kept by this block for varying block textures.
     * <p>
     * Modified Justin Pu June 1
     * @author Siavash Samiei May 30, 2015
     * @return the static random number.
     */
    public double random() {
        return random;
    }
    
    /**
     * Accessor method for x coordinate value.
     * <p>
     * Modified Justin Pu June 1
     * @author Siavash Samiei May 30, 2015
     * @return the x value.
     */
    public int getX() {
        return x;
    }
    
    
    /**
     * Accessor method for y coordinate value.
     * <p>
     * Modified Justin Pu June 1
     * @author Siavash Samiei May 30, 2015
     * @return the y value.
     */
    public int getY() {
        return y;
    }
    
    
    /**
     * Accessor method for texture value.
     * <p>
     * Modified Justin Pu June 1
     * @author Siavash Samiei May 30, 2015
     * @return the texture value.
     */
    public int getTexture() {
        return texture;
    }
    
    
    /**
     * Mutator method for the texture value, sets the value.
     * <p>
     * Modified Justin Pu June 1
     * @author Siavash Samiei May 30, 2015
     * @param texture the desired texture value value.
     */
    public void setTexture(int texture) {
        this.texture = texture;
    }
    
    
    /**
     * The String representation of this block.
     * <p>
     * @author Justin Pu May 24, 2015
     * @return returns the String repersentation of a block.
     */
    public String toString() {
        return getType() + ": " + texture + " at (" + x + ", " + y + ")";
    }
}
