package com.bridgelabz;

import java.util.Scanner;

public class StackOperations {

    public static void main(String[] args) {

        System.out.println("Welcome To Stack Operation Programs");
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while (choice != 3) {
            System.out.println("\nChose one from the below options...");
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.println("\n Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    s.push(sc);//70,30,56
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
                case 4: {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
}
