package org.example;

public class Cell {
   int row;
   int column;
  boolean[] walls;
  boolean visited;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        walls = new boolean[]{true,true,true,true};
        this.visited = false;
    }
}
