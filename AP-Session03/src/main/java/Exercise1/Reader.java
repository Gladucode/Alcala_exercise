/*
 * Reader defines threads that read messages from a mailbox showing them in the screen
 * The mailbox and no of msgs are received as parameters by the constructor
 * Between reading and writing there is a random time btw 0.5 y 1 sec.
 */
package Exercise1;

public class Reader extends Thread
{
    private int numMessages;
    private Mailbox miMailbox;

    public Reader(int numMenssages, Mailbox miMailbox)
    {
        this.numMessages=numMenssages;
        this.miMailbox=miMailbox;
    }

    @Override
    public void run()
    {
        for(int i=0; i<numMessages; i++)
        {
            try
            {
                sleep((int)(500+500*Math.random()));
            } catch(InterruptedException e){ }
                System.out.println(miMailbox.receiveMessage());
        }
        System.out.println("Total messages read: " + numMessages);
    }
}
