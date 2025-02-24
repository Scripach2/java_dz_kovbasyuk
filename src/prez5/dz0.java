package prez5;

import java.util.Scanner;

public class dz0 {
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
        int max = numArray[0];
        int min = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > max)
                max = numArray[i];
            if (numArray[i] < min)
                min = numArray[i];
        }
        System.out.println("Наименьшее число массива = " + min);
        System.out.println("Наибольшее число массива = " + max);
        System.out.println("Разница между ними = " + (max - min));
    }
}
