package replit;

import java.util.Scanner;

public class MassIndex {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Your weight: ");
        int weight= input.nextInt();

        System.out.println("Your height: ");
        double height= input.nextDouble();

        double bMI=weight/(height*height);
        System.out.println("Your BMI is: " + bMI);

        if (bMI>0){
            if (bMI<18.5){
                System.out.println("you are weak");
            }
            else if (bMI<25) {
                System.out.println("your weight is ideal");
            }
            else if (bMI<30) {
                System.out.println("you are fat");
            }
            else {
                System.out.println("You are obese");
            }
        }

    }
}
