package org.effective_java.example.item_10_11;

import java.util.*;

public class Item10and11Main {


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

//Biz eşit değiliz

  if (can.equals(emre))
    System.out.println("Biz eşitiz");
  else
    System.out.println("Biz eşit değişiz");




  DenemeSinifiOverride deneme1 = new DenemeSinifiOverride(10,11);
  DenemeSinifiOverride deneme2 = new DenemeSinifiOverride(10,11);


  if (deneme2.equals(deneme1))   //Biz eşitiz

  System.out.println("Biz eşitiz");
  else
    System.out.println("Biz eşit değişiz");



  /**
   * Indicates whether some other object is "equal to" this one.
   * The equals method implements an equivalence relation on non-null object references:
   * It is reflexive: for any non-null reference value x, x.equals(x) should return true.
   * It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
   * It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z)
   * should return true.
   * It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently
   * return false, provided no information used in equals comparisons on the objects is modified.
   * For any non-null reference value x, x.equals(null) should return false.
   * The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is, for any
   * non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).
   * Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general
   * contract for the hashCode method, which states that equal objects must have equal hash codes.
   * Params:
   * obj – the reference object with which to compare.
   * Returns:
   * true if this object is the same as the obj argument; false otherwise.
   * See Also:
   * hashCode(), java.util.HashMap
   */

/**
 * Başka bir nesnenin buna "eşit" olup olmadığını belirtir.
 * Equals yöntemi, null olmayan nesne referanslarında bir eşdeğerlik ilişkisi uygular:
 * Yansıtıcıdır: null olmayan herhangi bir referans değeri x için, x.equals(x) true değerini döndürmelidir.
 * Simetriktir: null olmayan herhangi bir referans değeri x ve y için, x.equals(y) yalnızca y.equals(x) true değerini döndürüyorsa t
 * rue değerini döndürmelidir.
 * Geçişkendir: null olmayan herhangi bir referans değeri x, y ve z için, x.equals(y) true değerini döndürüyorsa ve y.equals(z) true
 * değerini döndürüyorsa, x.equals(z) true değerini döndürmelidir.
 * Tutarlıdır: null olmayan herhangi bir referans değeri x ve y için, nesneler üzerindeki equals karşılaştırmalarında kullanılan hiçbir
 * bilgi değiştirilmediği sürece, x.equals(y)'nin birden fazla çağrısı tutarlı bir şekilde true veya tutarlı bir şekilde false değerini
 * döndürür. Herhangi bir boş olmayan referans değeri x için, x.equals(null) false döndürmelidir.
 * Object sınıfı için equals yöntemi, nesneler üzerinde mümkün olan en ayırt edici eşdeğerlik ilişkisini uygular; yani, herhangi bir boş
 * olmayan referans değeri x ve y için, bu yöntem yalnızca x ve y aynı nesneye atıfta bulunuyorsa true döndürür (x == y true değerine sahiptir).
 * Bu yöntem geçersiz kılındığında genellikle hashCode yöntemini geçersiz kılmanın gerekli olduğunu unutmayın, böylece eşit nesnelerin eşit
 * karma kodlarına sahip olması gerektiğini belirten hashCode yöntemi için genel sözleşme korunur.
 * Parametreler:
 * obj – karşılaştırılacak referans nesnesi.
 * Döndürür:
 * bu nesne obj argümanıyla aynıysa true; aksi takdirde false.
 * Ayrıca Bkz.:
 * hashCode(), java.util.HashMap
 */


/**EĞER;
 * Eğer miras aldığın metotta equals varsa sen alt class ta equals yazamazsın
 * Bu  kuralları bozar.
 *
 * Extend edeceğinize component pşaral aş ve consta ata
 * injection ile çöz
 *
 *
 */


/**
 * 2. KONU HASHCODE
 *
 * ne zaman equals override ettiğinde hashkdu da override etmen gerekir.
 *
 *
 */
  /**
   * Hash kodsuz
   */
  DenemeSinifiOverride deneme4 = new DenemeSinifiOverride(10,11);
  DenemeSinifiOverride deneme5 = new DenemeSinifiOverride(15,61);
  DenemeSinifiOverride deneme6 = new DenemeSinifiOverride(10,11);


  System.out.println(deneme4.hashCode()); //1828972342
  System.out.println(deneme5.hashCode()); //1452126962
  System.out.println(deneme6.hashCode()); //931919113


/**
 * Normalde deneme 4 ve 5 in hashkodunun aynı olmasını beklerdik
 *
 * PEKİ SIKINTISI NE?
 */

  Map<DenemeSinifiOverride, String> m = new HashMap<>();
  m.put(new DenemeSinifiOverride(10,11), "İlkEleman");

  System.out.println(m.get(new DenemeSinifiOverride(10,11))); //null


  /**
   * BU yüzden hash code da olmalıdır. EKledikten sonra
   */

  //Hash Code override ettikten sonra

  Map<DenemeSinifiOverride, String> c = new HashMap<>();
  c.put(new DenemeSinifiOverride(10,11), "İlkEleman");

  System.out.println(m.get(new DenemeSinifiOverride(10,11))); //İlkEleman



  //Hash Code override ettikten sonra diğer yol

  Map<DenemeSinifiOverride, String> d = new HashMap<>();
  d.put(new DenemeSinifiOverride(10,11), "İlkEleman");

  System.out.println(m.get(new DenemeSinifiOverride(10,11))); //İlkEleman


  /**
   * Eğer equalsı eşit etmezsek ne olur
   *
   *
   */

  List<DenemeSinifiOverride> denemeSinifiOverrides = new ArrayList<>();
  DenemeSinifiOverride e = new DenemeSinifiOverride(1,2);
  denemeSinifiOverrides.add(e);
  System.out.println(denemeSinifiOverrides.contains(new DenemeSinifiOverride(1,2))); //true

  List<DenemeSinifi> denemeSinifi= new ArrayList<>();
  DenemeSinifi l=new DenemeSinifi(1,2);
  denemeSinifi.add(l);
  System.out.println(denemeSinifi.contains(new DenemeSinifi(1,2))); //false

  /**
   *Belirli java classlarında gerek yok
   * mesela randomda gerek yok sürekli veri değişiyor zaten
   *
   * Ama date de olabilir çünkü darihler eşit mi bakmak gerekir.
   *
   *
   */
/**
 * Date
 *
 *   public boolean equals(Object obj) {
 *         return obj instanceof Date && getTime() == ((Date) obj).getTime();
 *     }
 */



}






}
