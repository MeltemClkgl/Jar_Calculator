package com.company;

import java.util.InputMismatchException;

import static com.company.Calculator.CalculateRun.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
            // write your code here
        while(OrtakVariabllar.islemeDevamEt){

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
                           "\t0- Exit: ");
                   int math = OrtakVariabllar.keyboard.nextInt();
                   switch(math) {
                       case 1:
                           ReUsableMethods.kullanicidanIkiSayiAlma("ADDITION");
                           add(OrtakVariabllar.a, OrtakVariabllar.b);
                           break;
                       case 2:
                           ReUsableMethods.kullanicidanIkiSayiAlma("SUBTRACTION");
                           subtract(OrtakVariabllar.a, OrtakVariabllar.b);
                           break;
                       case 3:
                           ReUsableMethods.kullanicidanIkiSayiAlma("MULTIPLY");
                           multiply(OrtakVariabllar.a, OrtakVariabllar.b);
                           break;
                       case 4:
                           ReUsableMethods.kullanicidanIkiSayiAlma("DIVIDE");
                           divide(OrtakVariabllar.a, OrtakVariabllar.b);
                           break;
                       case 5:
                           ReUsableMethods.kullanicidanIkiSayiAlma("POWER");
                           power(OrtakVariabllar.a, OrtakVariabllar.b);
                           break;

                       case 6:
                           sin(ReUsableMethods.kullanicidanBirSayiAlma("Enter the angle that you want to calculate the sin(x) for: "));break;
                       case 7:
                           cos(ReUsableMethods.kullanicidanBirSayiAlma("Enter the angle that you want to calculate the cos(x) for: "));break;

                       case 8:
                           tan(ReUsableMethods.kullanicidanBirSayiAlma("Enter the angle that you want to calculate the tan(x) for: "));break;

                       case 9:
                           sqrt( ReUsableMethods.kullanicidanBirSayiAlma("Enter the angle that you want to calculate the sqrt(x) for: ")); break;

                       case 10:
                           ReUsableMethods.kullanicidanIkiSayiAlma("mod islemi");
                           mod(OrtakVariabllar.a , OrtakVariabllar.b );
                           break;

                       case 0:
                           System.exit(0);

                       default:
                           System.out.println("The function you have entered has been misspelled or has not yet been implemented!");
                           ReUsableMethods.tamamMi_DevamMi();

                   }
           } catch(InputMismatchException e){
               System.out.println("That is not a number. Try again.");
               ReUsableMethods.tamamMi_DevamMi();
           }
        }
    }


}
