package org.example.item_36;

import java.util.*;

//EnumSet - a modern replacement for bit fields (Page 170)
public class Text {

  public enum Style {
    BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
  }

  // Any Set could be passed in, but EnumSet is clearly best
  public void applyStyles(Set<Style> styles) {
    System.out.printf("Applying styles %s to text%n", Objects.requireNonNull(styles));
  }

  // Sample use
  public static void main(String[] args) {
    Text text = new Text();
    text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC, Style.BOLD)); //Setin güzel yanı boldu iki kez eklememiş olacak
  }
/**
 * Java'da `EnumSet`, Java'nın koleksiyon framework'ünde yer alan özel bir `Set` implementasyonudur. Bu, `Enum` türündeki sabitler (enum constants) için optimize edilmiş bir set yapısıdır. `EnumSet`, performans açısından verimlidir ve enum değerleri arasında hızlıca arama, ekleme ve silme işlemleri gerçekleştirebilir.
 *
 * ### Temel Özellikler
 *
 * 1. **Enum Spesifik:** `EnumSet`, yalnızca enum türleri ile çalışabilir. Bu, onu genel `Set` implementasyonlarından ayırır. Diğer türlerle çalışmaz.
 *
 * 2. **Performans:** `EnumSet`, enum sabitleri üzerinde bit alanları kullanarak yüksek performans sağlar. Bu sayede `HashSet` veya `TreeSet` gibi diğer set türlerine göre daha hızlı olabilir.
 *
 * 3. **Kapsam:** `EnumSet` tüm enum sabitlerini destekler ve bir enum türündeki tüm sabitleri saklayabilir. Ayrıca, belirli bir enum türünün tüm sabitlerini içeren bir set oluşturmak mümkündür.
 *
 * 4. **Boş Olma:** `EnumSet`, boş setlerle oluşturulabilir ve bu setler ayrıca belirli bir enum türünün tüm sabitlerini içerecek şekilde doldurulabilir.
 *
 * ### Kullanım Örnekleri
 *
 * Aşağıda, bir `Enum` türü ve bu türle `EnumSet` kullanımını gösteren bir örnek bulunmaktadır.
 *
 * ```java
 * import java.util.EnumSet;
 *
 * enum Day {
 *     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 * }
 *
 * public class EnumSetExample {
 *     public static void main(String[] args) {
 *         // Tüm hafta içi günleri içeren bir EnumSet oluşturma
 *         EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
 *
 *         // Tüm hafta sonu günlerini içeren bir EnumSet oluşturma
 *         EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
 *
 *         // Tüm günleri içeren bir EnumSet oluşturma
 *         EnumSet<Day> allDays = EnumSet.allOf(Day.class);
 *
 *         System.out.println("Weekdays: " + weekdays);
 *         System.out.println("Weekend: " + weekend);
 *         System.out.println("All Days: " + allDays);
 *     }
 * }
 * ```
 *
 * Bu kodda:
 * - `EnumSet.of()` metodu ile belirli enum sabitlerinden oluşan bir set oluşturulmuştur.
 * - `EnumSet.allOf()` metodu ile belirtilen enum türündeki tüm sabitleri içeren bir set oluşturulmuştur.
 *
 * ### Özet
 *
 * `EnumSet`, enum türleri ile çalışırken etkili ve verimli bir `Set` implementasyonudur. Performans avantajları ve kullanım kolaylığı nedeniyle enum türleriyle çalışma için ideal bir seçimdir.
 */
}
