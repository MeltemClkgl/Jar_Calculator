package com.company;


import static com.company.OrtakVariabllar.keyboard;
import static com.company.OrtakVariabllar.islemeDevamEt;
import static com.company.OrtakVariabllar.a;
import static com.company.OrtakVariabllar.b;


public class ReUsableMethods {


    public static void tamamMi_DevamMi() {
        System.out.println("Devam etmek icin (y) ye, cikis icin herhangi bir butona tiklayin :");
        keyboard.nextLine();
        String cevap = keyboard.next();
        if(cevap.equalsIgnoreCase("Y")){
            islemeDevamEt=true;
        }else {
            islemeDevamEt=false;
            System.out.println("Sistemden cikis yapildi.");
        }
    }

    public static int kullanicidanBirSayiAlma(String mesaj) {

        System.out.print(mesaj);
        int sayi = keyboard.nextInt();
        return sayi;
    }

    public static void kullanicidanIkiSayiAlma(String mesaj) {
        System.out.println(mesaj);
        System.out.println("Please enter your first number : ");
        a = keyboard.nextInt();
        System.out.println("Please enter your second number : ");
        b = keyboard.nextInt();


    }

}
