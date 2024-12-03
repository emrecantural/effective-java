package org.effective_java.example.item_19;

public class Item19Main {

  /**
   * 20. Java Inheritance Kullanırken Dikkat Edilmesi Gerekenler - Dokümantasyonun Önemi
   *
   * @param args
   */
  public static void main(String[] args) {
/**
 * İhtiyacını uygun kullan
 */
/**
 * JAVA DOC araştır
 */


//
// JavaDoc, Java kodundaki dokümantasyonları açıklamak için çeşitli parametreler ve etiketler kullanır. İşte JavaDoc'ta kullanabileceğiniz tüm önemli etiketler ve parametreler:
//
// ### Temel JavaDoc Etiketleri
//
// 1. **`@param`**
// - **Açıklama**: Bir metodun parametresini açıklar.
// - **Kullanım**:
// ```java
// /**
// * Bu metodun işlevi.
// *
// * @param param1 Birinci parametre açıklaması.
// * @param param2 İkinci parametre açıklaması.
// */
//     ```
//
//    2. **`@return`**
//    - **Açıklama**: Bir metodun döndürdüğü değeri açıklar.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metodun işlevi.
//     *
//     * @return Metodun döndürdüğü değer açıklaması.
//     */
//     ```
//
//    3. **`@throws` veya `@exception`**
//    - **Açıklama**: Bir metodun atabileceği istisnaları açıklar.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metodun işlevi.
//     *
//     * @throws IOException Eğer bir IO hatası oluşursa.
//     */
//     ```
//
//    4. **`@see`**
//    - **Açıklama**: İlgili sınıf veya metodlara referans verir.
//    - **Kullanım**:
//     ```java
//    /**
//     * Bu metodun işlevi.
//     *
//     * @see DiğerSınıf#diğerMetod()
//     */
//     ```
//
//    5. **`@deprecated`**
//    - **Açıklama**: Bir metodun veya sınıfın kullanılmaması gerektiğini belirtir.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metod artık kullanılmıyor.
//     *
//     * @deprecated Bu metod yerine yeniMetod() kullanılmalıdır.
//     */
//     ```
//
//    6. **`@since`**
//    - **Açıklama**: Özelliğin veya metodun mevcut olduğu sürümü belirtir.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metod işlevsel.
//     *
//     * @since 1.5
//     */
//     ```
//
//### Ek JavaDoc Etiketleri
//
//    1. **`@author`**
//    - **Açıklama**: Sınıfın veya metodun yazarını belirtir.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu sınıfın yazarını belirtir.
//     *
//     * @author John Doe
//     */
//     ```
//
//    2. **`@version`**
//    - **Açıklama**: Sınıfın veya metodun sürüm bilgisini belirtir.
//    - **Kullanım**:
//     ```java
//    /**
//     * Bu sınıfın sürüm bilgisi.
//     *
//     * @version 1.0
//     */
//     ```
//
//    3. **`@see`**
//    - **Açıklama**: İlgili diğer sınıf veya metotlara referans verir.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metod diğerMetod() metodunu kullanır.
//     *
//     * @see #diğerMetod()
//     */
//     ```
//
//    4. **`@link`**
//    - **Açıklama**: İçeride bir referans oluşturur ve genellikle `{@link}` etiketi ile birlikte kullanılır.
//    - **Kullanım**:
//     ```java
//    /**
//     * Bu metod {@link DiğerSınıf#diğerMetod()} metodunu çağırır.
//     */
//     ```
//
//    5. **`@code`**
//    - **Açıklama**: İçerideki kodu biçimlendirir.
//            - **Kullanım**:
//     ```java
//    /**
//     * Bu metod kod örneği: {@code String.valueOf(123)}
//     */
//     ```
//
//    6. **`@value`**
//    - **Açıklama**: Bir sabitin değerini döndürür.
//    - **Kullanım**:
//     ```java
//    /**
//     * Bu sabitin değeri: {@value #SABIT}
//     */
//     ```
//
//### JavaDoc Kullanımına İlişkin Örnek
//
//    Örnek bir JavaDoc açıklaması:
//```java
///**
// * Bu sınıf bir banka hesabını temsil eder.
// *
// * @author Jane Smith
// * @version 1.0
// */
//    public class BankaHesabi {
//
//      private double bakiye;
//
//      /**
//       * Belirtilen bakiye ile yeni bir banka hesabı oluşturur.
//       *
//       * @param başlangıçBakiye Hesabın başlangıç bakiyesi.
//       * @throws IllegalArgumentException Eğer başlangıç bakiye negatifse.
//       */
//      public BankaHesabi(double başlangıçBakiye) {
//        if (başlangıçBakiye < 0) {
//          throw new IllegalArgumentException("Başlangıç bakiye negatif olamaz.");
//        }
//        this.bakiye = başlangıçBakiye;
//      }
//
//      /**
//       * Hesaba para yatırır.
//       *
//       * @param miktar Yatırılacak miktar.
//       * @throws IllegalArgumentException Eğer miktar negatifse.
//       */
//      public void paraYatır(double miktar) {
//        if (miktar < 0) {
//          throw new IllegalArgumentException("Yatırılacak miktar negatif olamaz.");
//        }
//        bakiye += miktar;
//      }
//
//      /**
//       * Hesaptan para çeker.
//       *
//       * @param miktar Çekilecek miktar.
//       * @return Çekilen miktar.
//       * @throws IllegalArgumentException Eğer çekilecek miktar negatifse veya bakiye yetersizse.
//       */
//      public double paraÇek(double miktar) {
//        if (miktar < 0) {
//          throw new IllegalArgumentException("Çekilecek miktar negatif olamaz.");
//        }
//        if (miktar > bakiye) {
//          throw new IllegalArgumentException("Yetersiz bakiye.");
//        }
//        bakiye -= miktar;
//        return miktar;
//      }
//    }
//
//
//    Bu etiketler, kodunuzun okunabilirliğini artırır ve diğer geliştiricilere kodunuzu daha iyi anlama konusunda yardımcı olur. JavaDoc, API dökümantasyonunu oluştururken size büyük bir esneklik sağlar ve kodunuzu daha profesyonel hale getirir.
//

  }
}
