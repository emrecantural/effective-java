package org.example.item_17;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.BitSet;
import java.util.Date;

public class Item17Main {
  /**
   * Mutable -Immutable obje
   */

  //Mutable - değiştirilebilir obje
  public static void main(String[] args) {

    /**
     * Mutable - nesne oluşturulduğunda objenin değeri stati değiştirilebiliyorsa
     */

    String isim = new String("Emre");

    System.out.println(isim.toLowerCase()); //emre
    System.out.println(isim); //Emre ana objemde değişiklik olmadı
    //O yüzden bu string immutabledir


    Date date = new Date();
    System.out.println(date); //Wed Jul 31 15:08:06 TRT 2024
    date.setTime(7);
    System.out.println(date);//Thu Jan 01 02:00:00 TRT 1970
    //Ana nesnem değişti mutable
    //Trade safe yapıyı bozar çünkü iki thread aynı anda girdiğinde hangi değeri alacak

    //Bundan dolayı LocalDate öneriliyor
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime); //2024-07-31T15:10:23.490579400
    System.out.println(localDateTime.plusDays(1)); //2024-08-01T15:10:23.490579400
    System.out.println(localDateTime); //2024-07-31T15:10:23.490579400

    //Ana nesne değerim değişmemiş oldu thread safe

    /**
     * Bir sınıfı immutable yapmannın sayısız yolu var. Mesala String
     */

    //Final koymadık diyelim
    //O zaman mutable içinden extends edilebilir
    //Bu nedenle final kullan ki sorun çıkmasın extends edilemesin

    /**
     * Static factory metotları ile immutable önemli
     */
    //Boolean.TRUE //Değiştirilemez olduğu için true yazayım her yerde kullanılsın.Hem de değiştirilemez. Hem de kolaylık.

    /*
    Bir sınıfı tasarlarken contructor kullanmak yerine static factory metotları kullanmak
    daha sonra istemcileri hiç etkilemeden cache eklememize olanak sağlar.
     */

    /**
     * Immutable -zararları yeni obje tasarlayım içine eklemek lazım mesela emre idi emre can olsun dersen nesne oluşturup eşitleyeceksin
     * Ancak mutable olsaydı direk değiştirirdi.
     */

    BigInteger fact = new BigInteger("1");
    System.out.println(fact);//1
    fact = fact.flipBit(0); //Setlemek gerekiyor
    System.out.println(fact); //0

//Mutable olsaydı otomatik değişecekti
    BitSet bits1 = new BitSet(1);
    System.out.println(bits1); //{}
    bits1.flip(0);
    System.out.println(bits1); //{0} //Ana obje değişti
//
//
//
//	    // dezavantaja çözüm
//	    //String immutable olduğu halde çözümü -> String builder
    StringBuilder mutableString = new StringBuilder("Şimdi mutable olacak");
    System.out.println(mutableString); //Şimdi mutable olacak
    System.out.println(mutableString.hashCode()); //1996181658
//
//
    mutableString.setCharAt(7, '@'); //İçerisinde hashCode override edilmediği için gönür rahatlığıyla hash eşitliğinden bahsedilebilir
    System.out.println(mutableString.toString()); //Şimdi m@table olacak
    System.out.println(mutableString.hashCode());//1996181658

    /**
     * İçinde hashcode varsa override etmeden hash eşleyemezsin
     */

    /**
     * Her yerde kullanılmaz çünkü object oriented a aykırı
     */
  }
}
