package prez8;

import java.util.Scanner;

public class dz0 {
    public static void main(String[] args) {
        System.out.println("Введите поочередно через Enter первое число, второе и символ операции (+ - * / %):");
        calc(getInt(),getInt(),getOperation());
    }
    public static int getInt() {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        return num;
    }
    public static String getOperation() {
        Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        return s;
    }
    public static void calc(int num1, int num2, String operation) {
        switch (operation) {
            case "+": System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 += num2)); break;
            case "-": System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 -= num2)); break;
            case "*": System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 *= num2)); break;
            case "/": System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 /= num2)); break;
            case "%": System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 %= num2)); break;
        }
    }
}
