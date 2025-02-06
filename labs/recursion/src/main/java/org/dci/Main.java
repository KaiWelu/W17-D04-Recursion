package org.dci;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
        System.out.println(isPalindrome("AnNa"));
        System.out.println(sumOfDigits(-55555111));
        int[] testArray = {1, 2, 3, 4, 5};
        printReverse(testArray, testArray.length - 1);
        System.out.println("Char count: " + countOccurrences("hello", 'l'));
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

    public static void printReverse(int[] arr, int index) {
        System.out.println(arr[index]);
        if(index > 0) printReverse(arr, index -1);
    }

    public static int countOccurrences(String s, char c) {
        if(s.isEmpty()) return 0;
        int count = 0;

        if(s.charAt(0) == c) {
            count = 1;
        }

        return count + countOccurrences(s.substring(1), c);
    }
}