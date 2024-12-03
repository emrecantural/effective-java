package org.effective_java.example.item_27;

public class Item27Main {
  /**
   * Java Unchecked Warnings - SuppressWarnings (Nereden geliyor bu sarı yazılar?)
   */

  /**
   * Kod sarı sarı altını çizdiğinde uyarı berd,inde nasıl düzenleme yapmalıyoz
   *
   * Güvenlik açığı yok ama sadece uyarular var
   */


  /**
   * Java'da `@SuppressWarnings` anotasyonuyla ilgili çeşitli uyarı türleri vardır. Her uyarı türü, belirli bir türdeki uyarıları bastırmak için kullanılır. İşte bazı yaygın uyarı türleri ve her birine örnekler:
   *
   * ### 1. **`unchecked`**
   *
   * **Açıklama:** Generics ile ilgili uyarıları bastırır. Örneğin, raw type (ham tür) kullanımı veya generics türlerinin kontrol edilmemesi.
   *
   * **Örnek:**
   *
   * ```java
   * import java.util.ArrayList;
   * import java.util.List;
   *
   * public class MyClass {
   *     @SuppressWarnings("unchecked")
   *     public void myMethod() {
   *         List rawList = new ArrayList(); // raw type
   *         rawList.add("Hello");
   *         List<String> stringList = rawList; // unchecked conversion
   *     }
   * }
   * ```
   *
   * ### 2. **`deprecation`**
   *
   * **Açıklama:** Artık önerilmeyen (deprecated) API'lerle ilgili uyarıları bastırır. Bu uyarı, eski ve önerilmeyen metodları veya sınıfları kullanırken görülür.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("deprecation")
   *     public void myMethod() {
   *         OldClass old = new OldClass(); // OldClass ve/veya metotları deprecated olabilir
   *         old.oldMethod();
   *     }
   * }
   * ```
   *
   * ### 3. **`unused`**
   *
   * **Açıklama:** Kullanılmayan değişkenler, metodlar veya parametrelerle ilgili uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("unused")
   *     private void myUnusedMethod() {
   *         int unusedVariable = 0;
   *     }
   * }
   * ```
   *
   * ### 4. **`rawtypes`**
   *
   * **Açıklama:** Generics kullanılırken tür parametrelerinin belirtilmemesi ile ilgili uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * import java.util.ArrayList;
   *
   * public class MyClass {
   *     @SuppressWarnings("rawtypes")
   *     public void myMethod() {
   *         ArrayList list = new ArrayList(); // raw type
   *     }
   * }
   * ```
   *
   * ### 5. **`serial`**
   *
   * **Açıklama:** `Serializable` sınıfının serileştirme ile ilgili gerekli `serialVersionUID` alanının eksik olmasından kaynaklanan uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * import java.io.Serializable;
   *
   * public class MyClass implements Serializable {
   *     @SuppressWarnings("serial")
   *     private static final long serialVersionUID = 1L; // `serialVersionUID` eksikliği uyarısı
   * }
   * ```
   *
   * ### 6. **`nls`**
   *
   * **Açıklama:** Uluslararasılaştırma ile ilgili uyarıları bastırır. Genellikle `String` literal'larının `ResourceBundle`'da tanımlanmaması ile ilgili uyarılar için kullanılır.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("nls")
   *     public void myMethod() {
   *         System.out.println("This is a string literal."); // Uluslararasılaştırma uyarısı
   *     }
   * }
   * ```
   *
   * ### 7. **`fallthrough`**
   *
   * **Açıklama:** `switch` case yapısında `case` etiketleri arasında `break` eksikliği nedeniyle oluşan uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("fallthrough")
   *     public void myMethod(int value) {
   *         switch (value) {
   *             case 1:
   *                 System.out.println("Case 1");
   *                 // no break
   *             case 2:
   *                 System.out.println("Case 2");
   *                 break;
   *             default:
   *                 System.out.println("Default case");
   *                 break;
   *         }
   *     }
   * }
   * ```
   *
   * ### 8. **`divzero`**
   *
   * **Açıklama:** Sıfıra bölme gibi matematiksel hataları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("divzero")
   *     public void myMethod() {
   *         int result = 10 / 0; // Division by zero uyarısı
   *     }
   * }
   * ```
   *
   * ### 9. **`rawtypes`**
   *
   * **Açıklama:** Generics türlerinin ham (raw) türlerle kullanımı ile ilgili uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * import java.util.*;
   *
   * public class MyClass {
   *     @SuppressWarnings("rawtypes")
   *     public void myMethod() {
   *         List list = new ArrayList(); // raw type
   *     }
   * }
   * ```
   *
   * ### 10. **`restriction`**
   *
   * **Açıklama:** Bazı erişim kısıtlamaları veya kullanımıyla ilgili uyarıları bastırır.
   *
   * **Örnek:**
   *
   * ```java
   * public class MyClass {
   *     @SuppressWarnings("restriction")
   *     public void myMethod() {
   *         // access restricted API
   *     }
   * }
   * ```
   *
   * ### Özet
   *
   * - **`unchecked`**: Generics ile ilgili.
   * - **`deprecation`**: Eski metodlar ve sınıflar.
   * - **`unused`**: Kullanılmayan kodlar.
   * - **`rawtypes`**: Ham türler.
   * - **`serial`**: Serileştirme.
   * - **`nls`**: Uluslararasılaştırma.
   * - **`fallthrough`**: Switch-case düşüşleri.
   * - **`divzero`**: Sıfıra bölme.
   * - **`restriction`**: Erişim kısıtlamaları.
   *
   * Bu türleri kullanarak belirli uyarıları bastırabilir, ancak her zaman bu uyarıları dikkate almanız ve anlamanız önemlidir.
   */

  /**
   * Önemli Notlar
   * @SuppressWarnings kullanımı, yalnızca derleme uyarılarını gizler ve kodun davranışını etkilemez.
   * Bu anotasyonu kullanırken dikkatli olun. Uyarıları bastırmak, potansiyel sorunları gizleyebilir. Bu yüzden, sadece gerçekten gerekli olduğunda ve durumu anladığınızda kullanmalısınız.
   * Derleyici uyarılarını anlamak ve gidermek genellikle daha iyi bir yaklaşımdır, çünkü bu uyarılar genellikle kodunuzun kalitesini ve güvenliğini artırmaya yöneliktir.
   */
}
