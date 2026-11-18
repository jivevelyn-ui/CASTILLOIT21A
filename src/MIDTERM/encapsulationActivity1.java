package MIDTERM;

import java.util.Scanner;

public class encapsulationActivity1 {

    private int x;
    
    public int getNum(){
        return x;
    }
    public void setNum(int num){
    this.x = num;
    }
   

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    encapsulationActivity1 obj = new encapsulationActivity1();
    //    obj.setNum(80);
        
        System.out.println("Number is : " + obj.x);
    }
}


