package org.effective_java.example.item_14;

import java.util.ArrayList;
import java.util.Collections;

public class Item14Main {
  /**
   * Java Comparable - Comparator Interface
   */

  public static void main(String[] args) {

    /**
     *  Comparable<Kitap>
     */
    ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();

    kitapListesi.add(new Kitap("Şibumi", 500));
    kitapListesi.add(new Kitap("Otomatik Portakal", 200));
    kitapListesi.add(new Kitap("Ab", 200));

    Collections.sort(kitapListesi);  //kullanabilmek için comparable yazılmalıdır. Çünkü neye göre sıraladığını vermek için.


    System.out.println("Sıralama1");
    for (Kitap kitap : kitapListesi) {
      System.out.println(kitap.toString());
      /**
       * Sıralama1
       * Kitap [isim=Otomatik Portakal, sayfa=200]
       * Kitap [isim=Ab, sayfa=200]
       * Kitap [isim=Şibumi, sayfa=500]
       */
    }

    // Sıralama 2
    /**
     *  Comparator<Kitap>
     *
     *    Aynı şekilde impelement edilir.
     */
    System.out.println("Sıralama2");
    IsımKıyaslama ismeGöre = new IsımKıyaslama();
    Collections.sort(kitapListesi, ismeGöre); //Burada iki farklı metot alıyor. Sen iki metodun alanlarına göre compare istersen buradan yapabilirsin.
    for (Kitap kitap : kitapListesi) {
      System.out.println(kitap.toString());
    } /**
     Çoklu alan eşitliğinde de kullanılır
     /**
     * Sıralama2
     * Kitap [isim=Ab, sayfa=200]
     * Kitap [isim=Otomatik Portakal, sayfa=200]
     * Kitap [isim=Şibumi, sayfa=500]
     */


    /**
     * Ne zaman hangisi:
     *
     * Hep sayfaya göre değişmeyecek şeye göre sıralaycaksak compare
     */
  }
/**
 * A comparison function, which imposes a total ordering on some collection of objects. Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order. Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps), or to provide an ordering for collections of objects that don't have a natural ordering.
 * The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.
 * Caution should be exercised when using a comparator capable of imposing an ordering inconsistent with equals to order a sorted set (or sorted map). Suppose a sorted set (or sorted map) with an explicit comparator c is used with elements (or keys) drawn from a set S. If the ordering imposed by c on S is inconsistent with equals, the sorted set (or sorted map) will behave "strangely." In particular the sorted set (or sorted map) will violate the general contract for set (or map), which is defined in terms of equals.
 * For example, suppose one adds two elements a and b such that (a.equals(b) && c.compare(a, b) != 0) to an empty TreeSet with comparator c. The second add operation will return true (and the size of the tree set will increase) because a and b are not equivalent from the tree set's perspective, even though this is contrary to the specification of the Set.add method.
 * Note: It is generally a good idea for comparators to also implement java.io.Serializable, as they may be used as ordering methods in serializable data structures (like TreeSet, TreeMap). In order for the data structure to serialize successfully, the comparator (if provided) must implement Serializable.
 * For the mathematically inclined, the relation that defines the imposed ordering that a given comparator c imposes on a given set of objects S is:
 *         {(x, y) such that c.compare(x, y) <= 0}.
 *
 * The quotient for this total order is:
 *         {(x, y) such that c.compare(x, y) == 0}.
 *
 * It follows immediately from the contract for compare that the quotient is an equivalence relation on S, and that the imposed ordering is a total order on S. When we say that the ordering imposed by c on S is consistent with equals, we mean that the quotient for the ordering is the equivalence relation defined by the objects' equals(Object) method(s):
 *       {(x, y) such that x.equals(y)}.
 * Unlike Comparable, a comparator may optionally permit comparison of null arguments, while maintaining the requirements for an equivalence relation.
 * This interface is a member of the Java Collections Framework.
 * Since:
 * 1.2
 * See Also:
 * Comparable, Serializable
 * Author:
 * Josh Bloch, Neal Gafter
 */


/**
 * This interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
 * Lists (and arrays) of objects that implement this interface can be sorted automatically by Collections.sort (and Arrays.sort). Objects that implement this interface can be used as keys in a sorted map or as elements in a sorted set, without the need to specify a comparator.
 * The natural ordering for a class C is said to be consistent with equals if and only if e1.compareTo(e2) == 0 has the same boolean value as e1.equals(e2) for every e1 and e2 of class C. Note that null is not an instance of any class, and e.compareTo(null) should throw a NullPointerException even though e.equals(null) returns false.
 * It is strongly recommended (though not required) that natural orderings be consistent with equals. This is so because sorted sets (and sorted maps) without explicit comparators behave "strangely" when they are used with elements (or keys) whose natural ordering is inconsistent with equals. In particular, such a sorted set (or sorted map) violates the general contract for set (or map), which is defined in terms of the equals method.
 * For example, if one adds two keys a and b such that (!a.equals(b) && a.compareTo(b) == 0) to a sorted set that does not use an explicit comparator, the second add operation returns false (and the size of the sorted set does not increase) because a and b are equivalent from the sorted set's perspective.
 * Virtually all Java core classes that implement Comparable have natural orderings that are consistent with equals. One exception is java.math.BigDecimal, whose natural ordering equates BigDecimal objects with equal values and different precisions (such as 4.0 and 4.00).
 * For the mathematically inclined, the relation that defines the natural ordering on a given class C is:
 *  {(x, y) such that x.compareTo(y) <= 0}.
 * The quotient for this total order is:
 *  {(x, y) such that x.compareTo(y) == 0}.
 * It follows immediately from the contract for compareTo that the quotient is an equivalence relation on C, and that the natural ordering is a total order on C. When we say that a class's natural ordering is consistent with equals, we mean that the quotient for the natural ordering is the equivalence relation defined by the class's equals(Object) method:
 *       {(x, y) such that x.equals(y)}.
 * This interface is a member of the Java Collections Framework.
 * Since:
 * 1.2
 * See Also:
 * Comparator
 * Author:
 * Josh Bloch
 */


/**
 *comparable ve Comparator nasıl kullanılır ne işe yarar hangi durumlarda tercih etmeliyim. Java
 * ChatGPT
 * Java'da sıralama ve karşılaştırma işlemlerini yönetmek için Comparable ve Comparator arayüzleri kullanılır. Bu iki arayüz, koleksiyonlar üzerinde sıralama yapabilmenizi sağlar, ancak farklı kullanım senaryolarına göre tasarlanmışlardır.
 *
 * Comparable Arayüzü
 * Tanım
 * Comparable arayüzü, bir nesnenin kendisini diğer nesnelerle karşılaştırabilmesini sağlar. Bu arayüzü uygulayan bir sınıf, kendi karşılaştırma mantığını sağlar.
 *
 * Kullanım
 * Comparable arayüzü, compareTo(T o) yöntemini içerir. Bu yöntem, iki nesnenin karşılaştırılmasını ve sıralama düzeninin belirlenmesini sağlar.
 * Genellikle nesnenin doğal sıralamasını tanımlamak için kullanılır.
 * Örnek
 * Bir Person sınıfı oluşturduğunuzu düşünelim ve kişileri yaşlarına göre sıralamak istiyorsunuz:
 *
 * java
 * Kodu kopyala
 * public class Person implements Comparable<Person> {
 *     private String name;
 *     private int age;
 *
 *     public Person(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 *
 *     @Override
 *     public int compareTo(Person other) {
 *         return Integer.compare(this.age, other.age);
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return name + " (" + age + ")";
 *     }
 *
 *     // getters and setters
 * }
 * Kullanım:
 *
 * java
 * Kodu kopyala
 * List<Person> people = new ArrayList<>();
 * people.add(new Person("Alice", 30));
 * people.add(new Person("Bob", 25));
 *
 * Collections.sort(people);  // Bu, Person nesnelerini yaşlarına göre sıralar
 * System.out.println(people);
 * Comparator Arayüzü
 * Tanım
 * Comparator arayüzü, bir nesnenin başka bir nesneyle nasıl karşılaştırılacağını tanımlamak için kullanılır. Bu, nesneleri sıralamak için dışarıdan bir karşılaştırma stratejisi sağlamanızı sağlar.
 *
 * Kullanım
 * Comparator arayüzü, compare(T o1, T o2) yöntemini içerir. Bu yöntem, iki nesneyi karşılaştırarak sıralama düzenini belirler.
 * Genellikle, nesnenin doğal sıralamasını değiştirmek veya ek sıralama kriterleri sağlamak için kullanılır.
 * Örnek
 * Örneğin, Person sınıfını yaş dışında başka bir kritere göre sıralamak istiyorsunuz:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class NameComparator implements Comparator<Person> {
 *     @Override
 *     public int compare(Person p1, Person p2) {
 *         return p1.getName().compareTo(p2.getName());
 *     }
 * }
 * Kullanım:
 *
 * java
 * Kodu kopyala
 * List<Person> people = new ArrayList<>();
 * people.add(new Person("Alice", 30));
 * people.add(new Person("Bob", 25));
 *
 * Collections.sort(people, new NameComparator());  // Bu, Person nesnelerini isimlerine göre sıralar
 * System.out.println(people);
 * Karşılaştırma ve Kullanım Senaryoları
 * Comparable Kullanımı:
 *
 * Bir nesnenin doğal sıralamasını belirlemek için uygundur.
 * Sınıf içinde compareTo yöntemini implement ederek doğal sıralama mantığını kodlayabilirsiniz.
 * Comparator Kullanımı:
 *
 * Farklı sıralama kriterleri sağlamak için uygundur.
 * Nesnenin doğal sıralamasını değiştirmek veya birden fazla sıralama kriteri kullanmak istiyorsanız Comparator kullanabilirsiniz.
 * Her iki arayüzün de kendi avantajları vardır ve genellikle birlikte kullanılırlar. Comparable, nesnenin kendisini diğer nesnelerle karşılaştırmasını sağlar, Comparator ise dışarıdan ek sıralama kriterleri eklemenize imkan tanır.
 */

/**
 * Comparator  için daha geniş bir örnek verir misin
 * ChatGPT
 * Tabii! Comparator kullanarak daha geniş bir örnek yapalım. Örneğin, bir Employee sınıfımız olsun ve bu sınıfı birkaç farklı kritere göre sıralamak isteyelim: maaş, yaş ve isim. Comparator arayüzünü kullanarak bu farklı sıralama kriterlerini nasıl uygulayabileceğimizi göstereceğim.
 *
 * Employee Sınıfı
 * Öncelikle Employee sınıfını tanımlayalım:
 *
 * java
 * Kodu kopyala
 * public class Employee {
 *     private String name;
 *     private int age;
 *     private double salary;
 *
 *     public Employee(String name, int age, double salary) {
 *         this.name = name;
 *         this.age = age;
 *         this.salary = salary;
 *     }
 *
 *     // Getters
 *     public String getName() { return name; }
 *     public int getAge() { return age; }
 *     public double getSalary() { return salary; }
 *
 *     @Override
 *     public String toString() {
 *         return name + " (Age: " + age + ", Salary: $" + salary + ")";
 *     }
 * }
 * Comparator İmplementasyonları
 * Maaş Göre Sıralama (SalaryComparator)
 *
 * Maaşlarına göre sıralama yapacak bir Comparator:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class SalaryComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return Double.compare(e1.getSalary(), e2.getSalary());
 *     }
 * }
 * Yaş Göre Sıralama (AgeComparator)
 *
 * Yaşlarına göre sıralama yapacak bir Comparator:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class AgeComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return Integer.compare(e1.getAge(), e2.getAge());
 *     }
 * }
 * İsme Göre Sıralama (NameComparator)
 *
 * İsimlerine göre sıralama yapacak bir Comparator:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class NameComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return e1.getName().compareTo(e2.getName());
 *     }
 * }
 * Kullanım
 * Şimdi bu Comparator'ları kullanarak bir listeyi farklı kriterlere göre sıralayalım:
 *
 * java
 * Kodu kopyala
 * import java.util.ArrayList;
 * import java.util.Collections;
 * import java.util.List;
 *
 * public class ComparatorExample {
 *     public static void main(String[] args) {
 *         List<Employee> employees = new ArrayList<>();
 *         employees.add(new Employee("Alice", 30, 60000));
 *         employees.add(new Employee("Bob", 25, 50000));
 *         employees.add(new Employee("Charlie", 35, 70000));
 *         employees.add(new Employee("David", 28, 55000));
 *
 *         System.out.println("Original list:");
 *         System.out.println(employees);
 *
 *         // Maaşa göre sıralama
 *         Collections.sort(employees, new SalaryComparator());
 *         System.out.println("\nSorted by salary:");
 *         System.out.println(employees);
 *
 *         // Yaşa göre sıralama
 *         Collections.sort(employees, new AgeComparator());
 *         System.out.println("\nSorted by age:");
 *         System.out.println(employees);
 *
 *         // İseme göre sıralama
 *         Collections.sort(employees, new NameComparator());
 *         System.out.println("\nSorted by name:");
 *         System.out.println(employees);
 *     }
 * }
 * Çıktı
 * php
 * Kodu kopyala
 * Original list:
 * [Alice (Age: 30, Salary: $60000.0), Bob (Age: 25, Salary: $50000.0), Charlie (Age: 35, Salary: $70000.0), David (Age: 28, Salary: $55000.0)]
 *
 * Sorted by salary:
 * [Bob (Age: 25, Salary: $50000.0), David (Age: 28, Salary: $55000.0), Alice (Age: 30, Salary: $60000.0), Charlie (Age: 35, Salary: $70000.0)]
 *
 * Sorted by age:
 * [Bob (Age: 25, Salary: $50000.0), David (Age: 28, Salary: $55000.0), Alice (Age: 30, Salary: $60000.0), Charlie (Age: 35, Salary: $70000.0)]
 *
 * Sorted by name:
 * [Alice (Age: 30, Salary: $60000.0), Bob (Age: 25, Salary: $50000.0), Charlie (Age: 35, Salary: $70000.0), David (Age: 28, Salary: $55000.0)]
 * Bu örnekte Comparator arayüzü kullanarak Employee nesnelerini farklı kriterlere göre sıraladık. Her bir Comparator sınıfı, sıralama için farklı bir strateji sağladı ve Collections.sort() yöntemi bu stratejileri kullanarak sıralama işlemini gerçekleştirdi. Bu yaklaşım, sıralama kriterlerinizi belirlemede esneklik sağlar ve kodunuzu daha düzenli hale getirir.
 */


/**
 * hepsine göre sıralamak istesem
 * ChatGPT
 * Bir Employee listesini birden fazla kritere göre sıralamak istiyorsanız, Comparator'ları zincirleme yaparak birden fazla sıralama kriterini aynı anda uygulayabilirsiniz. Java Comparator arayüzü, birden fazla Comparator'ı birleştirmek için thenComparing yöntemini sağlar.
 *
 * Aşağıda, bir Employee listesini önce maaşa göre, sonra yaşa göre ve son olarak isme göre sıralayan bir örnek gösteriyorum. Bu sıralama öncelikli olarak maaş, sonra yaş ve son olarak isim kriterlerine göre yapılır.
 *
 * Employee Sınıfı
 * Öncelikle Employee sınıfı:
 *
 * java
 * Kodu kopyala
 * public class Employee {
 *     private String name;
 *     private int age;
 *     private double salary;
 *
 *     public Employee(String name, int age, double salary) {
 *         this.name = name;
 *         this.age = age;
 *         this.salary = salary;
 *     }
 *
 *     // Getters
 *     public String getName() { return name; }
 *     public int getAge() { return age; }
 *     public double getSalary() { return salary; }
 *
 *     @Override
 *     public String toString() {
 *         return name + " (Age: " + age + ", Salary: $" + salary + ")";
 *     }
 * }
 * Comparator İmplementasyonları
 * Maaş Comparator'ı (SalaryComparator)
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class SalaryComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return Double.compare(e1.getSalary(), e2.getSalary());
 *     }
 * }
 * Yaş Comparator'ı (AgeComparator)
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class AgeComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return Integer.compare(e1.getAge(), e2.getAge());
 *     }
 * }
 * İsim Comparator'ı (NameComparator)
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class NameComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return e1.getName().compareTo(e2.getName());
 *     }
 * }
 * Tüm Kriterlere Göre Sıralama
 * Bir Comparator zinciri oluşturarak tüm kriterlere göre sıralama yapabiliriz. Bu durumda sıralama önceliği sırasıyla maaş, yaş ve isim olacaktır.
 *
 * java
 * Kodu kopyala
 * import java.util.ArrayList;
 * import java.util.Collections;
 * import java.util.Comparator;
 * import java.util.List;
 *
 * public class MultiCriteriaSortingExample {
 *     public static void main(String[] args) {
 *         List<Employee> employees = new ArrayList<>();
 *         employees.add(new Employee("Alice", 30, 60000));
 *         employees.add(new Employee("Bob", 25, 50000));
 *         employees.add(new Employee("Charlie", 35, 70000));
 *         employees.add(new Employee("David", 28, 55000));
 *         employees.add(new Employee("Alice", 30, 55000));  // Aynı isimli fakat farklı maaş ve yaş
 *
 *         System.out.println("Original list:");
 *         System.out.println(employees);
 *
 *         // Comparator'ları zincirleme
 *         Comparator<Employee> combinedComparator = new SalaryComparator()
 *             .thenComparing(new AgeComparator())
 *             .thenComparing(new NameComparator());
 *
 *         // Listeyi sıralama
 *         Collections.sort(employees, combinedComparator);
 *
 *         System.out.println("\nSorted by salary, age, and name:");
 *         System.out.println(employees);
 *     }
 * }
 * Çıktı
 * php
 * Kodu kopyala
 * Original list:
 * [Alice (Age: 30, Salary: $60000.0), Bob (Age: 25, Salary: $50000.0), Charlie (Age: 35, Salary: $70000.0), David (Age: 28, Salary: $55000.0), Alice (Age: 30, Salary: $55000.0)]
 *
 * Sorted by salary, age, and name:
 * [Bob (Age: 25, Salary: $50000.0), David (Age: 28, Salary: $55000.0), Alice (Age: 30, Salary: $55000.0), Alice (Age: 30, Salary: $60000.0), Charlie (Age: 35, Salary: $70000.0)]
 * Açıklama
 * Maaş: Öncelikli olarak maaş değerlerine göre sıralama yapılır.
 * Yaş: Eğer maaş değerleri eşitse, yaşlarına göre sıralama yapılır.
 * İsim: Eğer maaş ve yaş değerleri eşitse, isimlerine göre sıralama yapılır.
 * Bu yöntemle, çoklu sıralama kriterlerini birleştirerek koleksiyonları karmaşık sıralama mantıklarıyla düzenleyebilirsiniz. Comparator'ların thenComparing yöntemi, sıralama kriterlerini öncelik sırasına göre uygulamanıza olanak tanır.
 */

/**
 * Comparator arayüzündeki compare yöntemi genellikle iki nesneyi karşılaştırmak için kullanılır ve bu iki nesnenin aynı türde olması beklenir. Bu nedenle, compare yöntemi genellikle şu şekilde tanımlanır:
 *
 * java
 * Kodu kopyala
 * int compare(T o1, T o2);
 * Burada T, karşılaştırılan nesnelerin türünü temsil eder. Örneğin, Employee sınıfı için, compare yönteminin imzası şu şekilde olacaktır:
 *
 * java
 * Kodu kopyala
 * public int compare(Employee e1, Employee e2);
 * Bu, compare yönteminin iki Employee nesnesini karşılaştırmak için tasarlandığı anlamına gelir.
 *
 * Diğer Türlerle Karşılaştırma
 * Ancak, Comparator arayüzü genel bir arayüzdür ve farklı türler arasında karşılaştırma yapabilen bir Comparator oluşturmak mümkündür. Bununla birlikte, karşılaştırma yapılacak nesnelerin türü, Comparator'ın tür parametresiyle uyumlu olmalıdır.
 *
 * Örnek: Farklı Türlerde Karşılaştırma
 * Diyelim ki bir Comparator oluşturmak istiyorsunuz ve karşılaştırmak istediğiniz nesneler Employee yerine başka bir türde. Bu durumda, Comparator'ı bu tür için tanımlamalısınız. Örneğin:
 *
 * Employee ve String Karşılaştırması
 *
 * Employee nesnelerinin isimlerini String karşılaştırması kullanarak sıralamak isteyebilirsiniz. Bu durumda Comparator'ınızı şöyle tanımlayabilirsiniz:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class EmployeeNameComparator implements Comparator<Employee> {
 *     @Override
 *     public int compare(Employee e1, Employee e2) {
 *         return e1.getName().compareTo(e2.getName());
 *     }
 * }
 * Birden Fazla Türle Karşılaştırma
 *
 * Farklı türlerde karşılaştırmalar yapabilmek için, genellikle her tür için ayrı Comparator'lar tanımlanır. Comparator'ın compare yöntemi yalnızca aynı türdeki nesnelerle çalışabilir.
 *
 * Örneğin, Comparator'ı Integer ve Double türlerinde karşılaştırmak için ayrı Comparator sınıfları kullanabilirsiniz:
 *
 * java
 * Kodu kopyala
 * import java.util.Comparator;
 *
 * public class IntegerComparator implements Comparator<Integer> {
 *     @Override
 *     public int compare(Integer i1, Integer i2) {
 *         return Integer.compare(i1, i2);
 *     }
 * }
 *
 * public class DoubleComparator implements Comparator<Double> {
 *     @Override
 *     public int compare(Double d1, Double d2) {
 *         return Double.compare(d1, d2);
 *     }
 * }
 * Comparator'ın Esneklikleri
 * Java'da, Comparator'ın esnekliği, çoklu türlerde karşılaştırma yapabilmenizi sağlar. Ancak, her Comparator yalnızca belirli bir türdeki nesneleri karşılaştırmak için tasarlanmıştır. Comparator'ları kullanarak türler arası karşılaştırmalar yapmak yerine, genellikle aynı türde nesnelerle çalışılır.
 *
 * Bu nedenle, public int compare(Employee e1, Employee e2) yöntemi yalnızca Employee türündeki nesnelerle çalışmalıdır. Eğer başka türlerde karşılaştırma yapmak istiyorsanız, uygun türler için ayrı Comparator sınıfları tanımlamanız gerekecektir.
 */
}
