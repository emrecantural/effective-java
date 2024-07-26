package org.example.item_5;

public class YazilimAnaliziSingleton {

  /**
   * private construıctor 1. öncelik
   */

  private YazilimAnaliziSingleton() {
  }

  //tek bir instance olacak ve onun içinden çalışacak

  public static YazilimAnaliziSingleton INSTANCE = new YazilimAnaliziSingleton();
  private final static Sozluk turkce = new Sozluk("Türkçe");


  public static boolean isValid() {
    return true;
  }
}
