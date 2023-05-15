package org.example;

import javax.swing.*;

public class CanvasExmpl extends JFrame {

public CanvasExmpl() {
    JFrame frame = new JFrame("My Drawing");
    frame.add(new MyCanvas());
    frame.setLayout(null);

    frame.setSize(402, 402);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}



}