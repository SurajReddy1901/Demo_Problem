import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 0, num = 1; i < a; i++, num += 2) {
            System.out.print(num);
            if (i < a - 1) System.out.print(", ");
        }
    }
}
