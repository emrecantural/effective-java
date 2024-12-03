package org.effective_java.example.item_18;

public class Kitap {

  /**
   * Tam bir encapsulation örneği
   */
  private String kitapAdi;

  public Kitap(String kitapAdi) {
    this.kitapAdi = kitapAdi;
  }

  public String getKitapAdi() {
    return kitapAdi;
  }
}
