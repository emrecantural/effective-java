package org.java_masterclass;

import java.util.Scanner;

public class PalindromKontrolu {
  public static void main(String[] args) {
    //KAYAK


    Scanner scanner = new Scanner(System.in);
    System.out.println("Kelimeyi giriniz:");
    String kelime = scanner.nextLine().trim();

    String tersKelime = new StringBuilder(kelime).reverse().toString();

    System.out.println("Ters kelime: " + tersKelime);

    if (kelime.equals(tersKelime)){
      System.out.println("Kelime palindromdur.");
    } else {
      System.out.println("Kelime palindrom değildir.");

    }

  }
}
