package org.example.item_42;

public class Item42Main {
  /**
   *  //43. Java Lambda Expressions & Anonymous Classes (Örnekli Anlatım)
   */

  public static void main(String[] args) {
    // Notlarım
    // Eğer yaptığınız hesaplama ek açıklamaya ihtiyaç duyuyorsa veya birkaç satırdan fazla kod yazmayı gerektiriyorsa lambda kullanmayın.

    /**
     * Tabii ki! Java'da `FunctionalInterface` (fonksiyonel arayüz) terimi, belirli bir işlevi temsil eden ve yalnızca bir soyut metoda sahip olan arayüzleri tanımlar. Java 8 ile tanıtılan bu konsept, lambda ifadeleri ve metod referansları gibi fonksiyonel programlama özelliklerinin temelini oluşturur.
     *
     * ### 1. **Fonksiyonel Arayüz Nedir?**
     *
     * Fonksiyonel arayüz, yalnızca bir tane soyut metoda sahip olan bir arayüzdür. Bu, arayüzün işlevsel bir tür olduğunu belirtir ve lambda ifadeleri veya metod referansları kullanılarak uygulanabilir. Java'da fonksiyonel arayüzler, genellikle bir işlevi temsil etmek için kullanılır.
     *
     * ### 2. **@FunctionalInterface Anotasyonu**
     *
     * `@FunctionalInterface` anotasyonu, bir arayüzün fonksiyonel arayüz olduğunu belirtmek için kullanılır. Bu anotasyon, iki ana işlevi yerine getirir:
     *
     * - **Söz Dizimi Kontrolü:** `@FunctionalInterface` anotasyonu kullanıldığında, derleyici arayüzün yalnızca bir tane soyut metod içerdiğini kontrol eder. Eğer birden fazla soyut metod varsa, derleme hatası oluşur.
     * - **Dokümantasyon:** Bu anotasyon, kodun okunabilirliğini artırır ve bu arayüzün fonksiyonel programlama için tasarlandığını belirtir.
     *
     * ### 3. **Fonksiyonel Arayüzlerin Özellikleri**
     *
     * - **Bir Soyut Metod:** Fonksiyonel arayüzler, yalnızca bir tane soyut metoda sahip olmalıdır. Ancak, bu soyut metodun dışında, arayüzde varsayılan (default) metodlar veya statik metodlar olabilir.
     *
     * - **`@FunctionalInterface` Anotasyonu:** Bu anotasyon kullanılarak arayüzün fonksiyonel bir arayüz olduğunu açıkça belirtebilirsiniz, ancak anotasyon kullanmak zorunlu değildir. Eğer yalnızca bir soyut metod varsa, arayüz fonksiyonel olarak kabul edilir.
     *
     * ### 4. **Örnekler**
     *
     * #### Basit Bir Fonksiyonel Arayüz
     *
     * ```java
     * @FunctionalInterface
     * public interface Calculator {
     *     int calculate(int a, int b);
     *
     *     // Varsayılan metod (isteğe bağlı)
     *     default int add(int a, int b) {
     *         return a + b;
     *     }
     *
     *     // Statik metod (isteğe bağlı)
     *     static int multiply(int a, int b) {
     *         return a * b;
     *     }
     * }
     * ```
     *
     * Burada, `Calculator` arayüzü yalnızca bir soyut metoda (`calculate`) sahiptir ve bu nedenle bir fonksiyonel arayüzdür. Ayrıca, bir varsayılan metod (`add`) ve bir statik metod (`multiply`) içerir.
     *
     * #### Lambda İfadesi Kullanımı
     *
     * Fonksiyonel arayüzlerin en yaygın kullanımı lambda ifadeleriyle olur:
     *
     * ```java
     * public class Main {
     *     public static void main(String[] args) {
     *         Calculator addition = (a, b) -> a + b;
     *         System.out.println(addition.calculate(5, 3)); // Çıktı: 8
     *     }
     * }
     * ```
     *
     * Burada, `addition` isimli `Calculator` arayüzüne bir lambda ifadesi atanmıştır. Lambda ifadesi, `calculate` metodunun nasıl çalışacağını tanımlar.
     *
     * ### 5. **Fonksiyonel Arayüzlerin Kullanım Alanları**
     *
     * - **Java API'lerinde:** `java.util.function` paketinde birçok fonksiyonel arayüz bulunur, örneğin `Function<T, R>`, `Predicate<T>`, `Consumer<T>`, ve `Supplier<T>`.
     * - **Lambda İfadeleri:** Lambda ifadeleri, fonksiyonel arayüzlerin kullanımını basitleştirir ve daha okunabilir kod yazılmasını sağlar.
     *
     * Fonksiyonel arayüzler, Java'nın fonksiyonel programlama kapasitesini kullanmanın temel yollarından biridir ve modern Java uygulamalarında sıkça kullanılır.
     */
  }
}
