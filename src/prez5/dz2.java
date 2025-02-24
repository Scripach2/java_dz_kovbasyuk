package prez5;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        System.out.println("Введите массив:");
        Scanner myObj = new Scanner(System.in);
        int num;
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("x[" + i + "] = ");
            num = myObj.nextInt();
            numArray[i] = num;
        }
        String s = "";
        for (int i = 0; i < numArray.length; i++) {
            if (numArray [i] % 2 == 0)
                System.out.print(numArray[i] + " ");
            else
                s += numArray[i] + " ";
        }
        System.out.print("\n" + s);
    }
}
