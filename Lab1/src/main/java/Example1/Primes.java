package Example1;

// Prime Class to calculate the number of prime numbers
public class Primes {
    private int x,y,n=0;
    public Primes(int x, int y){
        this.x=x;
        this.y=y;
    }
    private boolean isPrime(int n){
        int root = (int) Math.sqrt((double) n);
        for(int i=2;i<=root;i++){ 
            if (n % i == 0 ){ 
                return false;
            }
        }
        return true;
    }
    public void calculate(){
        for (int i=x; i<=y; i++) 
        {
            if(isPrime(i))
            {
                n++;
            }
        }
    }
    public int noOfPrimes(){ 
        return n;
    }
}
