package com.ch11Proxy.cdcovers;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Aspire on 28.05.2017.
 */
public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageUrl;
    Thread retrievalThread;
    boolean retreaving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon==null){
            return 800;
        }else {
            return imageIcon.getIconWidth();
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon==null){
            return 600;
        }else {
            return imageIcon.getIconHeight();
        }
    }

    synchronized public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(imageIcon!=null){
            imageIcon.paintIcon(c, g , x, y);
        }else{
           g.drawString("Loading CD cover, please wait...", x+300, y+190);

           if(!retreaving){
               retreaving = true;

               retrievalThread = new Thread(new Runnable() {
                   @Override
                   public void run() {
                       try {
                           setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                           c.repaint();
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                   }
               });

               retrievalThread.start();
           }
        }
    }
}
