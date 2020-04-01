package gUIGame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private Image picture;
    private int pictureWidth;
    private int pictureHeight;

    public MyPanel() {
    this.setPreferredSize(new Dimension(1050,800));
    this.setBackground(Color.white);

    ImageIcon ii = new ImageIcon(this.getClass().getResource("picture1.jpg"));
    picture = ii.getImage();

    
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(picture, 5 , 5, this);
    }
}
