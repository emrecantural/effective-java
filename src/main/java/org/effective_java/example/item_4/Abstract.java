package org.effective_java.example.item_4;


public abstract class Abstract {
/*

  Abstract class (soyut sınıf) ve interface (arayüz), Java'da nesne yönelimli programlamada farklı durumlar için kullanılan iki önemli kavramdır. Her ikisi de bir sınıfın belirli bir
  yapıya sahip olmasını zorunlu kılmak için kullanılır, ancak farklı kullanım senaryoları ve farklı özellikleri vardır. İşte abstract class ve interface'lerin kullanımları ve farklılıkları:

  Abstract Class (Soyut Sınıf)
  Tanım: Abstract class, diğer sınıflar tarafından genişletilmek (extend) için tasarlanmış, eksik (soyut) veya tam (somut) metodlar içerebilen bir sınıftır.
  Kullanım: Soyut sınıflar, ortak davranışları ve veri üyelerini paylaşan sınıflar için temel bir yapı oluşturur.
  Özellikler:
  Abstract class içinde hem soyut (abstract) hem de somut (concrete) metodlar bulunabilir.
  Soyut sınıflar, normal sınıflar gibi veri üyeleri (fields) ve metodlar içerebilir.
  Bir sınıf sadece bir soyut sınıfı genişletebilir (Java'da çoklu kalıtım yoktur).
  Constructor içerebilir ve veri üyelerini başlatabilir.
  Static metodlar ve veri üyeleri içerebilir.
  Örnek:
  java
  Kodu kopyala
  abstract class Animal {
      // Soyut metod (abstract method)
      abstract void makeSound();

      // Somut metod (concrete method)
      void eat() {
          System.out.println("Eating...");
      }
  }

  class Dog extends Animal {
      // Soyut metodu implemente etme
      void makeSound() {
          System.out.println("Bark");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Dog dog = new Dog();
          dog.makeSound(); // Çıktı: Bark
          dog.eat();       // Çıktı: Eating...
      }
  }
  Interface (Arayüz)
  Tanım: Interface, sınıflar tarafından implemente edilmesi gereken tamamen soyut metodların bir koleksiyonudur. Bir interface, herhangi bir uygulama kodu içermez.
  Kullanım: Arayüzler, belirli bir davranışı sınıflara zorla uygulamak için kullanılır. Sınıflar, bir veya daha fazla arayüzü implemente edebilir.
  Özellikler:
  Tüm metodlar varsayılan olarak soyut ve public'tir.
  Java 8'den itibaren, arayüzler default ve static metodlar içerebilir.
  Arayüzler, veri üyeleri olarak sadece sabitler (constants) içerebilir; yani değişkenler varsayılan olarak public static final dır.
  Bir sınıf birden fazla arayüzü implemente edebilir (çoklu implementasyon).
  Örnek:
  java
  Kodu kopyala
  interface Animal {
      // Soyut metodlar (abstract methods)
      void makeSound();
      void eat();
  }

  class Dog implements Animal {
      // Arayüz metodlarını implemente etme
      public void makeSound() {
          System.out.println("Bark");
      }

      public void eat() {
          System.out.println("Eating...");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Dog dog = new Dog();
          dog.makeSound(); // Çıktı: Bark
          dog.eat();       // Çıktı: Eating...
      }
  }
  Farklılıklar:
  Özellik	Abstract Class	Interface
  Metod Türleri	Soyut ve somut metodlar	Sadece soyut metodlar (Java 8'den itibaren default ve static metodlar da olabilir)
  Çoklu Kalıtım	Sınıf sadece bir abstract class'ı genişletebilir	Sınıf birden fazla interface'i implemente edebilir
  Veri Üyeleri	Değişkenler ve sabitler içerebilir	Sadece sabitler içerebilir (public static final)
  Constructor	Constructor içerebilir	Constructor içeremez
  Static Üyeler	Static metodlar ve değişkenler içerebilir	Static metodlar (Java 8'den itibaren) ve sabitler içerebilir
  Uygulama Kodları	Evet, somut metodlar içerebilir	Hayır, soyut metodlar dışında uygulama kodu içeremez (Java 8'den itibaren default metodlar hariç)
  Kullanım Senaryoları:
  Abstract Class: Ortak özelliklere ve davranışlara sahip bir grup sınıf oluşturmak istediğinizde kullanılır. Temel bir yapı sağlamak için abstract class kullanılır.
  Interface: Bir sınıfın belirli bir yeteneği veya davranışı uygulamasını zorunlu kılmak için kullanılır. Farklı sınıflar arasında ortak davranışları tanımlamak için interface kullanılır.
  Abstract class ve interface arasındaki bu farklar, doğru kullanımı belirlemek için önemli kriterlerdir. Abstract class'lar ortak özellikler ve davranışlar için temel bir yapı sunarken,
  interface'ler belirli yeteneklerin ve davranışların sınıflar tarafından uygulanmasını sağlar.
 */
}
