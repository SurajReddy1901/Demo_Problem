import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = 0, num = 1;
        while (count < a) {
            if (a % 2 == 0 && count == a - 1) break;
            System.out.print(num);
            if (count < a - 2) System.out.print(", ");
            num += 2;
            count++;
        }
    }
}
