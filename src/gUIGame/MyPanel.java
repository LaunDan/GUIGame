package gUIGame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private Image picture;
    private int pictureWidth;
    private int pictureHeight;

    public MyPanel() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource("picture1.jpg"));
        picture = ii.getImage();

        pictureWidth = picture.getWidth(this);
        pictureHeight = picture.getHeight(this);

        int x = 20 + pictureWidth + 20;
        int y = 20 + pictureHeight + 20;

        Dimension dimensionPanel = new Dimension(x,y);

        this.setPreferredSize(dimensionPanel);
        this.setBackground(Color.BLACK);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(picture, 20, 20, this);
    }
}
