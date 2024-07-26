package org.example.item_2;

public class KahveciBuilder {

  //Gerekli
  private String kahveBoyutu;

  //İsteğe bağlı
  private String sekerMiktari;
  private String sutMiktari;



  //SINIFIN İÇİNDE BİR TANE STATİC SINIF OLUŞTUR

  public static class Builder {

    private final String kahveBoyutu; //Çünkü gerekli parametre

    private String sekerMiktari;
    private String sutMiktari;

    public Builder(String kahveBoyutu) { //Muhakkak olmalı
      this.kahveBoyutu = kahveBoyutu;
    }


    public Builder sekersiz(String sekerMiktari) {
      this.sekerMiktari = sekerMiktari;
      return this; //Builder dönsün yani
    }

    public Builder sutsuz(String sutMiktari) {
      this.sutMiktari = sutMiktari;
      return this; //Builder dönsün yani
    }

    //Classın tipinden unutma
    public  KahveciBuilder build() {
      return new KahveciBuilder(this);
    }
  }


  public KahveciBuilder(Builder builder) {
  kahveBoyutu = builder.kahveBoyutu;
  sekerMiktari = builder.sekerMiktari;
  sutMiktari = builder.sutMiktari;
  }
}
