import java.util.Stack;

import java.util.Scanner;

public class reverseNum {

    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number to be reversed : ");

        int num = sc.nextInt();
        int rev_num = 0, digit = 0, power = 0;

        while (num != 0) {
            digit = num % 10;
            stk.push(digit);
            num = num / 10;
        }

        System.out.println("Elements in Stack: " + stk);

        while (!stk.isEmpty()) {
            digit = stk.pop();
            rev_num = rev_num + digit * (int) Math.pow(10, power);
            power = power + 1;
        }

        System.out.println("The reversed number is : " + rev_num);

    }

}