package sample910;
import java.util.Scanner;


public class Sample910 {


    public static void main(String[] args) {
        int a,b,c,d,e;
        int highest, lowest;
        Scanner gust=new Scanner(System.in);
        System.out.println("Sorting App");
        System.out.println("===========");
        System.out.print("Enter a posititve integer for a ===>");
        a=gust.nextInt();
        System.out.print("Enter a posititve integer for b ===>");
        b=gust.nextInt();
        System.out.print("Enter a posititve integer for c ===>");
        c=gust.nextInt();
        System.out.print("Enter a posititve integer for d ===>");
        d=gust.nextInt();
        System.out.print("Enter a posititve integer for e ===>");
        e=gust.nextInt();
        highest=0;
        lowest=a;
        System.out.println("The highest is =====>"+ highest);
        
        System.out.println("The lowest is =====>"+ lowest);
    }
    
}
