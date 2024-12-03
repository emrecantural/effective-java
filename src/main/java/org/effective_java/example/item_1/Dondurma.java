package org.effective_java.example.item_1;

public class Dondurma extends Yemek {

  /*
    Overloading (Aşırı Yükleme) ve Overriding (Geçersiz Kılma) kavramları, nesne yönelimli programlama (OOP) dillerinde önemli rol oynayan iki farklı yöntemdir. İşte bu kavramların Java'daki kullanımları ve aralarındaki farklar:

    Method Overloading (Metod Aşırı Yükleme)
    Metod aşırı yükleme, aynı sınıf içinde aynı isimde birden fazla metod tanımlamaktır, ancak bu metodlar farklı parametre listelerine sahip olmalıdır. Bu, metotların farklı görevler gerçekleştirmesine olanak tanır.

    Özellikler:
    Aynı Metod Adı: Aynı metod adı kullanılır, ancak farklı parametre listeleri ile.
    Parametre Sayısı ve Tipleri: Metodların parametre sayısı veya parametrelerin veri tipleri farklı olmalıdır.
    Geri Dönüş Tipi: Geri dönüş tipi aşırı yüklemede önemli değildir; metod imzası parametreler tarafından belirlenir.
    Örnek:
    java
    Kodu kopyala
    public class MathUtils {
        // İki integer parametre alan metod
        public int add(int a, int b) {
            return a + b;
        }

        // Üç integer parametre alan metod
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // İki double parametre alan metod
        public double add(double a, double b) {
            return a + b;
        }
    }
    Method Overriding (Metod Geçersiz Kılma)
    Metod geçersiz kılma, bir alt sınıfın, üst sınıfında tanımlanmış bir metodu kendi ihtiyaçlarına göre yeniden tanımlamasıdır. Bu, polimorfizm (çok biçimlilik) kavramının bir parçasıdır ve alt sınıfların, üst sınıfların metodlarını değiştirmesine olanak tanır.

    Özellikler:
    Aynı Metod Adı: Hem üst sınıfta hem de alt sınıfta aynı metod adı kullanılır.
    Aynı Parametre Listesi: Metodların parametre listeleri aynı olmalıdır.
    Aynı Geri Dönüş Tipi: Geri dönüş tipi aynı olmalıdır (veya alt sınıfın metodunun geri dönüş tipi, üst sınıfın geri dönüş tipinin alt tipi olabilir).
    @Override Anotasyonu: Alt sınıfta metodun geçersiz kılındığını belirtmek için genellikle @Override anotasyonu kullanılır.
   * Örnek:
   * java
   * Kodu kopyala
   * class Animal {
   *     // Üst sınıfta tanımlanan metod
   *     public void makeSound() {
   *         System.out.println("Animal makes a sound");
   *     }
   * }
   *
   * class Dog extends Animal {
   *     // Alt sınıfta metodun geçersiz kılınması
   *     @Override
   *     public void makeSound() {
   *         System.out.println("Dog barks");
   *     }
   * }
   * Aralarındaki Farklar
   * Metod İmzası:
   *
   * Overloading: Aynı isimli metotlar farklı parametre listelerine sahip olur.
   * Overriding: Aynı isimli metotlar aynı parametre listesine sahip olur.
   * Kapsam:
   *
   * Overloading: Aynı sınıf içinde gerçekleşir.
   * Overriding: Alt sınıf ile üst sınıf arasında gerçekleşir.
   * Polimorfizm:
   *
   * Overloading: Polimorfizmi desteklemez.
   * Overriding: Polimorfizmi destekler, çünkü alt sınıflar üst sınıfların metodlarını geçersiz kılarak kendi davranışlarını belirleyebilir.
   * Anotasyon:
   *
   * Overloading: @Override anotasyonu kullanılmaz.
   * Overriding: @Override anotasyonu, geçersiz kılmayı belirtmek için kullanılır.
   * Metod aşırı yükleme ve geçersiz kılma, nesne yönelimli programlamada esneklik sağlar ve kodun daha okunabilir ve bakımının kolay olmasına yardımcı olur.
   */


