package org.example.Item_6;

import java.util.ArrayList;
import java.util.List;

public class Item6Main {
  /**
   * //Autoboxing & Unboxing
   * <p>
   * gereksiz kod kullanma
   * işi hızlandır
   */

  //RegexExample classında ilk anlatım var
  public static void main(String[] args) {
    String kelime = new String("Bikini");
    String kelime2 = "Bikini";

    //İki şekilde de tanımlanır ve kullanılabilir
    //Farkları ne peki
    System.out.println(kelime == kelime2);
    /**
     * false
     */

    String kelime3 = "Bikini";
    System.out.println(kelime2 == kelime3);
    /**
     * true
     *
     */

    /**
     * ava'da String nesneleri oluşturma ve karşılaştırma işlemleri bazı önemli nüanslara sahiptir. String nesnelerini oluştururken ve
     * karşılaştırırken iki farklı yöntem kullanabilirsiniz: new anahtar kelimesi ile ve doğrudan literaller kullanarak.
     *
     * new Anahtar Kelimesi ile String Oluşturma
     * java
     * Kodu kopyala
     * String kelime = new String("Bikini");
     * Bu şekilde oluşturulan String nesnesi, Java'nın hafıza yönetimi sayesinde heap bellekte yeni bir nesne olarak oluşturulur. Her new String ifadesi, yeni ve bağımsız bir String nesnesi yaratır.
     *
     * String Literalleri ile String Oluşturma
     * java
     * Kodu kopyala
     * String kelime2 = "Bikini";
     * String kelime3 = "Bikini";
     * Bu şekilde oluşturulan String nesneleri, Java'nın String Pool (String Havuzu) adı verilen bir bellekte saklanır.
     * Aynı literal değere sahip String nesneleri, bellekte sadece bir kez saklanır ve bu nesneye referanslar yeniden kullanılır.
     * Yani, aynı literal değeriyle oluşturulan tüm String değişkenleri aynı nesneyi gösterir.
     */
    System.out.println(kelime.hashCode());
    System.out.println(kelime2.hashCode());
    System.out.println(kelime3.hashCode());

/**
 * hashCode metodunun amacı, aynı içeriğe sahip String nesnelerinin aynı hash kodunu üretmesidir. Bu, String nesnelerinin veri yapıları
 * (örneğin, HashMap veya HashSet) içinde karşılaştırılmasını ve depolanmasını optimize eder.
 * İçeriği aynı olan String nesnelerinin aynı hashCode değerine sahip olması, equals metodunun doğru çalışmasını ve veri yapılarının doğru çalışmasını sağlar.
 */


    //Yani aynı referansa bakıyorlar bu nedenle iyi olabilir.

    long start = System.nanoTime(); //İşin başlama zamanı için kullanışlı olabilir
    toplaWrapper();
    long end = System.nanoTime();

    System.out.println("Wrapper class geçen Süre:" + (end - start));

/**
 * 135400
 */


    long start2 = System.nanoTime(); //İşin başlama zamanı için kullanışlı olabilir
    toplaPrimitive();
    long end2 = System.nanoTime();

    System.out.println("Primitive type geçen Süre:" + (end2 - start2));

    /**
     * 3400
     */


    //Neden böyle sonuç aldık:

    //Autoboxing- unboxing

    ArrayList<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      integers.add(i); //-> bu aslında i -> Integer.valuof çalıştırıyor bu yüzden yavaşlık var
    }


    List<Integer> li = new ArrayList<>();
    for (Integer i : li){
      if (i %2 == 0); // i.intValue yazıyor aslında
    }

  }


  private static Long toplaWrapper() {

    Long sum = 0L; //Wrapper  class primitive olmayan
    for (int i = 0; i < 150; i++) {
      sum += i;

    }
    return sum;
  }

  private static long toplaPrimitive() {

    long sum = 0; //Wrapper  class primitive olmayan
    for (int i = 0; i < 150; i++) {
      sum += i;

    }
    return sum;
  }

}
