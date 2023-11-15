package org.template;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ainacio on Nov, 2023
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        //hook
        this.setVisible(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame headFirstDesignPatterns = new MyFrame("Head First Design Patterns");
    }
}
