package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Calculator.CalculateRun.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
         Scanner keyboard = new Scanner(System.in);
        int a, b;
            // write your code here
        while(true){
           try{
                   System.out.print("\nPlease select from the following \n" +
                           "\t1- Add \n" +
                           "\t2- Subtract \n" +
                           "\t3- Multiply \n" +
                           "\t4- Divide \n" +
                           "\t5- Exponential Function \n" +
                           "\t6- Sin \n" +
                           "\t7- Cos \n" +
                           "\t8- Tan \n" +
                           "\t9- sqrt \n" +
                           "\t10- mod \n" +
                           "\t0- Exit");
                   int math = keyboard.nextInt();
                   switch(math) {
                       case 1:
                           System.out.println(" Add");
                           System.out.println("Please enter your first number : ");
                           a = keyboard.nextInt();
                           System.out.println("Please enter your second number : ");
                           b = keyboard.nextInt();
                           add(a, b);
                           break;

                       case 2:
                           System.out.println(" Subtract");
                           System.out.println("Please enter your first number : ");
                           a = keyboard.nextInt();
                           System.out.println("Please enter your second number : ");
                           b = keyboard.nextInt();
                           subtract(a, b);
                           break;


                       case 3:
                           System.out.println(" Multiply");
                           System.out.print("Please enter your first number : ");
                           a = keyboard.nextInt();
                           System.out.print("Please enter your second number : ");
                           b = keyboard.nextInt();
                           multiply(a, b);
                           break;


                       case 4:
                           System.out.println(" Divide");
                           System.out.print("Please enter your first number : ");
                           a = keyboard.nextInt();
                           System.out.print("Please enter your second number : ");
                           b = keyboard.nextInt();
                           divide(a, b);
                           break;


                       case 5:
                           System.out.println(" Exponential Function");
                           System.out.print("Please enter your first number : ");
                           a = keyboard.nextInt();
                           System.out.print("Please enter your second number : ");
                           b = keyboard.nextInt();
                           power(a, b);
                           break;


                       case 6:
                           System.out.print("Enter the angle that you want to calculate the sin(x) for: ");
                           int sinChoice = keyboard.nextInt();
                           sin(sinChoice);
                           break;


                       case 7:
                           System.out.print("Enter the angle that you want to calculate the cos(x) for: ");
                           int cosChoice = keyboard.nextInt();
                           cos(cosChoice);
                           break;



                       case 8:
                           System.out.print("Enter the angle that you want to calculate the cos(x) for: ");
                           int tanChoice = keyboard.nextInt();
                           tan(tanChoice);
                           break;



                       case 9:
                           System.out.print("Enter the number that you want to take the square root for: ");
                           int sqrtChoice = keyboard.nextInt();
                           sqrt(sqrtChoice);
                           break;



                       case 10:
                           System.out.print("Enter the number a for the operation a%b: ");
                           int a_mod = keyboard.nextInt();
                           System.out.print("Enter the number b for the operation a%b: ");
                           int b_mod = keyboard.nextInt();
                           mod(a_mod, b_mod);
                           break;



                       case 0:
                           System.exit(0);

                       default:
                           System.out.println("The function you have entered has been misspelled or has not yet been implemented!");
                   }
           } catch(InputMismatchException e){
               System.out.println("That is not a number. Try again.");
               a = 15;
               b = 15;
               break;
           }
        }
    }
}
