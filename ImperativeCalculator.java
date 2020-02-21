import java.util.Scanner;
public class ImperativeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float c=0;
        System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Modulo\nEnter a number: ");
        int cal=sc.nextInt();
        if(cal==1){
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            c=a+b;
        }else if(cal==2){
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            c=a-b;
        }else if(cal==3){
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            c=a/b;
        }else if(cal==4){
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            c=a*b;
        }else if(cal==5){
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            c=a%b;
        }else{
            System.out.println("Error");
        }
        System.out.println("Result: "+(int)c);
    }
    
}