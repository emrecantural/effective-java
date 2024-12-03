package org.effective_java.example.item_24;

public class Item24Main {
  /**
   * //24. Inner Classes Java - Java iç içe geçmiş Sınıflar,
   *
   *		/*
   * 		 * statik olan iç içe geçmiş sınıflar (static nested classes)
   * 		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
   * 		   yerel sınıflar (local classes)
   * 		   anonim sınıflar (anonymous classes)
   * 		 *
   *
   */


  public static void main(String[] args) {


		/*
		 * statik olan iç içe geçmiş sınıflar (static nested classes)
		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
		   yerel sınıflar (local classes)
		   anonim sınıflar (anonymous classes)
		 *
		 */


//		// Static Nested
//		StaticNested.staticNestedClass nesne = new StaticNested.staticNestedClass();
//			// HesapMakinesi.Operasyon.TOPLA
//			// Builder Ders2
//
//
//		// Non Static Nested
//			// Open for a memory leak..
    //ANA SINIFA BAĞLILIK VAR içindeki oluşturabilmek için üst sınıfı da oluşturman lazım hash memory
//
//		NonStaticNested nonStatic = new NonStaticNested();
//		NonStaticNested.NonStaticNestedClass nesne2 = nonStatic.new NonStaticNestedClass();
//		nesne2.yazBunu();

    // Local classes
    //Sınıfa metot içerisinden erişebilmek tüm esprisi bu
    LocalClass lc = new LocalClass();


    // Anonim
    /**
     *
     */
    SuperClass sc = new SuperClass() {
      @Override
      public void yazBeni() {
        System.out.println("anonim");
      }
    };

    sc.yazBeni();



    SuperClassDerin scd = new SuperClassDerin() {
      @Override
      public void yazBeni() {
        // TODO Auto-generated method stub

      }
    };
    scd.yazBeni();


  }

  /**
   * Java'da iç sınıflar (inner classes), bir sınıfın içinde tanımlanan sınıflardır ve çeşitli türleri vardır. Her bir iç sınıf türü farklı kullanım senaryoları için uygundur ve bu türler arasındaki farkları anlamak, kodunuzu daha etkili bir şekilde yapılandırmanıza yardımcı olabilir. İşte Java'daki iç sınıfların çeşitleri ve örnek kullanımları:
   *
   * ### 1. **Inner Class (Örtük Sınıf)**
   *
   * **Tanım:**
   * - Dış sınıfın bir örneğine bağlı olarak çalışan ve dış sınıfın üyelerine doğrudan erişim sağlayabilen sınıflardır.
   *
   * **Özellikler:**
   * - Dış sınıfın örneğiyle ilişkilidir.
   * - Dış sınıfın özel üyelerine (private) erişebilir.
   * - Genellikle dış sınıfın özel işlevselliğini iç sınıf olarak kapsüllemek için kullanılır.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * public class OuterClass {
   *     private String outerField = "Outer field";
   *
   *     class InnerClass {
   *         void display() {
   *             System.out.println("Accessing outer class field: " + outerField);
   *         }
   *     }
   *
   *     public static void main(String[] args) {
   *         OuterClass outer = new OuterClass();
   *         OuterClass.InnerClass inner = outer.new InnerClass();
   *         inner.display(); // Çıktı: Accessing outer class field: Outer field
   *     }
   * }
   * ```
   *
   * ### 2. **Static Nested Class (Statik İç Sınıf)**
   *
   * **Tanım:**
   * - Dış sınıfın bir örneğine bağlı olmayan, doğrudan dış sınıfa bağlı olan sınıflardır.
   *
   * **Özellikler:**
   * - Dış sınıfın statik üyeleri gibi davranır ve dış sınıfın örneğine erişemez.
   * - Genellikle dış sınıfın statik verilerini ve metodlarını kapsüllemek için kullanılır.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * public class OuterClass {
   *     private static String staticOuterField = "Static outer field";
   *
   *     static class StaticNestedClass {
   *         void display() {
   *             System.out.println("Accessing static outer class field: " + staticOuterField);
   *         }
   *     }
   *
   *     public static void main(String[] args) {
   *         OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
   *         nested.display(); // Çıktı: Accessing static outer class field: Static outer field
   *     }
   * }
   * ```
   *
   * ### 3. **Local Inner Class (Yerel İç Sınıf)**
   *
   * **Tanım:**
   * - Bir metodun veya bir blok kodunun içinde tanımlanan sınıflardır.
   *
   * **Özellikler:**
   * - Tanımlandığı metodun yerel değişkenlerine ve parametrelerine erişebilir (sadece `final` veya etkili olarak `final` olmalıdır).
   * - Genellikle bir metodun iç işleyişini kapsüllemek için kullanılır.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * public class OuterClass {
   *     void outerMethod() {
   *         final String localVariable = "Local variable";
   *
   *         class LocalInnerClass {
   *             void display() {
   *                 System.out.println("Accessing local variable: " + localVariable);
   *             }
   *         }
   *
   *         LocalInnerClass localInner = new LocalInnerClass();
   *         localInner.display(); // Çıktı: Accessing local variable: Local variable
   *     }
   *
   *     public static void main(String[] args) {
   *         OuterClass outer = new OuterClass();
   *         outer.outerMethod();
   *     }
   * }
   * ```
   *
   * ### 4. **Anonymous Inner Class (Anonim İç Sınıf)**
   *
   * **Tanım:**
   * - Adı olmayan ve genellikle bir sınıfın veya arayüzün doğrudan bir örneğini oluşturmak için kullanılan sınıflardır.
   *
   * **Özellikler:**
   * - Genellikle kısa süreli ve bir defaya mahsus kullanım için uygundur.
   * - Bir sınıfın veya arayüzün bir örneğini oluştururken kullanılır.
   *
   * **Kullanım Örneği:**
   *
   * ```java
   * public class OuterClass {
   *     void outerMethod() {
   *         Runnable runnable = new Runnable() {
   *             @Override
   *             public void run() {
   *                 System.out.println("Running in an anonymous inner class.");
   *             }
   *         };
   *
   *         Thread thread = new Thread(runnable);
   *         thread.start();
   *     }
   *
   *     public static void main(String[] args) {
   *         OuterClass outer = new OuterClass();
   *         outer.outerMethod();
   *     }
   * }
   * ```
   *
   * ### **Karşılaştırmalar**
   *
   * - **Örtük Sınıf vs. Statik İç Sınıf**: Örtük sınıflar, dış sınıfın bir örneğine ihtiyaç duyar ve örnek üyelerine erişebilirken, statik iç sınıflar dış sınıfın örneğine bağlı değildir ve sadece statik üyelerle çalışabilir.
   *
   * - **Yerel İç Sınıf vs. Anonim İç Sınıf**: Yerel iç sınıflar bir metodın içinde tanımlanır ve adlandırılırken, anonim iç sınıflar adlandırılmaz ve genellikle kısa süreli görevler için kullanılır.
   *
   * Her iç sınıf türünün avantajları ve kullanım alanları vardır. İhtiyacınıza göre, iç sınıfların bu çeşitlerini seçerek kodunuzu daha düzenli ve etkili hale getirebilirsiniz.
   */

}