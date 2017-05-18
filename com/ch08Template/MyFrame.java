package com.ch08Template;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aspire on 18.05.2017.
 */
public class MyFrame extends JFrame{
    public MyFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new MyFrame("Head First Design Patterns");
    }
}
