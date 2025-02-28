package prez13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class dz0 {

    public static void main(String[] args) {
        File f = new File("D:\\Games");
        makeDirectory(f);
        f = new File("D:\\Games\\src");
        makeDirectory(f);
        f = new File("D:\\Games\\res");
        makeDirectory(f);
        f = new File("D:\\Games\\savegames");
        makeDirectory(f);
        f = new File("D:\\Games\\temp");
        makeDirectory(f);
        f = new File("D:\\Games\\src\\main");
        makeDirectory(f);
        f = new File("D:\\Games\\src\\test");
        makeDirectory(f);
        f = new File("D:\\Games\\src\\main\\Main.txt");
        makeFile(f);
        writeFile(f, "Its file Main.txt");
        f = new File("D:\\Games\\src\\main\\Utilis.txt");
        makeFile(f);
        writeFile(f, "Its file Utils.txt");
    }

    public static void makeDirectory(File dir) {
        if (dir.mkdir()) {
            System.out.println("Создана директория");
        } else {
            System.out.println("Нельзя создать директорию");
        }
    }

    public static void makeFile(File file) {
        if (file.mkdir()) {
            System.out.println("Создан файл");
        } else {
            System.out.println("Файл нельзя создать");
        }
    }

    public static void writeFile(File file, String content) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Файл записан");
        } catch (IOException e) {
            System.out.println("Нельзя записать файл");
        }
    }
}
