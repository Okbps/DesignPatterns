package com.ch08Template;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Aspire on 18.05.2017.
 */
public class MyApplet extends Applet{
    String message;

    @Override
    public void init() {
        message = "Hello! I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh no! I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        message = "This is the end, my only friend";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
