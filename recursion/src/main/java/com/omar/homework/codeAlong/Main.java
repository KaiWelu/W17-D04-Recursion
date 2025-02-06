package com.omar.homework.codeAlong;

public class Main {

    public static String reverse(String s){
        char[] charArray =  s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static char[] reverseChar(char[] charArr){

        int left = 0;
        int right = charArr.length-1;

        while(left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return charArr;
    }

    public static int removeElements(int[] nums, int val){
        int writingPointer = 0;

        for(int readingPointer = 0; readingPointer < nums.length; readingPointer++){
            if(nums[readingPointer] != val){
                nums[writingPointer] = nums[readingPointer];
                writingPointer++;
            }

        }
        return writingPointer;
    }


    public static String reverseVowels(String s){

        String vowels = "aeiouAEIOU";
        char[] charArr = s.toCharArray();

        int left = 0;
        int right = charArr.length-1;

        while(left < right){
            System.out.println(left);

            while(left < right && vowels.indexOf(charArr[left]) == -1){
                System.out.println("Inner loop");
                left++;
            }
            while(left < right && vowels.indexOf(charArr[right])==-1){
                right--;
            }


            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;

            left++;
            right--;

        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        int[] test = {3, 2, 2, 3, 4, 5, 3};
//        System.out.println(removeElements(test,3));


        System.out.println(reverseVowels("IceCreAm"));


    }
}
