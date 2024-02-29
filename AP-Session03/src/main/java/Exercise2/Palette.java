package Exercise2;
import java.awt.Color;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Palette
{
    Lock lock = new ReentrantLock();
    private Color [] colours = new Color[4];
    private boolean[] free = new boolean[4];
    
    public Palette()
    {
        colours[0]=Color.red;
        colours[1]=Color.blue;
        colours[2]=Color.green;
        colours[3]=Color.yellow;
        for(int i=0; i<4; i++)
        {
            free[i]=true;
        }
    }
    
    public Color tomaColor()
    {
        lock.lock();
        int i=0;
        boolean exit = false;
        while(!exit)
        {
            i = (int)(4 * Math.random());  //Get a random colour
            if(free[i])
            {
                free[i]=false;
                exit = true;
            }
        }

        lock.unlock();
        return colours[i];
    }
    
    public void dejaColor(Color c) //You do not really need to use a lock because a color is only picked up by a painter
    {
        lock.lock();
        for(int i=0; i<4; i++)
        {
            if(c.equals(colours[i]))
            {
                free[i]=true;
            }
        }
        lock.unlock();
    }
}
