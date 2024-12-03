package org.effective_java.example.item_18;

import java.util.ArrayList;
import java.util.List;

public class Item18Main {
/**
 * //Java Composition vs Inheritance
 */

public static void main(String[] args) {

  /**
   * Kalıtım: bir sınıfın başka bir sınıfın özelliklerini tekrar kodlamaya gerek kalmadan kullanmasıdır
   *
   * Kedi bir hayvandır (is)
   *
   *
   * Composition : has
   * kuş uçabilir
   * uçak da uçabilir
   * ama kuş bir uçak değildir.
   */

  KotuBirKalitimOrnegi kotuBirKalitimOrnegi = new KotuBirKalitimOrnegi();
 // kotuBirKalitimOrnegi.containsAll(); tüm alt metotlara erişebiliyorum

  /**
   * Encapsulation bozuldu
   */


Kitap kitap1 = new Kitap("Emre");
Kitap kitap2 = new Kitap("Can");

  List<Kitap> kitapList = new ArrayList<>();
  kitapList.add(kitap1);
  kitapList.add(kitap2);

  Kütüphane kütüphane = new Kütüphane(kitapList);

  List<Kitap> kutuphanedekiTumKitaplar = kütüphane.kütüphanedekiTumKitaplar();

  for (Kitap kitap : kutuphanedekiTumKitaplar) {
    System.out.println(kitap.getKitapAdi());
  }

  /**
   * Java'da composition (bileşim) ve inheritance (kalıtım) iki farklı nesne yönelimli programlama (OOP) tekniğidir ve her biri belirli amaçlar için kullanılır. İşte bu iki kavramın özellikleri ve farklılıkları:
   *
   * ### Kalıtım (Inheritance)
   *
   * #### Tanım:
   * Kalıtım, bir sınıfın başka bir sınıfın özelliklerini ve davranışlarını miras almasını sağlayan bir OOP mekanizmasıdır. Java'da `extends` anahtar kelimesi kullanılarak gerçekleştirilir.
   *
   * #### Özellikler:
   * - **Kapsama:** Bir sınıfın (`superclass` veya `base class`) özelliklerini ve yöntemlerini başka bir sınıfa (`subclass` veya `derived class`) aktarır.
   * - **Kod Yeniden Kullanımı:** Üst sınıfın kodunu yeniden kullanarak kod tekrarını azaltır.
   * - **İlişki:** "IS-A" ilişkisini belirtir. Örneğin, bir `Kedi` sınıfı bir `Hayvan` sınıfından türediğinde, `Kedi` bir `Hayvan`'dır.
   * - **Polimorfizm:** Alt sınıf nesneleri üst sınıf türünde kullanılabilir. Bu, dinamik bağlama ve polimorfizm gibi OOP özelliklerini destekler.
   *
   * #### Avantajlar:
   * - **Kodun Tekrar Kullanımı:** Üst sınıfın kodunu tekrar kullanmak, bakım ve geliştirme sürecini kolaylaştırır.
   * - **Daha Basit Kod:** Ortak işlevsellikleri bir üst sınıfta toplamak, alt sınıfların daha temiz ve anlaşılır olmasını sağlar.
   *
   * #### Dezavantajlar:
   * - **Sıkı Bağlılık:** Alt sınıflar, üst sınıfların değişimlerine bağımlı hale gelir. Üst sınıfta yapılan değişiklikler alt sınıfları etkileyebilir.
   * - **Çoğul Kalıtım:** Java, çoklu kalıtımı desteklemez (bir sınıf birden fazla sınıftan türetemez). Bunun yerine, interface'ler bu durumu yönetmek için kullanılır.
   *
   * ### Bileşim (Composition)
   *
   * #### Tanım:
   * Bileşim, bir sınıfın başka bir sınıfın örneklerini içermesini sağlar. Bu, sınıfların birbirine bağlı olduğu bir ilişkiyi ifade eder. Java'da bu, bir sınıfın başka bir
   * sınıfın bir veya daha fazla örneğini bir üye değişken olarak tutmasıyla gerçekleştirilir.
   *
   * #### Özellikler:
   * - **Kapsama:** Bir sınıf bir başka sınıfın örneklerini içerir. Bu, "HAS-A" ilişkisini belirtir. Örneğin, bir `Araba` sınıfı bir `Motor` sınıfına sahip olabilir.
   * - **Esneklik:** Sınıflar arasındaki ilişkiler daha gevşek bağlanmıştır. İç sınıf değişiklikleri diğer sınıfları etkilemez.
   * - **Karmaşıklık Yönetimi:** Daha küçük ve yönetilebilir sınıflar oluşturarak karmaşıklığı yönetir.
   *
   * #### Avantajlar:
   * - **Düşük Bağlılık:** Bileşim, sınıflar arasında daha gevşek bir bağ sağlar, bu da kodun daha esnek ve değişikliklere daha dayanıklı olmasını sağlar.
   * - **Çoğul Bileşim:** Java'da bir sınıf, birden fazla sınıfı içerebilir, bu da bileşenlerin bir araya getirilmesiyle güçlü ve esnek yapılar oluşturmayı sağlar.
   *
   * #### Dezavantajlar:
   * - **Kod Tekrarı:** Eğer birden fazla bileşim kullanılıyorsa, bazı işlevsellikler tekrar edilebilir.
   * - **Erişim:** İçerilen sınıf üyelerine erişim, genellikle daha fazla kod gerektirebilir ve bu, bazı durumlarda karmaşıklığa yol açabilir.
   *
   * ### Karşılaştırma
   *
   * | Özellik              | Kalıtım (Inheritance)                                      | Bileşim (Composition)                           |
   * |----------------------|------------------------------------------------------------|-------------------------------------------------|
   * | İlişki Türü          | IS-A (örneğin, `Kedi` bir `Hayvan`'dır)                     | HAS-A (örneğin, `Araba` bir `Motor`'a sahiptir) |
   * | Bağlılık             | Daha sıkı bağlılık; değişiklikler alt sınıfları etkiler   | Daha gevşek bağlılık; değişiklikler daha az etkiler |
   * | Kod Tekrarı          | Üst sınıftan miras alınan kodlar tekrar kullanılabilir    | Bileşenlerin yönetimi daha fazla kod gerektirebilir |
   * | Çoğul Kalıtım        | Desteklenmez; sadece bir üst sınıf desteklenir            | Desteklenir; bir sınıf birden fazla bileşeni içerebilir |
   * | Polimorfizm          | Destekler; alt sınıf nesneleri üst sınıf türünde kullanılabilir | Polimorfizm desteklenmez; daha fazla kodlama gerektirir |
   * | Esneklik             | Daha az esnek; üst sınıf değişiklikleri etkiler            | Daha esnek; sınıflar arasında gevşek bağlar sağlar |
   *
   * Genel olarak, her iki teknik de çeşitli senaryolar için uygundur ve genellikle birlikte kullanılarak daha güçlü ve esnek yazılım tasarımları oluşturulabilir. Kalıtım genellikle
   * kod tekrarını azaltmak ve polimorfizm sağlamak için kullanılırken, bileşim daha fazla esneklik ve gevşek bağlılık sağlar.
   */

/*
Tabii! İşte Java'da kalıtım ve bileşim kullanımıyla ilgili örnekler:

### Kalıtım (Inheritance) Örneği

Kalıtım, bir sınıfın başka bir sınıftan türemesiyle gerçekleştirilir. Alt sınıf, üst sınıfın özelliklerini ve metodlarını miras alır.

```java
*/
// Üst sınıf (base class)
class Hayvan {
    String ad;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor");
    }
}

// Alt sınıf (derived class)
class Kedi extends Hayvan {

