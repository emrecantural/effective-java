package org.effective_java.example.item_43;

import java.time.Instant;

public class Item43Main {
  /**
   * //44. Method Reference Java 8 & Lambda (Kısa ve Okunabilirlik)
   * @param args
   */



  public static void main(String[] args) {

    // Lambda Kısa Öz

    FunctionalString fs = Instant.now()::toString;

    System.out.println(fs.yazdır());





  }
}
