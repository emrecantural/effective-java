package org.example.item_3;

public class Item3Main {
  public static void main(String[] args) {

    /**
     * SINGLETON DESIGN PATTERN
     * Bir sınıfın sadece 1 instance olmalıdır.
     */

    //Aşağıdaki yapı singletonu bozdu çünkü çok kez tanımladık.
    //1. adım
//    DefineSingleton ds1 = new DefineSingleton();
//    DefineSingleton ds2 = new DefineSingleton();
//    DefineSingleton ds3 = new DefineSingleton();
//    DefineSingleton ds4 = new DefineSingleton();

    //2. adım private costructor ile yukarıdaki işlem yapılamaz


//    //Peki instance nerede oluşturulacak. Tabi ki class ın içinde
//    //2. Adım
//
//    DefineSingleton ds = DefineSingleton.ds;
//    DefineSingleton ds1 = DefineSingleton.ds;
//
////Bunu da yapmayalım onun yerine static faktory kullanalım.
//    //3. Adım
//
//    DefineSingleton ds3 = DefineSingleton.ds;
//    DefineSingleton ds4 = DefineSingleton.getInstance();
////Peki bunlar aynı instance mı?
//
//    System.out.println(ds3.hashCode()); //Not -> Printf hata verdi println ne dikkat et
//    System.out.println(ds4.hashCode());
//    /**
//     * ÇIKTILAR:
//     *81628611
//     * 81628611
//     * Aynı hashcode a sahipler
//     */

/**
 * 1. LAZY DESIGN  PATTERN
 *
 * Sadece çağrıldığında instance üretilir.
 */

/***
 * Java'da Thread, bir programın aynı anda birden fazla iş yapabilmesini sağlayan yapı taşlarından biridir.
 * Bu, çok iş parçacıklı programlama (multithreading) olarak adlandırılır ve genellikle performansın
 * artırılması veya programın yanıt verebilirliğinin iyileştirilmesi amacıyla kullanılır.
 * Java'da bir Thread oluşturmanın ve kullanmanın iki ana yolu vardır: Thread sınıfını genişletmek ve Runnable arayüzünü uygulamak.
 */

//Aynı anda iki thread grerse
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(1); //ikisi aynı anda girsin 1 saniye delay ile
        }catch (InterruptedException exception){


        }
        System.out.println("Hash code of lazy:" + LazyCache.getInstance().hashCode());
        System.out.println("Hash code of eager:" + EagerCache.getInstance().hashCode());
        System.out.println("Hash code of enum:" + Enum.INSTANCE.hashCode());
      }
    }).start();



    new Thread(new Runnable() {
      @Override
      public void run() {

        System.out.println("Hash code of lazy:" + LazyCache.getInstance().hashCode());
        System.out.println("Hash code of eager:" + EagerCache.getInstance().hashCode());
        System.out.println("Hash code of enum:" + Enum.INSTANCE.hashCode());
      }
    }).start();


    /**
     * Hash code of lazy:180915329
     * Hash code of lazy:1198017147 -> Her çağrıldığında yenisi oluştuğu için farklı
     * Hash code of eager:929420727
     * Hash code of eager:929420727
     * Hash code of enum:1090289574
     * Hash code of enum:1090289574
     */


/**
 * EAGER DESIGN PATTERN
 *
 * İsteksiz sabırsız. Başlangıçta instanceını oluturuyoruz. -ECT
 * İhtiyacın olmasa bile heapte yer tutat
 */


/**
 * ENUM DESIGN PATTERM
 * EKstra metoda ce constructera ihtiyacı yok
 * Daha az kod ve heapte yer tutmaz
 */

  }
}