    public Kedi(String ad) {
        super(ad); // Üst sınıfın constructor'ını çağırır
    }

    @Override
    public void sesCikar() {
        System.out.println(ad + " miyavlıyor");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Kedi kedi = new Kedi("Pamuk");
//        kedi.sesCikar(); // Çıktı: Pamuk miyavlıyor
//    }
//}
/*
```

Bu örnekte:
- `Hayvan` sınıfı genel bir hayvanı temsil eder.
- `Kedi` sınıfı, `Hayvan` sınıfından türetilir ve kendi `sesCikar` metodunu geçersiz kılar.

### Bileşim (Composition) Örneği

Bileşim, bir sınıfın başka bir sınıfın örneklerini içermesiyle gerçekleştirilir. Bu, sınıfların bir arada çalışmasını sağlar.

```java
*/
// Motor sınıfı
class Motor {
    public void calistir() {
        System.out.println("Motor çalışıyor");
    }
}

// Araba sınıfı
class Araba {
    private Motor motor; // Motor sınıfının bir örneği

    public Araba() {
        motor = new Motor(); // Motor örneği oluşturuluyor
    }

    public void calistir() {
        motor.calistir(); // Motor'un metodunu çağırır
        System.out.println("Araba çalışıyor");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Araba araba = new Araba();
//        araba.calistir(); // Çıktı: Motor çalışıyor
//                          //       Araba çalışıyor
//    }
//}
/*
```

Bu örnekte:
- `Motor` sınıfı bir motoru temsil eder.
- `Araba` sınıfı, `Motor` sınıfının bir örneğini içerir ve `Motor` sınıfının metodlarını kullanarak kendi işlevselliğini sağlar.

### Kalıtım ve Bileşim Karşılaştırması

#### Kalıtım Örneği
Kalıtım kullanarak, `Kedi` sınıfı `Hayvan` sınıfından türemekte ve `sesCikar` metodunu geçersiz kılmaktadır. Bu, `Kedi` nesnelerinin `Hayvan` türünden olarak kullanılmasını sağlar.

#### Bileşim Örneği
Bileşim kullanarak, `Araba` sınıfı içinde bir `Motor` nesnesi oluşturur ve bu motoru kullanarak araba fonksiyonlarını gerçekleştirir. Burada `Motor` sınıfı, `Araba` sınıfının bir parçası olarak kullanılır, ancak `Araba` sınıfı `Motor` sınıfından türememektedir.

Bu örnekler, kalıtım ve bileşimin nasıl kullanıldığını ve bu iki yaklaşımın yazılım tasarımındaki rolünü anlamanıza yardımcı olabilir. Her iki teknik de kendi avantajlarına ve sınırlamalarına sahiptir ve genellikle çeşitli senaryolarda farklı amaçlar için kullanılır.
 */
}



}
