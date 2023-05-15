package org.example;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.List;
import java.util.Stack;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        int visitedCounter = 400;
        CanvasExmpl canva = new CanvasExmpl();
        Stack<Cell> stack = new Stack<>();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                stack.push(new Cell(i, j));
            }
        }
        Cell current = stack.lastElement();
        while(visitedCounter<200) {


            current.visited = true;





            //canva.repaint(( current.row)*20 , ( current.column)*20 , 10,10);
            // repaint canva at the end
        }

    }


}