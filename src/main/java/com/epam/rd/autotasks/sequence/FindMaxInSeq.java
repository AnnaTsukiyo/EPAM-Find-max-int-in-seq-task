package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        int counter = 0, input = 0, large = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) != 0) {
            large = Integer.max(large, input);
            counter++;
        }
        if (counter == 0) {
            System.out.println("No data was entered.");
        }
        return large;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
