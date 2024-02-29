//  The Gateway class defines a Conditional Critical Region for a
//  boolean variable closed to be checked by a process
//  When closed == false (open) the process can continue, otherwise
//  the process must stop.

package Exercise2;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Gateway
{
    private boolean close=false;
    private boolean close1=false;
    private boolean close2=false;
    private boolean close3=false;
    private boolean close4=false;
    private Lock lock = new ReentrantLock();
    private Condition stop = lock.newCondition();
    private Condition stop1 = lock.newCondition();
    private Condition stop2 = lock.newCondition();
    private Condition stop3 = lock.newCondition();
    private Condition stop4 = lock.newCondition();
    
    

    public void look(int p )
    {
        switch (p){
            case 1:
                try
                {
                    lock.lock();
                    while(close1)
                    {
                        try
                        {
                            stop1.await();
                        } catch(InterruptedException ie){ }
                    }
                }
                finally
                {
                    lock.unlock();
                }
            case 2:
                try
                {
                    lock.lock();
                    while(close2)
                    {
                        try
                        {
                            stop2.await();
                        } catch(InterruptedException ie){ }
                    }
                }
                finally
                {
                    lock.unlock();
                }
            case 3:
                try
                {
                    lock.lock();
                    while(close3)
                    {
                        try
                        {
                            stop3.await();
                        } catch(InterruptedException ie){ }
                    }
                }
                finally
                {
                    lock.unlock();
                }
            case 4:
                try
                {
                    lock.lock();
                    while(close4)
                    {
                        try
                        {
                            stop4.await();
                        } catch(InterruptedException ie){ }
                    }
                }
                finally
                {
                    lock.unlock();
                }
        }
    }
    
    public void open(int p)
    {
        switch (p){
            case 1:
                try
                {
                    lock.lock();
                    close1=false;
                    stop1.signalAll();
                }
                finally
                {
                    lock.unlock();
                }
            case 2:
                try
                {
                    lock.lock();
                    close2=false;
                    stop2.signalAll();
                }
                finally
                {
                    lock.unlock();
                }
            case 3:
                try
                {
                    lock.lock();
                    close3=false;
                    stop3.signalAll();
                }
                finally
                {
                    lock.unlock();
                }
            case 4:
                try
                {
                    lock.lock();
                    close4=false;
                    stop4.signalAll();
                }
                finally
                {
                    lock.unlock();
                }
    }
    }
    
    public void close(int p)
    {
        switch (p){
            case 1:
                try
                {
                    lock.lock();
                    close1=true;
                }
                finally
                {
                    lock.unlock();
                }
            case 2:
                try
                {
                    lock.lock();
                    close2=true;
                }
                finally
                {
                    lock.unlock();
                }
            case 3:
                try
                {
                    lock.lock();
                    close3=true;
                }
                finally
                {
                    lock.unlock();
                }
            case 4:
                try
                {
                    lock.lock();
                    close4=true;
                }
                finally
                {
                    lock.unlock();
                }
    }
    }


    





}
