package game;

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A custom JFrame that has a customized window design. It has most of the features of a normal window, except there is no maximizing feature nor a resizing feature. This is because the game size is designed to be not resizable. The two buttons, minimizing and closing, change icons when hovering over and when clicking. A JPanel is pre-built and set up and can beaccessed with the accessor method. 
 * <p>
 * <b> Instance Variables </b>
 * <p>
 * <b> toolkit </b> Toolkit, the deafult toolkit.
 * <p>
 * <b> icons </b> Icon[][], all icons for button textures.
 * <p>
 * <b> closeButton </b> JLabel, closes the window.
 * <p>
 * <b> minimizeButton </b> JLabel, minimizes the window.
 * <p>
 * <b> moveBar </b> JLabel, bar that user can click and drag to move window.
 * <p>
 * <b> mouseX </b> Int, mouse X position.
 * <p>
 * <b> mouseY </b> Int, mouse Y position.
 * <p>
 * <b> clicking  </b> Boolean, if user is clicking or not.
 * <p>
 * <b> background </b> CustomComponent, component set to background image of the window. 
 * <p>
 * @author Justin Pu May 16
 * <p>
 * ALL EDITS
 * <p>
 * May 16 Justin Pu
 * <p>
 * May 17 Justin Pu - Added custom cursor
 * <p>
 * May 23 Justin Pu - the main component
 * <p>
 * May 24 Justin Pu - Added to a package
 * <p>
 * May 26 Siavash Samiei - Attempted to fix Canvas problems
 * <p>
 * May 26 Siavash Samiei - Re-implemented custom cursor
 * <p>
 * May 27 Siavash Samiei - Fixed so that components would be displayed properly
 * <p>
 * June 4 Siavash Samiei - Changed background addition, made ready for implementation in final program.
 * 
 * <p>
 * <b>Total time spent:</b>
 * <p>
 * Siavash Samiei: 5 hours
 * <p>
 * Justin Pu: 20 hours
 * 
 */
public class GameWindow extends JFrame {
  
