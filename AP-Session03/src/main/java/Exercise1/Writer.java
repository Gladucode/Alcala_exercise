 
/*
 * The Writer class defines the threads that write in the mailbox.
 * Messages are composed of a prefix and a sufix (integer btw 1 and 5)
 * The constructor parameters are the prefix, no. of msgs and the mailbox
 * Between messages, there is a random waiting time between 0.5 and 1 sec
 */

package Exercise1;

public class Writer extends Thread
{
    private String prefix;
    private int numMessages;
    private Mailbox myMailbox;

    public Writer(String prefix, int n, Mailbox mailbox)
    {
        this.prefix=prefix;
        numMessages=n;
        myMailbox=mailbox;
    }

    public void run()
    {
        for(int i=1; i<=numMessages; i++)
        {
            try
            {
                sleep((int)(500+500*Math.random()));
            } catch(InterruptedException e){  }
            myMailbox.sendMessage(prefix+i);
        }
    }
}

