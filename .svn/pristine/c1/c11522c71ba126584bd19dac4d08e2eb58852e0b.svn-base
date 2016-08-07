package ua.edu.loops.forCircle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomCircles extends JPanel{
    String ans;
    int count;
    Color randomColor;
    int R,G, B;
    public RandomCircles() {
        ans = JOptionPane.showInputDialog("Enter the number of circles");
        count= Integer.valueOf(ans);
        int i=0;
        repaint();
    }
    public void paintComponent(Graphics page) //    public void paint(Graphics page)
    {
        Random generator = new Random();
        int x, y, diameter;
        for(int i = 0; i < count; i++) { //loop that takes the count and does this "x" times
            R = (int) (Math.random( )*256);
            G = (int) (Math.random( )*256);
            B= (int)(Math.random( )*256);
            randomColor = new Color(R, G, B);
            page.setColor(randomColor);//sets color to blue
            x = generator.nextInt(90);//random location for x
            y = generator.nextInt(90);//random location for y
            diameter = generator.nextInt(30);//random size
            page.fillOval(x, y, diameter, diameter);//draws the circle
        }
    }
}
