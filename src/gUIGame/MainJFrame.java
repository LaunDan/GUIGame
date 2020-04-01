package gUIGame;

import javax.swing.*;

public class MainJFrame extends JFrame {

    public MainJFrame() {
        this.setTitle("Display image");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        this.add(panel);

        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        MainJFrame frame = new MainJFrame();
        frame.setVisible(true);
    }
}
