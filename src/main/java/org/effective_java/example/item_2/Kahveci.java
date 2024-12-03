package org.effective_java.example.item_2;

public class Kahveci {

  //Gerekli
  private String kahveBoyutu;

  //İsteğe bağlı
  private String sekerMiktari;
  private String sutMiktari;



  //ÇÖZÜM 2 BOŞ BİR CONSTRUCTOR OLUŞTUR. GEREKLİ OLANLARI DA GETTER SETTER İLE EKLE

  public Kahveci() {
  }

  public void setKahveBoyutu(String kahveBoyutu) {
    this.kahveBoyutu = kahveBoyutu;
  }

  public void setSekerMiktari(String sekerMiktari) {
    this.sekerMiktari = sekerMiktari;
  }

  public void setSutMiktari(String sutMiktari) {
    this.sutMiktari = sutMiktari;
  }
  //ÇÖZÜM 1 TELESCOPE PATTERN

//  public Kahveci(String kahveBoyutu) { //Sadece kahve boyutu ile alabilir
//    this.kahveBoyutu = kahveBoyutu;
//  }
//
//  public Kahveci(String kahveBoyutu, String sekerMiktari) { //Kahve boyutu ve şekerle alabilir
//    this.kahveBoyutu = kahveBoyutu;
//    this.sekerMiktari = sekerMiktari;
//  }
//
//  public Kahveci(String kahveBoyutu, String sekerMiktari, String sutMiktari) { //3 tanesiyle de alabilir
//    this.kahveBoyutu = kahveBoyutu;
//    this.sekerMiktari = sekerMiktari;
//    this.sutMiktari = sutMiktari;
//  }
}
