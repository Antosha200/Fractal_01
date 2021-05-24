package by;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static int weight;
    public static int height;
    public static int x;
    public static int xx = 0, yy = 0;
    public static class obj extends JComponent  {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Random rand = new Random();
            float r = rand.nextFloat();
            float gg = rand.nextFloat();
            float b = rand.nextFloat();
            weight = 100; height = 100;
            x = 5; //количество итераций
            int divisor = 2, Dx1 = 70, Dx2 = 120, Dx3 = 25;
            int Dy1 = 25, Dy2 = 70, Dy3 = 120;
            g.translate(getWidth()/2, getHeight()/2);
            g.setColor(Color.RED);
            g.fillOval(xx,yy, weight,height);
            for (int i = 0; i<x;i++){
                Color randomColor = new Color(r,gg,b);
                g.setColor(randomColor);
                g.fillOval(xx-Dx1,yy+Dy1,weight/divisor,height/divisor); //слева
                g.fillOval(xx+Dx2,yy+Dy1,weight/divisor,height/divisor); //справа
                g.fillOval(xx+Dx3,yy-Dy2,weight/divisor,height/divisor); //вверху
                g.fillOval(xx+Dx3,yy+Dy3,weight/divisor,height/divisor); //внизу

                divisor++;
                Dx1+=70; Dx2+=90; Dy2+=70; Dy3+=90;
            }
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фрактал");
        frame.setVisible(true);
        frame.setSize(700,700);
        obj RR = new obj();
        frame.add(RR);
        //while (true){

           // frame.repaint();
        //}
    }
}
