package org.effective_java.example.item_1;

public class Galatasaray {
  private String futbolcuAdi;
  private int yas;

  public Galatasaray(String futbolcuAdi, int yas) {
    this.futbolcuAdi = futbolcuAdi;
    this.yas = yas;
  }

  public Galatasaray (String yeniTeknikDirektor){ //Override yaptık
    this.futbolcuAdi = futbolcuAdi;

  }


  public static Galatasaray yeniFutbolcu(String futbolcuAdi){
    return new  Galatasaray(futbolcuAdi, 21);
  }



}
