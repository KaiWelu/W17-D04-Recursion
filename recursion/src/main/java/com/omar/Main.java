package com.omar;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {

//        base case
        System.out.println(factorial(5));





        System.out.println(fibNonRecursive(5));


//        recursive case
    }

    public static int factorial(int number){

//        base case
            if(number == 0 || number == 1){
                return 1;
            }

//        recursive case
        return number * factorial(number-1);
        /*
        120
           5 * 24
               4 * 6
                   3 * 2
                        2 * 1
                            1
        */
    }

    public static int fib(int n){




//        base case
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

//        memoization
        if(map.containsKey(n)){
            return map.get(n);
        }

        int result =fib(n-1) + fib(n-2);
        map.put(n,result);

//        recursive case
        return result;

    }

    public static int fibNonRecursive(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int a = 0;
        int b = 1;
        int sum =0;

        for(int i =2; i<n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }





}