  /**
   * Polimorfizm, nesne yönelimli programlamanın (OOP) temel kavramlarından biridir ve kelime anlamı "çok biçimlilik"tir. Bu kavram, farklı nesnelerin aynı arayüzü paylaşarak farklı
   * şekillerde davranabilmesini sağlar. Polimorfizm, programlarda esneklik ve genişletilebilirlik sunar.
   *
   * Polimorfizmin Türleri
   * Polimorfizm genellikle iki ana türe ayrılır:
   *
   * Compile-time Polymorphism (Derleme Zamanı Polimorfizmi)
   * Runtime Polymorphism (Çalışma Zamanı Polimorfizmi)
   * 1. Compile-time Polymorphism (Derleme Zamanı Polimorfizmi)
   * Derleme zamanı polimorfizmi, metod aşırı yükleme ve operatör aşırı yükleme ile elde edilir. Derleme zamanında hangi metodun çağrılacağı belirlenir.
   *
   * Metod Aşırı Yükleme: Aynı sınıfta aynı isimde, ancak farklı parametre listelerine sahip metotların tanımlanmasıdır.
   *
   * java
   * Kodu kopyala
   * class MathUtils {
   *     public int add(int a, int b) {
   *         return a + b;
   *     }
   *
   *     public double add(double a, double b) {
   *         return a + b;
   *     }
   * }
   * 2. Runtime Polymorphism (Çalışma Zamanı Polimorfizmi)
   * Çalışma zamanı polimorfizmi, metod geçersiz kılma (overriding) ile elde edilir. Üst sınıf referansı, alt sınıf nesnesini işaret edebilir ve çalışma zamanında hangi metodun çağrılacağına karar verilir.
   *
   * Metod Geçersiz Kılma: Alt sınıfın, üst sınıfın metodunu yeniden tanımlamasıdır.
   *
   * java
   * Kodu kopyala
   * class Animal {
   *     public void makeSound() {
   *         System.out.println("Animal makes a sound");
   *     }
   * }
   *
   * class Dog extends Animal {
   *     @Override
   *     public void makeSound() {
   *         System.out.println("Dog barks");
   *     }
   * }
   *
   * class Cat extends Animal {
   *     @Override
   *     public void makeSound() {
   *         System.out.println("Cat meows");
   *     }
   * }
   *
   * public class TestPolymorphism {
   *     public static void main(String[] args) {
   *         Animal myDog = new Dog();
   *         Animal myCat = new Cat();
   *
   *         myDog.makeSound(); // Output: Dog barks
   *         myCat.makeSound(); // Output: Cat meows
   *     }
   * }
   * Polimorfizmin Avantajları
   * Esneklik ve Bakım Kolaylığı: Yeni sınıflar eklendiğinde mevcut kod değişikliğine gerek kalmaz.
   * Kodun Yeniden Kullanılabilirliği: Üst sınıf referansları kullanarak farklı alt sınıf nesneleriyle çalışabilirsiniz.
   * Genişletilebilirlik: Sisteme yeni özellikler eklemek daha kolaydır, çünkü yeni alt sınıflar mevcut sınıflarla uyumlu çalışır.
   * Polimorfizm Nasıl Çalışır?
   * Polimorfizmin çalışmasını sağlayan temel mekanizmalar arasında geç bağlama (late binding) veya dinamik bağlama (dynamic binding) bulunur. Bu mekanizma, programın çalışması sırasında hangi metodun çağrılacağına karar verir.
   *
   * java
   * Kodu kopyala
   * public void animalSound(Animal animal) {
   *     animal.makeSound(); // Çağrılan metod çalışma zamanında belirlenir
   * }
   *
   * public static void main(String[] args) {
   *     Animal myDog = new Dog();
   *     Animal myCat = new Cat();
   *
   *     animalSound(myDog); // Output: Dog barks
   *     animalSound(myCat); // Output: Cat meows
   * }
   * Bu örnekte, animalSound metoduna geçirilen nesne türüne bağlı olarak doğru metod çağrılır. Bu, polimorfizmin gücünü ve esnekliğini gösterir.
   *
   * Polimorfizm, OOP'nin en güçlü özelliklerinden biridir ve yazılım geliştirme süreçlerinde büyük avantajlar sağlar. Nesnelerin farklı şekillerde davranmasını sağlayarak, kodun daha esnek, genişletilebilir ve bakımının kolay olmasına yardımcı olur.
   */

}
