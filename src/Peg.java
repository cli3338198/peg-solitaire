public class Peg {
  private Boolean isOccupied = false;
  private int rowPosition;
  private int colPosition;
  private char assignment;

  public Peg(int row, int col) {
    this.rowPosition = row;
    this.colPosition = col;
    this.assignment = '.';
  }

  public Peg(int row, int col, char assignment) {
    this.rowPosition = row;
    this.colPosition = col;
    this.assignment = assignment;
  }

  public void setIsOccupied() {
    this.isOccupied = !this.isOccupied;
  }

  public Boolean getIsOccupied() {
    return this.isOccupied;
  }

  public void toggle() {
    this.isOccupied = !this.isOccupied;
  }

  public int getRowPosition() {
    return this.rowPosition;
  }

  public int getColPosition() {
    return this.colPosition;
  }

  public char getAssignment() {
    return this.assignment;
  }

  public void setAssignment(char newAssigment) {
    this.assignment = newAssigment;
  }
}
