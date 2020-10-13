package Recruitment;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int masuk = in.nextInt();
        int ke = fib(masuk);
        System.out.println(ke);
    }

    static int fib(int mas) {
        if (mas == 1 || mas == 2) {
            return 1;
        } else if (mas == 0) {
            return 0;
        } else {
            return (fib(mas - 1)+fib(mas-2));
        }
    }
}
