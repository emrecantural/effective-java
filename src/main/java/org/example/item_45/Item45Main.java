package org.example.item_45;

public class Item45Main {
  /**
   *
   46. Java Streams Nedir? (Hangi Koşullarda Kullanmalıyım?)
   */

/**
 * Elbette, Java Streams API ile ilgili daha fazla örnek ve detay verebilirim. İşte çeşitli kullanım senaryoları ve örneklerle Streams API'yi kapsamlı bir şekilde açıklayacağım:
 *
 * ### 1. Temel Stream Operasyonları
 *
 * #### 1.1. Filtreleme
 *
 * **Örnek: Bir listedeki çift sayıları filtreleme.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
 *
 *         List<Integer> evenNumbers = numbers.stream()
 *             .filter(n -> n % 2 == 0)
 *             .collect(Collectors.toList());
 *
 *         System.out.println(evenNumbers); // Çıktı: [2, 4, 6]
 *     }
 * }
 * ```
 *
 * #### 1.2. Dönüştürme (Mapping)
 *
 * **Örnek: Bir listedeki sayıları karesine alma.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
 *
 *         List<Integer> squaredNumbers = numbers.stream()
 *             .map(n -> n * n)
 *             .collect(Collectors.toList());
 *
 *         System.out.println(squaredNumbers); // Çıktı: [1, 4, 9, 16]
 *     }
 * }
 * ```
 *
 * #### 1.3. Sıralama
 *
 * **Örnek: Bir listedeki sayıları artan sırada sıralama.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9);
 *
 *         List<Integer> sortedNumbers = numbers.stream()
 *             .sorted()
 *             .collect(Collectors.toList());
 *
 *         System.out.println(sortedNumbers); // Çıktı: [1, 3, 5, 8, 9]
 *     }
 * }
 * ```
 *
 * ### 2. Koleksiyonları Gruplama ve İstatistiksel İşlemler
 *
 * #### 2.1. Gruplama
 *
 * **Örnek: Bir listeyi çift ve tek sayılar olarak gruplama.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.Map;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
 *
 *         Map<String, List<Integer>> grouped = numbers.stream()
 *             .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
 *
 *         System.out.println(grouped); // Çıktı: {Odd=[1, 3, 5], Even=[2, 4, 6]}
 *     }
 * }
 * ```
 *
 * #### 2.2. İstatistiksel Veriler
 *
 * **Örnek: Bir listedeki sayıların toplamını, ortalamasını, maksimum ve minimum değerlerini bulma.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.IntSummaryStatistics;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
 *
 *         IntSummaryStatistics stats = numbers.stream()
 *             .mapToInt(Integer::intValue)
 *             .summaryStatistics();
 *
 *         System.out.println("Toplam: " + stats.getSum());         // Çıktı: 21
 *         System.out.println("Ortalama: " + stats.getAverage());    // Çıktı: 3.5
 *         System.out.println("Maksimum: " + stats.getMax());        // Çıktı: 6
 *         System.out.println("Minimum: " + stats.getMin());        // Çıktı: 1
 *     }
 * }
 * ```
 *
 * ### 3. İleri Düzey Kullanım
 *
 * #### 3.1. Zengin Veri Yapıları ile Çalışma
 *
 * **Örnek: Bir `Person` nesne listesinde yaşa göre sıralama ve yaş grubunu bulma.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.Map;
 * import java.util.Comparator;
 * import java.util.stream.Collectors;
 *
 * class Person {
 *     String name;
 *     int age;
 *
 *     Person(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 *
 *     public String getName() {
 *         return name;
 *     }
 *
 *     public int getAge() {
 *         return age;
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return name + " (" + age + ")";
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Person> people = Arrays.asList(
 *             new Person("Alice", 30),
 *             new Person("Bob", 25),
 *             new Person("Charlie", 35),
 *             new Person("Diana", 30)
 *         );
 *
 *         List<Person> sortedPeople = people.stream()
 *             .sorted(Comparator.comparingInt(Person::getAge))
 *             .collect(Collectors.toList());
 *
 *         sortedPeople.forEach(System.out::println); // Çıktı: Bob (25), Alice (30), Diana (30), Charlie (35)
 *     }
 * }
 * ```
 *
 * #### 3.2. Parallel Streams (Paralel Akışlar)
 *
 * **Örnek: Büyük veri setlerinde performansı artırmak için paralel akışlar kullanma.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 *
 *         List<Integer> squaredNumbers = numbers.parallelStream()
 *             .map(n -> n * n)
 *             .collect(Collectors.toList());
 *
 *         System.out.println(squaredNumbers); // Çıktı: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
 *     }
 * }
 * ```
 *
 * #### 3.3. FlatMap Kullanımı
 *
 * **Örnek: Listeler içindeki listeleri birleştirme.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<List<Integer>> listOfLists = Arrays.asList(
 *             Arrays.asList(1, 2, 3),
 *             Arrays.asList(4, 5, 6),
 *             Arrays.asList(7, 8, 9)
 *         );
 *
 *         List<Integer> flatList = listOfLists.stream()
 *             .flatMap(List::stream)
 *             .collect(Collectors.toList());
 *
 *         System.out.println(flatList); // Çıktı: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *     }
 * }
 * ```
 *
 * ### 4. Stream API ile Kaynakları Yönetme
 *
 * #### 4.1. Limit ve Skip
 *
 * **Örnek: Bir listedeki ilk 3 sayıyı seçme ve ardından ilk 3 sayıyı atlama.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
 *
 *         List<Integer> firstThree = numbers.stream()
 *             .limit(3)
 *             .collect(Collectors.toList());
 *
 *         List<Integer> skippedThree = numbers.stream()
 *             .skip(3)
 *             .collect(Collectors.toList());
 *
 *         System.out.println("İlk 3: " + firstThree); // Çıktı: [1, 2, 3]
 *         System.out.println("Atlanmış 3: " + skippedThree); // Çıktı: [4, 5, 6, 7, 8, 9]
 *     }
 * }
 * ```
 *
 * #### 4.2. Distinct (Benzersiz Elemanlar)
 *
 * **Örnek: Bir listedeki benzersiz sayıları alma.**
 *
 * ```java
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
 *
 *         List<Integer> distinctNumbers = numbers.stream()
 *             .distinct()
 *             .collect(Collectors.toList());
 *
 *         System.out.println(distinctNumbers); // Çıktı: [1, 2, 3, 4, 5]
 *     }
 * }
 * ```
 *
 * Bu örnekler, Java Streams API'nin geniş bir kullanım yelpazesini kapsar ve günlük programlama ihtiyaçlarınızda size yardımcı olabilir. Streams API, veri akışlarını işlemek için güçlü ve esnek bir araçtır, bu nedenle bu örnekleri uygulayarak daha fazla deneyim kazanabilirsiniz.
 */


}
