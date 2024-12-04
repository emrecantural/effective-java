package org.java_masterclass;

import java.util.Random;
import java.util.Scanner;

public class TaşKagitMakas {

  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    String [] secenekler = {"Taş","Kağıt", "Makas"};

    String kullaniciSecimi = scanner.nextLine();

    int bilgisayarSecimIndex = random.nextInt(3); //0,1,2

    String bilgisayarSecimi = secenekler[bilgisayarSecimIndex];

    System.out.println("Kullanıcı:"+kullaniciSecimi);
    System.out.println("BilgisayarSecimi:"+bilgisayarSecimi);

  }
}
