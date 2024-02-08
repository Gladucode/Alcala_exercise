package Example2;

import java.util.*;

public class NoOfPrimeNumbers {

    public static void main(String[] x) {
        long t0 = (new Date()).getTime(); //t0 start time
        PrimeThread p1 = new PrimeThread(1, 2000000);
        PrimeThread p2 = new PrimeThread(2000001, 4000000);
        PrimeThread p3 = new PrimeThread(4000001, 6000000);
        PrimeThread p4 = new PrimeThread(6000001, 8000000);
        PrimeThread p5 = new PrimeThread(8000001, 10000000);

        p1.start();

        p2.start();

        p3.start();

        p4.start();

        p5.start();

        try {
            //wait for all threads to finish   
            p1.join();

            p2.join();

            p3.join();

            p4.join();

            p5.join();

        } catch (InterruptedException e) {
        }

        int n = p1.noOfPrimes() + p2.noOfPrimes() + p3.noOfPrimes()
                + p4.noOfPrimes() + p5.noOfPrimes();
        long t = (new Date()).getTime(); //t1 final time
        System.out.println("No. of Primes number below 10000000: " + n + ". Calculation done in " + (t - t0) + " ms.");

        System.out.println("No. of Primes number  in between 0 and " + 2000000 + ": " + p1.noOfPrimes() + ".Calculation done in "+p1.gettime()+" ms");
        System.out.println("No. of Primes number  in between 2000001 and " + 4000000 + ": " + p2.noOfPrimes() + ".Calculation done in "+p2.gettime()+" ms");
        System.out.println("No. of Primes number  in between 4000001 and " + 6000000 + ": " + p3.noOfPrimes() + ".Calculation done in "+p3.gettime()+" ms");
        System.out.println("No. of Primes number  in between 6000001 and " + 8000000 + ": " + p4.noOfPrimes() + ".Calculation done in  "+p4.gettime()+" ms");
        System.out.println("No. of Primes number  in between 8000001 and " + 10000000 + ": " + p5.noOfPrimes() + ".Calculation done in "+p5.gettime()+" ms");
        
        
        

    }

}
