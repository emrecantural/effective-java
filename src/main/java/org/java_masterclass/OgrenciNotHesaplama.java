package org.java_masterclass;

import java.util.Scanner;

public class OgrenciNotHesaplama {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Vize notunuzu giriniz:");
    int vizeNotu = scanner.nextInt();

    System.out.println("Final notunuzu giriniz:");
    int finalNotu = scanner.nextInt();

    System.out.println("Notunuz: "+ (vizeNotu*0.4 + finalNotu*0.6));
  }
}
