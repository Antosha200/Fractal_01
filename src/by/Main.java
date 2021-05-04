package by;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static int weight;
    public static int height;
    public static int count;
    public static class obj extends JComponent  {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            weight = 100; height = 100;
            g.translate(getWidth()/2, getHeight()/2);
            g.setColor(Color.RED);
            g.fillOval(0,0, weight,height);
            for (int i = 0; i<count;i++){

            }
        }
    }
    public static void main(String[] args) {
        Printer.print("Рисуется Фрактал");
        JFrame frame = new JFrame("Фрактал");
        frame.setVisible(true);
        frame.setSize(700,700);
        obj RR = new obj();
        frame.add(RR);
        while (true){
            frame.repaint();
        }
    }
}
