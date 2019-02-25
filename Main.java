package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
         }
        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%d" + " ", i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
