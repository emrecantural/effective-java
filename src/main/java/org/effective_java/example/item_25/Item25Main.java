package org.effective_java.example.item_25;

public class Item25Main {
  /**
   * 25. Limit source files - 2 Sınıfı tek bir dosyada tanımlamayın
   *
   * Birden fazla sınıf ve arayüz tanımlarını tek bir dosya içerisinde yapmayın
   *
   *
   * Başka yerde de tanımlanmış olabilir hata verir. İlla böyle bir şey yapacaksan da private statik olarak tanımla diyor
   */

  public static void main(String[] args)
  {
    System.out.println(Utensil.NAME + Dessert.NAME);

    Test t = new Test();
    t.yazdir();

  }
}
