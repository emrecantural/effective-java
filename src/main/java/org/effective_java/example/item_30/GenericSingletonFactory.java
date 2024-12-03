package org.effective_java.example.item_30;

import java.util.function.UnaryOperator;

//Generic singleton factory pattern (Page 136-7)
public class GenericSingletonFactory {

  // Generic singleton factory pattern
  private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

  @SuppressWarnings("unchecked")
  public static <T> UnaryOperator<T> identityFunction() {
    return (UnaryOperator<T>) IDENTITY_FN;
  }

  // Sample program to exercise generic singleton
  public static void main(String[] args) {

    String[] strings = { "jute", "hemp", "nylon" };
    UnaryOperator<String> sameString = identityFunction();
    for (String s : strings)
      System.out.println(sameString.apply(s));

    Number[] numbers = { 1, 2.0, 3L };
    UnaryOperator<Number> sameNumber = identityFunction();
    for (Number n : numbers)
      System.out.println(sameNumber.apply(n));
  }
  /**
   * Java'da `E`, `T`, `K`, `V`, ve benzeri tek harfli tür adları, genellikle generic (genel) programlamada kullanılır. Generic türler, tür güvenliğini artırmak ve kodun tekrarını azaltmak için kullanılır. İşte bu harflerin genel anlamları ve kullanım örnekleri:
   *
   * ### 1. **E (Element)**
   *
   * **Kullanım Alanı:**
   * - Genellikle koleksiyon sınıflarında, özellikle `List`, `Set`, ve `Queue` gibi veri yapılarında, eleman türünü temsil eder.
   *
   * **Örnek:**
   *
   * ```java
   * import java.util.ArrayList;
   * import java.util.List;
   *
   * public class Example {
   *     public static void main(String[] args) {
   *         List<String> stringList = new ArrayList<>();
   *         stringList.add("Hello");
   *         stringList.add("World");
   *
   *         for (String element : stringList) {
   *             System.out.println(element);
   *         }
   *     }
   * }
   * ```
   *
   * Burada `E` yerini `String` alır ve `List<String>` ile belirtilir.
   *
   * ### 2. **T (Type)**
   *
   * **Kullanım Alanı:**
   * - Genellikle türü temsil eden generic parametreler için kullanılır. Özellikle sınıf ve metodlarda, herhangi bir türü temsil etmek için kullanılır.
   *
   * **Örnek:**
   *
   * ```java
   * public class Box<T> {
   *     private T value;
   *
   *     public void set(T value) {
   *         this.value = value;
   *     }
   *
   *     public T get() {
   *         return value;
   *     }
   *
   *     public static void main(String[] args) {
   *         Box<Integer> integerBox = new Box<>();
   *         integerBox.set(10);
   *         System.out.println(integerBox.get()); // Çıktı: 10
   *
   *         Box<String> stringBox = new Box<>();
   *         stringBox.set("Hello");
   *         System.out.println(stringBox.get()); // Çıktı: Hello
   *     }
   * }
   * ```
   *
   * Burada `T` yerini `Integer` veya `String` gibi belirli türlerle değiştirilebilir.
   *
   * ### 3. **K (Key) ve V (Value)**
   *
   * **Kullanım Alanı:**
   * - Genellikle `Map` gibi anahtar-değer (key-value) yapılarında kullanılır. `K`, anahtarın türünü ve `V`, değerin türünü temsil eder.
   *
   * **Örnek:**
   *
   * ```java
   * import java.util.HashMap;
   * import java.util.Map;
   *
   * public class Example {
   *     public static void main(String[] args) {
   *         Map<String, Integer> ageMap = new HashMap<>();
   *         ageMap.put("Alice", 30);
   *         ageMap.put("Bob", 25);
   *
   *         for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
   *             System.out.println(entry.getKey() + ": " + entry.getValue());
   *         }
   *     }
   * }
   * ```
   *
   * Burada `K` yerini `String` alır ve `V` yerini `Integer` alır, böylece `Map<String, Integer>` türünde bir harita oluşturulur.
   *
   * ### 4. **N (Number) ve Diğer Harfler**
   *
   * - **N (Number)**: Genellikle sayı türlerini temsil etmek için kullanılır, ancak Java'nın standart kütüphanesinde sıklıkla bulunmaz.
   * - **U, X, S** ve diğer harfler genellikle daha az standartlaştırılmıştır ve daha özelleşmiş durumlarda kullanılır.
   *
   * ### Generic Sınıf ve Metod Kullanımı
   *
   * **Generic Sınıf:**
   *
   * ```java
   * public class Pair<K, V> {
   *     private K key;
   *     private V value;
   *
   *     public Pair(K key, V value) {
   *         this.key = key;
   *         this.value = value;
   *     }
   *
   *     public K getKey() {
   *         return key;
   *     }
   *
   *     public V getValue() {
   *         return value;
   *     }
   *
   *     public static void main(String[] args) {
   *         Pair<String, Integer> pair = new Pair<>("Age", 30);
   *         System.out.println(pair.getKey() + ": " + pair.getValue()); // Çıktı: Age: 30
   *     }
   * }
   * ```
   *
   * **Generic Metod:**
   *
   * ```java
   * public class GenericMethodExample {
   *     public static <T> void printArray(T[] array) {
   *         for (T element : array) {
   *             System.out.println(element);
   *         }
   *     }
   *
   *     public static void main(String[] args) {
   *         Integer[] intArray = {1, 2, 3};
   *         String[] strArray = {"Apple", "Banana", "Cherry"};
   *
   *         printArray(intArray); // Çıktı: 1 2 3
   *         printArray(strArray); // Çıktı: Apple Banana Cherry
   *     }
   * }
   * ```
   *
   * ### **Özet**
   *
   * - `E` (Element), `T` (Type), `K` (Key), ve `V` (Value) gibi harfler generic tür parametrelerini temsil eder.
   * - **`E`** genellikle koleksiyonlarda, **`T`** herhangi bir türde kullanılabilir, **`K`** ve **`V`** genellikle `Map` yapılarında kullanılır.
   * - Generic sınıflar ve metodlar, tür güvenliğini artırarak kodun yeniden kullanılabilirliğini ve okunabilirliğini sağlar.
   *
   * Bu tür kullanımları, kodunuzda esneklik ve genel geçerlik sağlamanın yanı sıra, tür güvenliğini de artırır.
   *
   *
   *
   *
   *
   * Evet, Java'da generic programlama yaparken kullanılan bazı standart kısayol harfleri dışında daha fazla generic tür parametresi de vardır. Ancak, genellikle kullanılan harfler `E`, `T`, `K`, `V` gibi yaygın olanlardır. İşte bazı ek generic tür parametreleri ve kullanıldıkları alanlar:
   *
   * ### 1. **U, X, Y, Z**
   *
   * - **U**, **X**, **Y**, **Z** gibi harfler genellikle generic parametrelerin yerine kullanılan başka harflerdir. Bu harfler, `T`, `K`, `V` gibi standart harflerden farklı olarak daha genel veya özel durumlarda kullanılabilir.
   *
   * **Örnek Kullanım:**
   *
   * ```java
   * public class Triple<U, X, Y> {
   *     private U first;
   *     private X second;
   *     private Y third;
   *
   *     public Triple(U first, X second, Y third) {
   *         this.first = first;
   *         this.second = second;
   *         this.third = third;
   *     }
   *
   *     public U getFirst() {
   *         return first;
   *     }
   *
   *     public X getSecond() {
   *         return second;
   *     }
   *
   *     public Y getThird() {
   *         return third;
   *     }
   *
   *     public static void main(String[] args) {
   *         Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
   *         System.out.println(triple.getFirst());  // Çıktı: Hello
   *         System.out.println(triple.getSecond()); // Çıktı: 42
   *         System.out.println(triple.getThird());  // Çıktı: 3.14
   *     }
   * }
   * ```
   *
   * ### 2. **R, T1, T2, T3**
   *
   * - **R**: Genellikle dönüş türünü temsil etmek için kullanılır, özellikle methodlarda kullanılır.
   * - **T1, T2, T3**: Genellikle çoklu generic parametreler için kullanılır.
   *
   * **Örnek Kullanım:**
   *
   * ```java
   * public class Result<R> {
   *     private R result;
   *
   *     public Result(R result) {
   *         this.result = result;
   *     }
   *
   *     public R getResult() {
   *         return result;
   *     }
   *
   *     public static void main(String[] args) {
   *         Result<String> result = new Result<>("Success");
   *         System.out.println(result.getResult()); // Çıktı: Success
   *     }
   * }
   * ```
   *
   * **Kullanım Örneği - Çoklu Generic Parametreler:**
   *
   * ```java
   * public class Quadruple<T1, T2, T3, T4> {
   *     private T1 first;
   *     private T2 second;
   *     private T3 third;
   *     private T4 fourth;
   *
   *     public Quadruple(T1 first, T2 second, T3 third, T4 fourth) {
   *         this.first = first;
   *         this.second = second;
   *         this.third = third;
   *         this.fourth = fourth;
   *     }
   *
   *     // Getter'lar ve diğer metodlar
   *
   *     public static void main(String[] args) {
   *         Quadruple<String, Integer, Double, Boolean> quadruple = new Quadruple<>("Text", 123, 4.56, true);
   *         System.out.println(quadruple.first);  // Çıktı: Text
   *         System.out.println(quadruple.second); // Çıktı: 123
   *         System.out.println(quadruple.third);  // Çıktı: 4.56
   *         System.out.println(quadruple.fourth); // Çıktı: true
   *     }
   * }
   * ```
   *
   * ### 3. **S (Specific)**
   *
   * - **S**: Genellikle daha özel türleri temsil etmek için kullanılır, ancak bu genellikle daha az yaygındır ve genellikle genel `T` yerine kullanılır.
   *
   * ### 4. **P (Parameter)**
   *
   * - **P**: Özellikle metod parametreleri veya yapılandırıcı parametreleri için kullanılabilir.
   *
   * **Örnek Kullanım:**
   *
   * ```java
   * public class ParameterizedClass<P> {
   *     private P parameter;
   *
   *     public ParameterizedClass(P parameter) {
   *         this.parameter = parameter;
   *     }
   *
   *     public P getParameter() {
   *         return parameter;
   *     }
   *
   *     public static void main(String[] args) {
   *         ParameterizedClass<String> instance = new ParameterizedClass<>("Generic Parameter");
   *         System.out.println(instance.getParameter()); // Çıktı: Generic Parameter
   *     }
   * }
   * ```
   *
   * ### **Genel Kullanım İpuçları**
   *
   * - **Generic parametre isimlendirmede standart**: Genellikle `T`, `E`, `K`, `V` gibi standart isimler kullanılır, çünkü bunlar yaygın olarak kabul görmüş ve anlaşılır kısayollardır.
   * - **Özel ihtiyaçlara göre harf seçimi**: İhtiyaçlarınıza göre daha özel isimler de kullanabilirsiniz, ancak bu isimlerin ne anlama geldiğini açıklamak önemlidir.
   *
   * Java generic tür parametreleri kullanırken, kodun anlaşılabilirliğini ve bakımını kolaylaştırmak için anlamlı ve açıklayıcı isimler seçmek önemlidir. Bu, kodun okunabilirliğini ve başkalarının kodunuzu anlamasını kolaylaştırır.
   */
}