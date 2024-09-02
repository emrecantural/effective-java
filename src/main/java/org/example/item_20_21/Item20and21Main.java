package org.example.item_20_21;

public class Item20and21Main implements ŞarkıcıŞarkıYazarı {
  /**
   * Java Abstract vs Interface - Default Method in Interface
   */
  @Override
  public void şarkıYaz() {

  }

  @Override
  public void şarkıSöyle() {

  }

  @Override
  public void çalBirşeyler() {

  }

  public static void main(String[] args) {

    Kuş kuş = new Kuş();
    kuş.sesÇıkar();
    kuş.nefesAl();

    /**
     * Java8 ile birlikte default geldi
     */

/**
 * Eğer default yazarsan dopğrudan kullanabilirsin
 */

    Item20and21Main main = new Item20and21Main();
    main.şiirYazabiliyormusun(); //Bu şekilde kullanabilirsin ama öenerilmiyor baştan sağma olmasın diye
  }

  /**
   * Elbette! `interface` ve `abstract class`, nesne yönelimli programlamada soyutlama ve kodun yeniden kullanımını sağlamak için kullanılan iki temel yapıdır. Her ikisi de sınıflar arasında ortak bir yapı tanımlamak için kullanılır, ancak bazı önemli farkları vardır. İşte her birinin özellikleri ve kullanım örnekleri:
   *
   * ### 1. Interface (Arayüz)
   *
   * **Özellikler:**
   *
   * - Sadece metod imzalarını (yani metod adı, dönüş tipi, ve parametreleri) tanımlar. Metodların gövdesini içermez.
   * - Tüm metodlar varsayılan olarak `public` ve `abstract`’tır (Java için). C# gibi bazı dillerde, arayüzler yalnızca `public` metodları destekler.
   * - Bir sınıf birden fazla arayüzü (interface) uygulayabilir. Bu çoklu kalıtımı sağlar.
   * - Arayüzler, genellikle bir sınıfın belirli bir davranışı gerçekleştirmesi gerektiğinde kullanılır.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * // Arayüz tanımı
   * interface Drawable {
   *     void draw();
   * }
   *
   * // Arayüzü uygulayan sınıf
   * class Circle implements Drawable {
   *     @Override
   *     public void draw() {
   *         System.out.println("Drawing a circle.");
   *     }
   * }
   *
   * // Başka bir arayüzü uygulayan sınıf
   * class Rectangle implements Drawable {
   *     @Override
   *     public void draw() {
   *         System.out.println("Drawing a rectangle.");
   *     }
   * }
   *
   * // Kullanım
   * public class Main {
   *     public static void main(String[] args) {
   *         Drawable circle = new Circle();
   *         Drawable rectangle = new Rectangle();
   *
   *         circle.draw();    // Çıktı: Drawing a circle.
   *         rectangle.draw(); // Çıktı: Drawing a rectangle.
   *     }
   * }
   * ```
   *
   * ### 2. Abstract Class (Soyut Sınıf)
   *
   * **Özellikler:**
   *
   * - Hem soyut (abstract) hem de somut (concrete) metodları içerebilir. Soyut metodlar sadece imzalarını tanımlar, gövdesi yoktur, ancak somut metodlar bir gövdeye sahiptir.
   * - Soyut sınıflar, doğrudan örneklendirilemez. Yalnızca bu sınıfı genişleten bir alt sınıf tarafından örneklendirilebilir.
   * - Bir sınıf yalnızca bir soyut sınıfı genişletebilir (single inheritance).
   * - Soyut sınıflar, ortak işlevselliği paylaşan sınıflar için bir temel sağlar.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * // Soyut sınıf tanımı
   * abstract class Shape {
   *     abstract void draw(); // Soyut metod
   *
   *     void describe() {     // Somut metod
   *         System.out.println("This is a shape.");
   *     }
   * }
   *
   * // Soyut sınıfı genişleten sınıf
   * class Circle extends Shape {
   *     @Override
   *     void draw() {
   *         System.out.println("Drawing a circle.");
   *     }
   * }
   *
   * // Başka bir soyut sınıfı genişleten sınıf
   * class Rectangle extends Shape {
   *     @Override
   *     void draw() {
   *         System.out.println("Drawing a rectangle.");
   *     }
   * }
   *
   * // Kullanım
   * public class Main {
   *     public static void main(String[] args) {
   *         Shape circle = new Circle();
   *         Shape rectangle = new Rectangle();
   *
   *         circle.draw();    // Çıktı: Drawing a circle.
   *         circle.describe(); // Çıktı: This is a shape.
   *
   *         rectangle.draw(); // Çıktı: Drawing a rectangle.
   *         rectangle.describe(); // Çıktı: This is a shape.
   *     }
   * }
   * ```
   *
   * ### Karşılaştırma ve Kullanım Durumları
   *
   * - **Arayüzler**:
   *   - Birden fazla arayüzü bir sınıfta uygulayabilirsiniz. Bu, çoklu kalıtımı destekler ve sınıfların farklı yetenekleri birlikte kullanabilmesini sağlar.
   *   - Genellikle, sınıfın birden fazla yeteneğe sahip olmasını istediğinizde kullanılır.
   *
   * - **Soyut Sınıflar**:
   *   - Soyut sınıflar, ortak işlevselliği ve veriyi paylaşmak için kullanılır. Bir soyut sınıf, bu işlevselliği sağlamak için somut metodlar sunabilir.
   *   - Eğer bazı ortak metodları ve durumları paylaşmak istiyorsanız ve sadece bir temel sınıftan türemek istiyorsanız soyut sınıflar uygundur.
   *
   * Genellikle, arayüzler çoklu kalıtım gereksinimlerini karşılamak için kullanılırken, soyut sınıflar ortak davranışları ve özellikleri paylaşmak için kullanılır. İhtiyacınıza göre her iki yapıyı da değerlendirebilir ve en uygun olanı seçebilirsiniz.
   */


}
