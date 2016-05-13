package game;

/**
 * All Edits:
 * Justin Pu - May 16
 * Siavash Samiei - May 23 - 24
 */
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 * Driver class of our program. This class creates the static instances of the Window, game, puzzle, main menu, and pause menu of the game. This class controls all the interactionst throughout the Frame of our custom window.
 * <p>
 * <b> Instance Variables </b>
 * <p>
 * <b> j </b> GameWindow, the window.
 * <p>
 * <b> g </b> Game, the game.
 * <p>
 * <b> p </b> Puzzle, the puzzle.
 * <p>
 * <b> mm </b> MainMenu, the main menu.
 * <p>
 * <b> pm </b> PauseMenu, the pause menu.
 * <p>
 * 
 * <b>Total time spent:</b>
 * <p>
 * Siavash Samiei: 20 hours
 * <p>
 * Justin Pu: 1 hour
 * 
 * @author Siavash Samiei May 15, May 24, May 25 modified Justin Pu May 16, May 17, May 23
 * @version 7 06.08.15
 */
public class InstrumentsOfTheGhostwriters{
  static GameWindow j;
  private static Game g;
  private static Puzzle p;
  private static MainMenu mm;
  private static PauseMenu pm;
  
  /*
   * Constrcutor for the driver class creates a GameWindow and initializes PauseMenu.
   * <p>
   * @author Siavash Samiei June 8, 2015
   */
  public InstrumentsOfTheGhostwriters() {
    pm = new PauseMenu ();
    j = new GameWindow();
    j.setVisible(true);
    j.setSize(870,668);
  }  
  
  
  /*
   * This method creates and new game (Canvas) and adds it to the JFrame GameWindow.
   * <p>
   * @author Siavash Samiei June 8, 2015
   */
  public static void newGame(int world, boolean puzzExists,String playerName,String color)
  {
    if (puzzExists)
      j.remove(p);
    g = new Game(new Level (Paths.LEVELS + "World "+world+".txt"), new Player(playerName, color));  
    j.remove(mm);
    j.add(g);
    g.init();
    g.setSize(800,600);
    g.setLocation (35,35);
    g.setVisible(true);
    g.requestFocusInWindow();
    g.addKeyListener(g);
    j.addKeyListener(g);
    new Thread(g).start(); 
    j.repaint();
    j.revalidate();
  }
  
  
  /*
   * This method creates and new main menu (JPanel) and adds it to the JFrame GameWindow.
   * <p>
   * @author Siavash Samiei June 8, 2015
   */
  public static void newMainMenu(){
    mm= new MainMenu ();
    mm.makeMenu();
    j.add(mm);
    mm.setLocation (35,35);
    mm.addKeyBindings(j.getFrameBackground());
    j.repaint();
    j.revalidate();
  }
  
  
  /*
   * This method creates and new pause menu (Jpanel) and adds it to the JFrame GameWindow.
   * <p>
   * @author Siavash Samiei June 8, 2015
   */
  public static void newPauseMenu(){
    g.setVisible(false);
    pm.setVisible (true);
    pm.setEnabled (true);
    pm.makeMenu();
    j.add(pm);
    pm.setLocation (35,35);
    j.repaint();
    j.revalidate();
  }
  
  
  /*
   * This method creates and new puzzle (JPanel) and adds it to the JFrame GameWindow.
   * <p>
   * @param level the game that the puzzle appears in.
   * @param letters number of letters.
   * @author Siavash Samiei June 8, 2015
   */
  public static void makePuzzle(Game level, int letters){
    p = new Puzzle(level, letters);
    g.setVisible(false);
    j.add(p);
    p.setLocation (35,35);
    p.setSize(800,600);
    p.setVisible(true);
    p.setEnabled(true);
    j.repaint();
    j.revalidate();
  }
  
  
  /*
   * This method hides of the Pause Menu and resumes the game.
   * <p>
   * @author Siavash Samiei June 8, 2015
   */
  public static void resumeGame(){
    pm.setEnabled(false);
    pm.setVisible(false);
    g.setVisible(true);
    g.unpause();
    g.requestFocusInWindow();
    j.repaint();
    j.revalidate();
  }
  
  
  /*
   * This method removes all components visible and returns the user back to the Main Menu.
   * <p>
   * @param puzzle Boolean to check if puzzle exists.
   * @author Siavash Samiei June 8, 2015
   */
  public static void exitToMain(Boolean puzzle){
    j.remove(pm);
    j.remove(g);
    if (puzzle)
      j.remove(p);
    newMainMenu();
  }
  
  
  /**
   * Main method. Runs the program. 
   * Also starts the audio clip.
   * <p>
   * @param args The command line parameters. 
   * @author Justin Pu May 16
   */
  public static void main(String[] args) {
    JFrame j = new JFrame();
    j.requestFocus();
    j.setUndecorated(true);
    j.setVisible(true);
    j.setSize(800, 600);
    JLabel p = new JLabel();
    p.setIcon(new ImageIcon("lib\\splash\\splash.gif"));
    j.add(p);
    
    j.revalidate();
    j.repaint();
    try {
      Thread.sleep(3400);
    } catch (InterruptedException e) { }
    j.setVisible(false);
    j.dispose();
    InstrumentsOfTheGhostwriters i = new InstrumentsOfTheGhostwriters();
    try {
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(new File(Paths.MUSIC + "music.wav")));
      clip.loop(Clip.LOOP_CONTINUOUSLY);
    } catch (Exception e) { }
    newMainMenu();
  }
}
