package org.example.item_18;

import java.util.List;

public class Kütüphane {

  /**
   * Kitap bir kütüphane olmadığı için extend Kitap demek doğru değil
   */
  private final List<Kitap> kitaplar;

  public Kütüphane(List<Kitap> kitaplar) {
    this.kitaplar = kitaplar;
  }

  public List<Kitap> kütüphanedekiTumKitaplar(){
    return kitaplar;
  }
}
