package org.example.item_22;

public class Item22Main {
  /**
   * 22. Doğru Interface Kullanımı Nasıl Olmalı?
   */

  public static void main(String[] args) {

//    DenemeSinif ds = new DenemeSinif();
//    ds.AVOGADROS_NUMBER; dediğimizde tüm değerlere ulaşabiliyoruz.
    //AMA encapsülationa ters bir sınıfın diğeriyle işi yoksa bağlanmasın
    //Güvenlik açığığı kullanıma ters
    //ANTIPATTERN

    //Bunun yerine utilty class olabilir PhysicalConstant örneğindeki gibi
    /*

  DOğru kullanım bir sınıfın neler yapabileceği
     */
    //İleride sadece uçma yetisi olanları istiyorum diye bir istek geldi

    UcmaYetisi uy = new Kus(); //Kullananlar bulunabilir
    //Ama cik görülmedi çünkü bu kontratla çağrıldı



    Kus ks = new Kus();
    ks.cikSesi();;

  }
}
