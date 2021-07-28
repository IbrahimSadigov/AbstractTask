package Calculator;

import java.util.Scanner;

abstract class CaculatorAbstract {

    public abstract int sum(int a, int b);
    public abstract int subtrack(int a, int b);
    public abstract int multiply(int a, int b);
    public abstract int divide(int a, int b);
    public abstract int power (int a, int b);


}


class Operations extends CaculatorAbstract {

    @Override
    public int sum(int a, int b) {

        int sum = a + b;

        System.out.println("The sum of the numbers is " + sum);

        return 0;
    }

    @Override
    public int subtrack(int a, int b) {

        int subt = a - b;

        System.out.println("The answer is " + subt);

        return 0;
    }

    @Override
    public int multiply(int a, int b) {

        int m = a * b;

        System.out.println("The answer is " + m);

        return 0;
    }

    @Override
    public int divide(int a, int b) {

        int d = a / b;

        System.out.println("The answer is " + d);

        return 0;
    }

    @Override
    public int power(int a, int b) {

        int p = (int) Math.pow(a, b);

        System.out.println("The answer is " + p);

        return 0;
    }

}

class MainCalc{

    public static void main(String[] args) {

        System.out.print("Enter the 2 numbers: ");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = scan.nextInt();

        CaculatorAbstract calculator = new Operations();

        System.out.println("What do you want to do? \n +  (Adding)\n -  (Subtracking)\n *  (Multiplying)\n /  (Dividing)\n ^  (power (a^b)");

        String s = scan.next();

        switch (s) {
            case "+":
                calculator.sum(a, b);
                break;

            case "-":
                calculator.subtrack(a, b);
                break;

            case "*":
                calculator.multiply(a, b);
                break;

            case "/":
                calculator.divide(a, b);
                break;

            case "^":
                calculator.power(a,b);
                break;

            default:
                System.out.println("Choose one of the above!");
        }
    }

}
