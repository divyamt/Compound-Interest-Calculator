import java.util.Scanner;
import java.lang.Math;

class Calc
{
    public void compound()
    
    {
        double i;
        double a;
        double in;
    
        Scanner obj = new Scanner(System.in);
    
        System.out.println("Enter PRINCIPAL");
        double p = obj.nextDouble();
    
        System.out.println("Enter RATE of interest");
        double r = obj.nextDouble();
    
        System.out.println("Enter TIME");
        double t = obj.nextDouble();
    
        i = (1 - r/100);
        a = p / Math.pow(i,t);
        in = a - p;
        
        System.out.println("Amount is " + a + " and Interest is " + in);
    }
    
}

public class Main 
{
    public static void main(String[]args)
    {
        Calc obj1 = new Calc();
        obj1.compound();
    }
}
