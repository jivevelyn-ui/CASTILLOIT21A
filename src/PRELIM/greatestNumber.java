package PRELIM;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the 3rd number: ");
        int num3 = input.nextInt();

        // find the greatest num of the three
        int greatestNum = num1;

        if (num2 > greatestNum) {
            greatestNum = num2;
        }
        if (num3 > greatestNum) {
            greatestNum = num3;
        }

        System.out.println("The Greatest Number is: " + greatestNum);
        
        input.close();
    }
}