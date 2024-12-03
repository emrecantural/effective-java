package org.effective_java.example.item_16;

public class Item16Main {
  /**
   *  //Java Encapsulation
   */

  public static void main(String[] args) {

//    //public alan dedim
//    Futbol gs = new Futbol("Galatasaray",35);
//
//    gs.takimAdi ="Htayaspor"; //bu alanların doğrudan erişimi var
    /**
     * Birinci öncelik - Doğrudan erişilebilirliği kes
     */

    //private yapalım
    //gs. dediğimizde erişim sağlayamıyoruz 1. öncelik tanımlandı

    //İkinci setOyuncuSayisi -35 yapabilir
    /**
     * Bu açık görünebilir ama kontrolümüzdeki metotlara kontrol ekleyerek engelleyebiliriz.
     */

    //Üçüncü
    //Setleri silersem sadece okuyabilirim -ReadOnly

    //4. öncelik
    /**
     * writeOnly -> getlerini sil
     */

    //5. Data Hiding
    /**
     * Veriyi kontrollü tutma
     *
     */

    Time t = new Time(10,11);
    //t.hour =130; //Değiştirilemez veri güvenliği
    //ÇOK ÖNERİLMEZ AMA VAR


  }
}
