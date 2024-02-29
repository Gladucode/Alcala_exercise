/*
 * Mailbox defines a Critical Conditional Region
 * sendMessage must wait when the mailbox is full
 * receiveMessage must wait if the mailbox is empty
 * When a thread finishes its execution, unblock others waiting
 */

package Exercise1;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mailbox
{
    private String message;
    private boolean filled=false;
    Lock lock = new ReentrantLock();
    Condition writers = lock.newCondition();
    Condition Readers = lock.newCondition();
    
 
    public void sendMessage(String msg)
    {           
        this.lock.lock();
        try{
            while(filled == true)
            {
                writers.await();
            }
            message = msg;
            filled = true;
            Readers.signalAll();
        }catch(Exception e){}
        finally {
            lock.unlock();
        }
    }
 
    
    
    
    public String receiveMessage()
    {
         this.lock.lock();
        try{
            while(filled == false)
            {
                Readers.await();
            }
            
            filled = false;
            writers.signalAll();
        }catch(Exception e){}
        finally {
            lock.unlock();
        }
        return message;
    }
}
