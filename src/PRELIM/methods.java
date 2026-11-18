package PRELIM;
import java.util.Scanner;

public class methods {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
int [] numbers = {12, 5, 35, 3, 4};

int highest = numbers[0];
int lowest = numbers[0];

for(int number: numbers){
if(number > highest){
highest = number;

}
if (number < lowest){
lowest = number;
}
}
        System.out.println("Highes Value: " + highest);
        System.out.println("Lowest Value: " + lowest);
    }
}