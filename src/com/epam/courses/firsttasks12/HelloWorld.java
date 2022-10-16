package com.epam.courses.firsttasks12;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Palindrome {
    public static void main(String[] args) {

        int x = 3553, reversedX = 0, rest;

        int originalX = x;

        while (x != 0) {
            rest = x % 10;
            reversedX = reversedX * 10 + rest;
            x /= 10;
        }

        if (originalX == reversedX) {
            System.out.println(originalX + " is Palindrome.");
        }
        else {
            System.out.println(originalX + " is not Palindrome.");
        }
    }
}

class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {1,2,4,5,6};
        int target = 5;

        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}


class LastWord {
    public int lengthOfLastWord(final String a) {
        int len = 0;

        String x = a.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    public static void main(String[] args) {
        String input = "My name is Sofiia  ";
        LastWord length = new LastWord();
        System.out.println("The length of last word is " + length.lengthOfLastWord(input));
    }
}

class SQRT {
    public static int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(SQRT.mySqrt(16));
    }
}

class FibonacciRow {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < N) {

            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String args[]) {
        int N = 15;

        Fibonacci(N);
    }
}

class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1 ; i <= 50 ; i++){
            if(i % 15 == 0){
                System.out.println("fizz-buzz");
                continue;
            }
            if(i % 3 == 0) {
                System.out.println("fizz");
                continue;
            }
            if(i % 5 == 0){
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