  private static Toolkit toolkit = Toolkit.getDefaultToolkit ();
  private static Icon[][] icons; // x: 0 - close, 1 - minimize; y: 0 - normal, 1 - hover, 2 - click
  private JLabel closeButton;
  private JLabel minimizeButton;
  private JLabel moveBar;
  private int mouseX, mouseY;
  private boolean clicking;
  private CustomComponent background;
  
  
  /**
   * Creates new custom window (GameWindow) with a specified name. 
   * <p>
   * Created on May 16, 2015
   * Modified by Justin Pu May 17
   * @author Justin Pu
   * @version 7 06.08.15
   */
  public GameWindow() {
    super("Instruments of the Ghostwriters"); 
    try {
      javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch(Exception e) { }
    
    this.setSize(800,600);
    icons = new Icon [2] [3];
    icons[0][0] = new ImageIcon(Paths.GUI + "close.png");
    icons[0][1] = new ImageIcon(Paths.GUI + "close_hover.png");
    icons[0][2] = new ImageIcon(Paths.GUI + "close_click.png");
    icons[1][0] = new ImageIcon(Paths.GUI + "minimize.png");
    icons[1][1] = new ImageIcon(Paths.GUI + "minimize_hover.png");
    icons[1][2] = new ImageIcon(Paths.GUI + "minimize_click.png");
    
    // Initializing variables
    closeButton = new JLabel();
    minimizeButton = new JLabel();
    moveBar = new JLabel();
    background = new CustomComponent();
    
    // Setting up the window (JFrame)
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setUndecorated(true);
    setSize(870, 668);
    setLayout(null);
    setIconImage(new ImageIcon(Paths.GUI + "icon.png").getImage());
    setCursor(toolkit.createCustomCursor(toolkit.getImage(Paths.GUI + "cursor.png"), new Point (0, 0), "Pen")); // Custom cursor
    requestFocusInWindow();
    
    // Setting up closeButton
    closeButton.setSize(30, 19);
    closeButton.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent e) {
        closeButtonMouseEntered();
      }
      public void mouseExited(MouseEvent e) {
        closeButtonMouseExited();
      }
      public void mousePressed(MouseEvent e) {
        closeButtonMousePressed();
      }
      public void mouseReleased(MouseEvent e) {
        closeButtonMouseReleased(e);
      }
    });
    closeButton.setIcon(icons[0][0]);
    add(closeButton);
    closeButton.setLocation(836, 5);
    
    // Setting up minimizeButton
    minimizeButton.setSize(20, 19);
    minimizeButton.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent e) {
        minimizeButtonMouseEntered();
      }
      public void mouseExited(MouseEvent e) {
        minimizeButtonMouseExited();
      }
      public void mousePressed(MouseEvent e) {
        minimizeButtonMousePressed();
      }
      public void mouseReleased(MouseEvent e) {
        minimizeButtonMouseReleased(e);
      }
    });
    
    minimizeButton.setIcon(icons[1][0]);
    add(minimizeButton);
    minimizeButton.setLocation(813, 5);
    
    // Setting up moveBar
    moveBar.addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        moveBarMouseDragged(e);
      }
    });
    moveBar.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        moveBarMousePressed(e);
      }
    });
    add(moveBar);
    moveBar.setSize(870, 28);
    moveBar.setLocation(0, 0);
    
    //Setting up the background CustomComponent
    add(background);
    background.setSize(873, 668);
    background.setLocation(0, 0);
    
  }
  
  /**
   * Setting background of the window.
   * <p>
   *@return the JComponent background. 
   *@author Siavash Samiei*
   */
  public JComponent getFrameBackground(){
    return background;
  }
  
  
  /**
   * Changes the image of the close button to the hover icon when the
   * mouse enters the button's area. If the mouse is being clicked
   * (held down), then the image is set to the click image instead. 
   * <p>
   * @author Justin Pu May 16
   */
  private void closeButtonMouseEntered() {
    closeButton.setIcon(icons[0][(clicking) ? 2 : 1]);
  }
  
  
  /**
   * Changes the image of the close button back to the normal icon when the
   * mouse exits the button's area. 
   * <p>
   * @author Justin Pu May 16
   */
  private void closeButtonMouseExited() {
    closeButton.setIcon(icons[0][0]);
  }
  
  
  /**
   * Stores the original location of the cursor when the user possibly starts
   * moving the window so that the window moving is smooth and doesn't move
   * to the top left corner at the beginning. 
   * <p>
   * @author Justin Pu May 16
   */
  private void closeButtonMousePressed() {
    clicking = true;
    closeButton.setIcon(icons[0][2]);
  }
  
  
  /**
   * Changes the image of the close button to the pressed icon. Sets the
   * clicking boolean to true so that when the cursor re-enters the label, the
   * icon will still be clicked. 
   * <p>
   * @author Justin Pu May 16
   */
  private void closeButtonMouseReleased(MouseEvent e) {
    clicking = false;
    closeButton.setIcon(icons[0][0]);
    closeButton.revalidate();
    closeButton.repaint();
    revalidate();
    repaint();
    if (e.getX() >= 0 && e.getX() <= 40 && e.getY() >= 0 && e.getY() <= 20)
      System.exit (0);
  }
  
  
  /**
   * Changes the image of the minimize button to the hover icon when the
   * mouse enters the button's area. If the mouse is being clicked
   * (held down), then the image is set to the click image instead. 
   * <p>
   * @author Justin Pu May 16
   */
  public void minimizeButtonMouseEntered() {
    minimizeButton.setIcon(icons[1][(clicking) ? 2 : 1]);
  }
  
  
  /**
   * Changes the image of the minimize button back to the normal icon when the
   * mouse exits the button's area. 
   * <p>
   * @author Justin Pu May 16
   */
  private void minimizeButtonMouseExited() {
    minimizeButton.setIcon(icons[1][0]);
  }
  
  
  /**
   * Changes the image of the minimize button to the pressed icon. Sets the
   * clicking boolean to true so that when the cursor re-enters the label, the
   * icon will still be clicked. 
   * <p>
   * @author Justin Pu May 16
   */
  private void minimizeButtonMousePressed() {
    clicking = true;
    minimizeButton.setIcon(icons[1][2]);
  }
  
  
  /**
   * Changes the image of the minimize button back to the normal icon. It sets
   * the clicking boolean variable is set to false since the cursor is 
   * released. If the cursor is released within the label, then the window is 
   * set to the iconified state. 
   * <p>
   * @author Justin Pu May 16
   */
  private void minimizeButtonMouseReleased(MouseEvent e) {
    clicking = false;
    minimizeButton.setIcon(icons[1][0]);
    minimizeButton.revalidate();
    minimizeButton.repaint();
    revalidate();
    repaint();
    if (e.getX() >= 0 && e.getX() <= 20 && e.getY() >= 0 && e.getY() <= 20)
      setExtendedState(ICONIFIED);
  }
  
  
  /**
   * Changes the location of the window when the mouse drags on the moveBar
   * label area. 
   * <p>
   * @author Justin Pu May 16
   */
  private void moveBarMouseDragged(MouseEvent e) {
    setLocation(e.getXOnScreen() - mouseX, e.getYOnScreen() - mouseY);
  }
  
  
  /**
   * Stores the original location of the cursor when the user possibly starts
   * moving the window so that the window moving is smooth and doesn't move
   * to the top left corner at the beginning. 
   * <p>
   * @author Justin Pu May 16
   */
  private void moveBarMousePressed(MouseEvent e) {
    mouseX = e.getX();
    mouseY = e.getY();
  }  
}
