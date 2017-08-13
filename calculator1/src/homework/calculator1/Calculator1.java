package homework.calculator1;

import java.util.Scanner;


public class Calculator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double buffer, number;
        String oper, numberStr;

        System.out.print("Enter number: ");
        numberStr = sc.next();

        if (numberStr.equals("pi")) {
            buffer = Math.PI;
        } else if (numberStr.equals("e")) {
            buffer = Math.E;
        } else {
            buffer = Double.parseDouble(numberStr);
        }

        while (true) {

            System.out.print("Enter operation: ");
            oper = sc.next();


            if (oper.equals("=")) {
                System.out.println("\nResult: " + buffer);
                break;
            }

            if (oper.equals("sin")) {
                System.out.print("Result: " + Math.sin(buffer));
                break;
            }

            if (oper.equals("cos")) {
                System.out.print("Result: " + Math.cos(buffer));
                break;
            }

            if (oper.equals("tan")) {
                System.out.print("Result: " + Math.tan(buffer));
                break;
            }

            if (oper.equals("atan")) {
                System.out.print("Result: " + Math.atan(buffer));
                break;
            }

            if (oper.equals("log2")) {
                System.out.print("Result: " + (Math.log(buffer) / Math.log(2)));
                break;
            }


            System.out.print("Enter number: ");
            numberStr = sc.next();
            if (numberStr.equals("pi")) {
                number = Math.PI;
            } else if (numberStr.equals("e")) {
                number = Math.E;
            } else {
                number = Double.parseDouble(numberStr);
            }


            if (oper.equals("+")) {
                buffer = buffer + number;
            }

            if (oper.equals("-")) {
                buffer = buffer - number;
            }

            if (oper.equals("*")) {
                buffer = buffer * number;
            }

            if (oper.equals("/")) {
                if (number == 0) {
                    System.out.println("\nDivision by zero!");
                    break;
                } else buffer = buffer / number;
            }


        }


    }


}
