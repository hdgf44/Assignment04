/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millg1278
 */
public class Doctor {
    
    private int row;
    private int col;
    
    public Doctor(int startRow, int startCol){
        row = startRow;
        col = startCol;
    }
    
    public void move(int row, int col){
        // if they click 1 square away. move there. if not. teleport anywhere
      if(Math.abs((row - this.row)) > 1 || (Math.abs(col - this.col)) > 1){
          row = (int)(Math.random()*8);
          col = (int)(Math.random()*8);
      }
          this.row = row;
          this.col = col;
      }
          
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
}
