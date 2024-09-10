package sample1;
import java.util.Scanner;

public class Sample1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c;
        double f;
        System.out.println("Please enter the tempature in farenheit ==> ");
        f=sc.nextDouble();
        c=(f-32)*5/9;
        System.out.println("The tempature in celcius is ==> "+c);
        
    }
        public static double FtoC(double f)
        {
         double c;
         c=(f-32)*5/9;
         return c;
         
        }  
    
}
