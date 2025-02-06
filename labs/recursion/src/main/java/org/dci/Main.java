package org.dci;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
    }

    public static int countDigits(int n) {
        n = Math.abs(n);

        if(n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);

    }
}