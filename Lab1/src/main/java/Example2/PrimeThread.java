package Example2;
import java.util.*;

public class PrimeThread extends Thread {
    private int x,y,n=0;
    private long time;
    public PrimeThread(int x, int y){
        this.x=x;
        this.y=y;
    }
    private boolean isPrime(int n){
        int root = (int) Math.sqrt((double) n);
        for(int i=2;i<=root;i++){
            if (n % i == 0 ) 
            {
                return false;
            }
        }
        return true;
    }
    
    public void run(){
        long t0 = (new Date()).getTime();
        for (int i=x; i<=y; i++){ 
            if(isPrime(i)){
                n++;
            }
        }
        long t1 = (new Date()).getTime();
        this.time = t1-t0;
        
    }
    public int noOfPrimes(){ 
        return n;
    }
    public long gettime(){return this.time;}
}
