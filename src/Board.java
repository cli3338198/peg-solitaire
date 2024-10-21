public class Board {

  private Peg[][] board = new Peg[7][7];

  public Board() {
    this.initialize();
  }

  public void initialize() {
    String assignments = "abcdefghijklmnopxPONMLKJIHGFEDCBA";
    int assignmentIndex = 0;

    for (int row = 0; row < 7; row++) {
      for (int col = 0; col < 7; col++) {
        this.board[row][col] = new Peg(row, col);

        if (this.inBounds(row, col)) {
          char assignment = assignments.charAt(assignmentIndex);
          this.board[row][col].setAssignment(assignment);
          this.board[row][col].setIsOccupied();
          assignmentIndex++;
        }
      }
    }

    int centerRow = (int) Math.floor(7 / 2);
    Peg center = this.board[centerRow][centerRow];
    center.setIsOccupied();
  }

  public void displayBoard() {
    for (int row = 0; row < 7; row++) {
      String currentRow = "";
      String currentRowGuide = "";

      for (int col = 0; col < 7; col++) {
        if (currentRow.length() > 0) {
          currentRow += " ";
        }

        if (this.board[row][col].getIsOccupied()) {
          currentRow += "P";
        } else {
          currentRow += " ";
        }

        if (currentRow.length() > 0) {
          currentRowGuide += " ";
        }

        currentRowGuide += this.board[row][col].getAssignment();
      }

      System.out.println(currentRow + "           " + currentRowGuide);
    }
  }

  public Boolean isValidMove() {
    return true;
  }

  public void makeMove() {
  }

  public Boolean isGameOver() {
    return true;
  }

  public void resetBoard() {
  }

  public Peg[][] getBoardState() {
    return this.board;
  }

  public Boolean inBounds(int row, int col) {
    // 00 01 05 06
    // 10 11 15 16

    // 50 51 55 56
    // 60 61 65 66

    if (row <= 1 || row >= 5) {
      if (col >= 2 && col <= 4) {
        return true;
      }
      return false;
    } else {
      return true;
    }
  }
}
