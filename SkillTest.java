// Aim: Write a java program to draw Oval, Rectangle, Line and fill the color in it anf display it on Applet.


import java.applet.*;
import java.awt.*;

public class SkillTest extends Applet{
    public void init() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Algerian",Font.BOLD,50));
        g.drawString("Drawing Dog using Shapes(Oval, rectangle and line) :) XDD : ", 100, 50);

        int x[]={50,150,150,50};
        int y[]={50,50,150,150};

        //Draw an Oval

        g.setColor(Color.white);
        g.drawOval(450,150,150,100);
        g.setColor(Color.green);
        g.fillOval(450,150,150,100);

        //Draw a Rectangle

        g.setColor(Color.WHITE);
        g.drawRect(300,250,200,100);
        g.setColor(Color.GREEN);
        g.fillRect( 300,250, 200, 100 );

        //Draw a Line

        g.setColor(Color.WHITE);
        g.drawLine(300,250,200,100);
        g.setColor(Color.GREEN);

        g.setColor(Color.WHITE);
        g.drawLine(450,350,450,450);
        g.setColor(Color.GREEN);

        g.setColor(Color.WHITE);
        g.drawLine(350,350,350,450);
        g.setColor(Color.GREEN);
        showStatus("Skill Test");
    }
}