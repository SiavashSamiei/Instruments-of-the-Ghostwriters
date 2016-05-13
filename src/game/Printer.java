package game;

import game.Highscores.Entry;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * The printer class that controls printing of a highscores file.
 *
 * <p>
 * <b> Instance Variables </b>
 * <p>
 * <b> highscoresFile </b> File, the highscores file to write to.
 * <p>
 * 
 * @author Siavash Samiei June 1, 2015 
 * @version 3 
 */
public class Printer implements Printable {
  
  private File highscoresFile;
  
  /**
   * This method must be called before calling print. 
   * Sets the highscores file to print.
   *
   * @param highscoresFile the file to read highscores from.
   */
  public void setHighscoresFile(File highscoresFile) {
    this.highscoresFile = highscoresFile;
  }
  
  /**
   * Abstract method in interface Printable. Draws the highscores page. 
   *
   * @throws IllegalStateException If the highscores file to print from has not been set. 
   * @author Siavash Samiei June 1, 2015.
   * 
   */
  public int print(Graphics g, PageFormat pf, int page) throws IllegalStateException {
    
    if (page > 0) {
      return NO_SUCH_PAGE;
    }
    
    if (highscoresFile == null)
      throw new IllegalStateException("No highscores file specified");

    Graphics2D g2d = (Graphics2D)g;
    g2d.translate(pf.getImageableX(), pf.getImageableY());
    
    
    try {
      g.drawImage(ImageIO.read(new File(Paths.MISC + "print.png")), 25, 25, null);
    } catch (IOException e) { }
    ArrayList<Entry> entries = Highscores.getEntries(highscoresFile);
    
    g.setFont(new Font("Corbel", Font.BOLD, 18));
    if (entries.size() == 0)
      g.drawString("No Highscores for this level yet.", 180, 300);
    else {
      g.drawString("Rank", 50, 300);
      g.drawString("Username", 100, 3200);
      g.drawString("Score", 420, 300);
      g.drawLine(50, 304, 510, 304);
      g.drawLine(50, 305, 510, 305);
      g.setFont(new Font("Corbel", Font.BOLD, 14));
      int y = 1;
      for (Entry e : entries) {
        g.drawString(Integer.toString(y) + ".", 70, 300 + y * 30);
        g.drawString(e.getName(), 100, 300 + y * 30);
        g.drawString(Integer.toString(e.getPoints()), 420, 300 + y * 30);
        y++;
      }
    }  
    return PAGE_EXISTS;
  }
  
}