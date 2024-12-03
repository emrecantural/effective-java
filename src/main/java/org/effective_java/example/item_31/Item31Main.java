package org.effective_java.example.item_31;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Item31Main {
  /**
   * 31. Java Generics WildCards - (Java ile Api Tasarlamak için Bu Konuyu Bilmelisin!)
   */

  /**
   * API tasarlarken en esnek yapıyı tasarlamak
   */


  public static void main(String[] args) {


    /**
     * PECS
     *
     * producer extends - consumer super
     */
    /**
     * Üst tür - alt tür
     *
     * extends
     * super
     */
    List<Objects> obje1 = new
            ArrayList<Objects>();
    //List<Objects> obje2 = new   ArrayList<String>(); //Hata verecek esneklik olmadı

    /**
     * A üst clas
     * B extends A
     * C extend B
     * D extens B
     */

    List<A> list;
    list = new ArrayList<A>();
    //list = new ArrayList<B>(); //Yine B ye hata verdi B extends A olmasına rağmen

    /**Çözüm*/

    List <? extends  A > list1; //? -> Joker
    list1 = new ArrayList<B>();
    list1 = new ArrayList<C>();
    list1 = new ArrayList<D>();

    List<? super  B> list2;
    list2 = new ArrayList<B>();
   //list2 = new ArrayList<C>(); //hata
   //list2 = new ArrayList<D>(); //hata kendinden ve kendinin bir üstünden oluşturulmasına imkan tanır


  //Item 30 daki union üzerinden

    Set<String> fenerbahce = Set.of("Uğur Boral", "Caner", "Pelkas");
    Set<String> Türkiye = Set.of("Uğur Boral", "Hasan Şaş", "Burak", "Rüştü");
    Set<Double> doubles = Set.of(1d,2d,3d);

    //Set<String> birleşim = Union.union(fenerbahce, doubles); //hata verecek esnekliğin önünü kesti

    /**
     * Yeni (Item 31) üzerinden
     */








  }

}
