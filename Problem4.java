import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    map.put(i, map.get(i) + 1);
                }
            }
        }

        System.out.println("Multiples count:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + map.get(i));
        }
    }
}
