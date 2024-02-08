package Example1;




//Prime calculation
import java.util.*;
public class NoOfPrimeNumbers {
    public static void main(String[] x){
           long t0 = (new Date()).getTime(); //t0
           Primes p1 = new Primes(1,2000000);
           Primes p2 = new Primes(2000001,4000000);
           Primes p3 = new Primes(4000001,6000000);
           Primes p4 = new Primes(6000001,8000000);
           Primes p5 = new Primes(8000001,10000000);
           
           
           long t1 = (new Date()).getTime(); //t0
           p1.calculate();
           long t2 = (new Date()).getTime(); //t0
           p2.calculate();
           long t3 = (new Date()).getTime(); //t0
           p3.calculate();
           long t4 = (new Date()).getTime(); //t0
           p4.calculate();
           long t5 = (new Date()).getTime(); //t0
           p5.calculate();
           long t6 = (new Date()).getTime(); //t0
           
           
           long T1 = t2-t1;
           long T2 = t3-t2;
           long T3 = t4-t3;
           long T4 = t5-t4;
           long T5 = t6-t5;
           
           
           
           
           
           int n=p1.noOfPrimes()+p2.noOfPrimes()+p3.noOfPrimes ()
                          +p4. noOfPrimes()+p5. noOfPrimes();
           
           
           long t = (new Date()).getTime(); //t1=final time
           
           
           System.out.println("No. of Primes number below 10000000: "+n+". Calculation done in "+(t-t0)+" ms.");
           
           
               
           
            System.out.println("No. of Primes number  in between 0 and "+ 2000000 +": "+ p1.noOfPrimes() +".Calculation done in "+T1+" ms.");
            System.out.println("No. of Primes number  in between 2000001 and "+ 4000000 +": "+ p2.noOfPrimes() +".Calculation done in "+T2+" ms.");
            System.out.println("No. of Primes number  in between 4000001 and "+ 6000000 +": "+ p3.noOfPrimes() +".Calculation done in "+T3+" ms.");
            System.out.println("No. of Primes number  in between 6000001 and "+ 8000000 +": "+ p4.noOfPrimes() +".Calculation done in "+T4+" ms.");
            System.out.println("No. of Primes number  in between 8000001 and "+ 10000000 +": "+ p5.noOfPrimes() +".Calculation done in "+T5+" ms.");
            
            long sum = (T1+T2+T3+T4+T5);
            if(t>=sum)
            {
                System.out.println("the sum of the five times is "+sum);
                System.out.println("total time is greater then equal the sum of the single times needed for the five calculations ");
            }

                
            
            
            
           
    }
}

