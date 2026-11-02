package Recursion;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverse(n, 0);
        sc.close();
    }

    public static void reverse(int n, int r) {
        int d = n % 10;
        r = r * 10 + d;
        n = n / 10;

        if (n == 0) {
            System.out.println(r);
            return;
        }

        reverse(n, r);
    }


}
