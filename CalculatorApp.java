package JavaProgramsDay1;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(;;) //infinte for loop!
        {
        System.out.println("Press-1 for Addition");
        System.out.println("Press-2 for Subtraction");
        System.out.println("Press-3 for Multiplication");
        System.out.println("Press-4 for Division");
        System.out.println("other Number------>Exit");
        int input=scan.nextInt();
        System.out.println(input);
        int a=0;
        int b=0;
        int c=0;
        
        switch(input) //switch statement for calculator!
        {
        case 1:
        //Addition
        System.out.println("Enter 2 Numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        c =a+b;
        System.out.println(c);
            break;
        
        case 2:
        //Subtraction
            System.out.println("Enter 2 Numbers");
            a=scan.nextInt();
            b=scan.nextInt();
            c =a-b;
            System.out.println(c);
            break;
        
        case 3:
        //Multiplcation
            System.out.println("Enter 2 Numbers");
            a=scan.nextInt();
            b=scan.nextInt();
            c =a*b;
            System.out.println(c);
            break;
        
        case 4:
        //Divide
            System.out.println("Enter 2 Numbers");
            a=scan.nextInt();
            b=scan.nextInt();
            c =a/b;
            System.out.println(c);
            break;
            
        default:
            return;
        }
        }
    }
    }