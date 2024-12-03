import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
  public static void main(String[] args) {
    Board board = new Board();

    board.displayBoard();

    // GUI
    JFrame topFrame = null;

    topFrame = new JFrame("Peg Solitaire");
    topFrame.setSize(400, 400);

    topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    topFrame.setVisible(true);
    
  }
}