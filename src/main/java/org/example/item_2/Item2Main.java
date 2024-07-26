package org.example.item_2;

public class Item2Main {
  public static void main(String[] args) {

    //BUILDER DESIGN PATTERN

    //Senaryo -> oluşturacağım sınıfın olmazsa olmaz ve opsiyonel parametreleri var

    //Çok fazla parametre ile contructor oluşturmamak

    //Kahveci kahveci1 = new Kahveci("Boyut");
    //Kahveci kahveci2 = new Kahveci("Boyut", "ŞekerMiktari");
    //Kahveci kahveci3 = new Kahveci("Boyut", "ŞekerMiktari", "SutMiktari");

    //Görüldüğü gibi her bir senaryo ve parametre için constructor oluşturulmalıdır.
    //Bu yönteme de TELESCOPE PATTERN denir. Baktığını görürsün.


    //ÇÖZÜM 2 BOŞ BİR CONSTRUCTOR OLUŞTUR. GEREKLİ OLANLARI DA GETTER SETTER İLE EKLE
    Kahveci kahveci = new Kahveci();
    kahveci.setKahveBoyutu("A");
    kahveci.setSekerMiktari("B");

    //DAHA DÜZGÜNÜ AMA araya bişeyler yazıldığında karışor. Bizim projeizde buldukça setlediğimiz için kullanımı uygun aslında
    //Bu yönteme JAVABEANS PATTERN DENİR
    int deger = 1;
    kahveci.setSutMiktari("C");


    //ÇÖZÜM 3 BUILDER DESIGN PATTERN
    //Kod tekrarı olabiliyor.

    KahveciBuilder kahveciBuilder = new KahveciBuilder.Builder("KahveBoyut").build();
    KahveciBuilder kahveciBuilder2 = new KahveciBuilder.Builder("KahveBoyut").sekersiz("Sekersiz").build();

    //NE EKLEMEK İSTERSEK BÖYLECE EKLEYEBİLİYORUZ
    //DİREK BUİLDER SETTERI ile de oluşturulabilir.

    //Ayrıca istediğin kontrılü de sağlayabilirsin
    //if(serkersiz.isEmpty)

    //Gereksiz kullanırsak zararlı ama compleks yapıda kullanılır.

    //KENDİME ÖZET
    /**
     * Constructor ve static factory metotlar senaryoya göre kullanılır.
     * Eğer direk constructorlarla yönetirsek telescope pattern
     * Eğer get set kullanırsak JavaBeans Pattern
     * Eğer Builder kullanırsak da BuilderPattern olarak kullanılır.
     * Fark parametrelerin çokluğuna ve zorunlu olmasına göre değiştir.
     */


  }

}
