package org.example.HW4;

import java.util.Scanner;

public class HW4 {public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter first number");
    int number=scanner.nextInt();
    double number2;
    double result = 0;
    char symbol;
    float per;
    System.out.println("enter second number");
    number2=scanner.nextDouble();
    System.out.println("enter symbol of operation");
    symbol=scanner.next().charAt(0);
    switch (symbol){
        case '+': result=Calc.sum(number,number2);
            break;
        case '-': result=Calc.min(number,number2);
            break;
        case '*': result=Calc.multip(number,number2);
            break;
        case '/': result=Calc.div(number,number2);
            break;
        case '%': result=Calc.per(number,number2);
            break;

        default:
            System.out.println("Error");
            System.exit(0);
            break;
    }
    System.out.println(result);
}
}


