package prez5;

public class dz1 {
    public static void main(String[] args) {
    int a = 10;
    int b = 10;
    int[][] table = new int[a][b];
    for (int i = 0; i < a; i++)
        for (int j = 0; j < b; j++) {
            table [i][j] = (i+1) * (j+1);
        }
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            System.out.print(table[i][j] + " ");
        }
        System.out.println("\n");
        }
    }
}
