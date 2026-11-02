package Recursion;

import java.util.Scanner;

public class sumOfDigigt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re=sumofDigit(n,0);
        System.out.println(re);
    }
    public static int sumofDigit(int n, int r){
        if(n==0){
            return r;
        }
        r= r+ n%10;
        n=n/10;
        return sumofDigit(n, r);
    }
}
