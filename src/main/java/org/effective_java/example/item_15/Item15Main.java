package org.effective_java.example.item_15;

public class Item15Main {
//Java Access Modifiers Nedir? - Public, Private, Protected, Final, Static


  //Single Respobsibility (SOLID) e dayanır.
  /**
   * SOLID prensibi, yazılım geliştirmede nesne yönelimli tasarımı iyileştirmek için kullanılan beş temel ilkeyi ifade eder
   * . Bu prensipler, daha esnek, okunabilir ve sürdürülebilir kod yazımına yardımcı olur. SOLID, aşağıdaki beş prensibin baş harflerinden oluşur:
   *
   * S - Single Responsibility Principle (SRP): Bir sınıfın yalnızca bir sorumluluğu olmalıdır. Bu, bir sınıfın yalnızca bir
   * işlevi yerine getirmesi gerektiği anlamına gelir. Böylece, değişiklik yapıldığında yalnızca o sınıf etkilenir.
   *
   * O - Open/Closed Principle (OCP): Yazılım varlıkları (sınıflar, modüller, fonksiyonlar vb.) genişlemeye açık, ancak
   * değiştirmeye kapalı olmalıdır. Yani, mevcut kodu değiştirmek yerine, yeni işlevsellik eklemek için yeni kod eklenmelidir.
   *
   * L - Liskov Substitution Principle (LSP): Türetilmiş sınıflar, temel sınıfların yerine geçebilmelidir. Yani, bir sınıfın
   * bir alt sınıfı, temel sınıfın yerine kullanılabilmelidir. Bu, alt sınıfların temel sınıfın özelliklerini ve davranışlarını
   * koruması gerektiği anlamına gelir.
   *
   * I - Interface Segregation Principle (ISP): Kullanıcılar, kullanmadıkları arayüzlere bağımlı olmamalıdır. Yani, büyük ve
   * karmaşık arayüzler yerine, daha küçük ve özelleşmiş arayüzler oluşturulmalıdır. Bu, sistemin daha esnek ve bakımı kolay olmasını sağlar.
   *
   * D - Dependency Inversion Principle (DIP): Yüksek seviyeli modüller, düşük seviyeli modüllere bağımlı olmamalıdır. Her ikisi
   * de soyutlamalara bağımlı olmalıdır. Ayrıca, soyutlamalar, detaylara bağımlı olmamalıdır; detaylar, soyutlamalara bağımlı olmalıdır.
   * Bu ilke, bağımlılıkların yönetimini kolaylaştırır ve sistemin esnekliğini artırır.
   *
   * Bu prensipleri uygulamak, yazılım projelerinin kalitesini ve bakımını artırarak, geliştiricilerin daha verimli çalışmalarına yardımcı olur.
   */

  //Sınıflar bağlı olmasın
  //Arabanın temek özelliklerini biliriz ama detaylı bilmeye gerek yoktur
  //Dış dünyaya API açtığımda kod içeriğini bilmesine gerek yok
  public static void main(String[] args) {

    //ADIM 1
//    GuvenliKod gk = new GuvenliKod();
//    gk. dediğimizde metoda erişemiyoruz
    //Çünkü private


    //ADIM 2
    GuvenliKod gk = new GuvenliKod();
    gk.mesaj2(); //PUBLİC
    System.out.println(gk.a);//5


    //ADIM 3
    gk.mesaj3(); //PUBLİC

    //ADIM 5
    /**
     * Statik değerlere sınıf ile erişim sağlanabilir
     */
    System.out.println(GuvenliKod.ab); //ba

    //uvenliKod.cd = "a"; //Cannot assign a value to final variable 'cd'
  }

}
