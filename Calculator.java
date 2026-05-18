import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double Firstval = sc.nextDouble();
        
        System.out.println("Enter Second Number : ");
        double Secondval = sc.nextDouble();
        
        System.out.println("Enter Operator : ");
        char operator = sc.next().charAt( 0);

        switch (operator) {
            case '+': System.out.println("Result is " + (Firstval + Secondval));
            break;

            case '-': System.out.println("Result is " + (Firstval - Secondval));
            break;

            case '*':System.out.println("Result is " + (Firstval * Secondval));
            break;

            case '/': if(Secondval == 0){
                System.out.println("invald Division");
            }else {
                System.out.println("Result is " + (Firstval / Secondval));
            }
            break;
            default: System.out.println("Please Enter Valid Operator");
            break;
        }

    }
}
