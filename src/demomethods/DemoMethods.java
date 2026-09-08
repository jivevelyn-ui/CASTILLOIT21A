/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demomethods;

import java.util.Scanner;

public class DemoMethods {

    static void message(String name, int age) {
        System.out.println("Hello guys, this is " + name + " I am " + age + " years old.");
    }

    static int calculateAge(int currentYear, int birthYear) {
        return currentYear - birthYear;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        message(name, age);

        int realAge = calculateAge(2026, birthYear);
        System.out.println("My real age is: " + realAge);

        if (age == realAge) {
            System.out.println("Honest");
        } else {
            System.out.println("Liar");
        }

        String[] children = {"chen", "march", "hudson", "carl", "ryan"};

        System.out.println("Children of " + name + ": ");

        for (String child : children) {
            System.out.println(child);
        }

        sc.close();
    }
}