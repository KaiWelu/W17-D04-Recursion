package org.dci;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
        System.out.println(isPalindrome("AnNa"));
        System.out.println(sumOfDigits(-55555111));
    }

    public static int countDigits(int n) {
        n = Math.abs(n);

        if(n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);

    }

    public static boolean isPalindrome(String s) {
        s =  s.toLowerCase();

        if(s.length() <= 1) {
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length()- 1));
    }

    public static int sumOfDigits(int n) {
//        convert negative numbers
        n = Math.abs(n);

        if(n == 0) return 0;

        return n % 10 + sumOfDigits(n / 10);
    }
}