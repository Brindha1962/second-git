import java.util.*;
public class Calculator{

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Simple Calculator");

        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();

        System.out.println("Addition:1, Subtraction:2, Multiplication:3, Division:4");

        int operation = sc.nextInt();

        switch(operation){

            case 1:
            System.out.println("Addition of "+num1+ " and "+num2+ "="+(num1+num2));
            break;

            case 2:
            System.out.println("Subtraction of "+num1+" and "+num2+"= "+(num1-num2));
            break;

            case 3:
            System.out.println("Multiplication of "+num1+" and "+num2+"= "+(num1*num2));
            break;

            case 4:
            System.out.println("Division of "+num1+ " and "+num2+"= "+(num1/num2));
            break;

            default :{
                System.out.println("Invalid");
                break;
            }
        }
    }
}
