package org.example.item_10;

public class Item10Main {


/**
 * //Overriding Equals and hashCode
 *
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
 */



public static void main(String[] args) {

  /**
   * Referans tip ve Obje Tip kıyaslaması
   *
   */

  /**
   * REFERANS TİPLERİ KIYASLAMASI
   */

  //Integer type --false
  System.out.println(10 == 20);
  //Char type --false
  System.out.println('a'=='b');
  //char and double type --true
  System.out.println('a' == 97.0);
  //boolean type --true
  System.out.println(true == true);


  //Cast char to int --97
  System.out.println((int) 'a');
  //char is automatically promoted to int
  System.out.println('a' == 97);//--true
  System.out.println('a'+1); //--98
  //cast int to char --a
  System.out.println((char) 97);

  // == stackdeki bir referans tiplerine bakıyorumd demektir
  /**
   * Java programlama dilinde "referans tipi" terimi, bir nesnenin türünü belirtmek için kullanılır. Java'da, veri türleri iki kategoriye ayrılır: temel veri tipleri (primitive types) ve referans veri tipleri (reference types).
   *
   * Temel veri tipleri (primitive types), Java dilinde doğrudan değerleri temsil eden ve bellekte bir yer kaplayan veri tipleridir. Bunlar şunlardır: int, double, boolean, char, vb.
   *
   * Referans veri tipleri ise nesnelerin referanslarını (adreslerini) tutan ve nesnenin veri yapısını ve davranışlarını tanımlayan veri tipleridir. Örneğin: sınıflar (classes), arabirimler (interfaces), diziler (arrays) gibi.
   *
   * Örneğin, bir sınıf türünde bir referans tipi şu şekilde tanımlanabilir:
   *
   * java
   * Kodu kopyala
   * String str; // str değişkeni, String sınıfına ait bir referans tipidir
   * Burada str değişkeni, String sınıfından bir nesnenin referansını tutar. String sınıfı, Java'nın standart kütüphanesinde bulunan bir sınıf türüdür ve metinsel verileri temsil eder.
   *
   * Referans tipleri genellikle null değerini alabilirler, yani hiçbir nesneyi göstermeyen bir durumu ifade ederler. Örneğin:
   *
   * java
   * Kodu kopyala
   * String str = null; // str şu anda hiçbir String nesnesini göstermiyor
   * Java'da, nesnelerin oluşturulması ve kullanılması referans tipleri üzerinden yapılır. Bu, nesnenin verilerini ve metotlarını içeren bir yapıyı işaret eden referansın kullanılmasını gerektirir.
   */

/**
 * promoted -> terfi ettirmek
 */

/**
 * OBJE TIP
 */

/**
 * Oluşturulan nesneleri Emre a = new Emre () , Emre b = new Emre()
 * için a == b dersen referans değerlerine bakar
 * bunlar stackte ayrı bir referans olarak tutulduğu için hatalıdır
 * heapte de farklı objelere yönlendirilir
 *
 *
 * a.equals(b) de false döner  nedenine geçelim
 *
 */


DenemeSinifi emre = new DenemeSinifi(1,2);

  DenemeSinifi can = new DenemeSinifi(1,2);
  System.out.println(emre==can); //false
  System.out.println(emre.equals(can)); //false


  /**
   * PART 2
   */

//Biz eşit değişiz

  if (can.equals(emre))
    System.out.println("Biz eşitiz");
  else
    System.out.println("Biz eşit değişiz");

}





}
