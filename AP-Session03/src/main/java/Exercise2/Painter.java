package Exercise2;

import java.awt.Color;
import javax.swing.JButton;

public class Painter extends Thread
{
    private JButton b;
    private Palette p;
    private Color black = Color.black;
    private Gateway gateway;
    private int id;
    
    public Painter(JButton b, Palette p, Gateway gateway,int id)
    {
        this.b=b;
        this.p=p;
        this.gateway=gateway;
        this.id = id;
        
    }
    
    
    public void run()
    {
        
        while (true)
        {
            
                b.setBackground(black);             //Paints in black
                try
                {
                    sleep(500 + (int)(1500*Math.random()));  //wait  0.5 - 2 seg.
                } catch (InterruptedException e){}
                gateway.look(id);              //Check if it have to stop
                Color c=p.tomaColor();     //Takes a random color
                b.setBackground(c);        //paint the button
                try
                {
                    sleep(1000 + (int)(2000*Math.random()));  //wait  1 - 3 seg.
                } catch (InterruptedException e){}
                gateway.look(id);             //Check if it have to stop
                p.dejaColor(c);   
            
                   
        }
    }
}
