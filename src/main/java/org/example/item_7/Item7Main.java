package org.example.item_7;

public class Item7Main {

  public void finalize() {
    System.out.println("Çöpler temizlendi!");
  }

  public static void main(String[] args) {
    /**
     * //JMM Java Memory Management - Garbage Collection - memory leak
     *
     * Memory leak (bellek sızıntısı), bir programın gereksiz yere bellekte yer kaplamasına ve bu belleği serbest bırakmamasına
     * neden olan bir durumdur. Bu durum, programın bellek kullanımının artmasına ve nihayetinde bellek kaynaklarının tükenmesine
     * yol açabilir. Bellek sızıntıları genellikle uzun süre çalışan uygulamalarda performans sorunlarına ve sistem çöküşlerine neden olabilir.
     */

    GarbageCollection emre = new GarbageCollection();
    GarbageCollection can = new GarbageCollection();
    GarbageCollection tural = new GarbageCollection();

    can = tural;
    //System.gc(); //Garbage Collector için manuel tetikleme


    //Bişey silmedi ki meaj almadık
    //Heap memory uygulamanın başından beri seninle gelir
    //Stack memory her thread için oluşturulur


    can = null;
    System.gc(); //Garbage Collector için manuel tetikleme


    /**
     * HEAP DUMP ALMAK:
     *
     * yığın dökümü
     *
     *"Heap dump" terimi genellikle yazılım ve sistemlerin performans sorunlarını teşhis etmek için kullanılan bir terimdir.
     *  Bir "heap dump", genellikle Java gibi dillerde JVM (Java Virtual Machine) tarafından sağlanan bir özelliktir ve
     *  programın çalışma zamanında heap belleği durumunu detaylı bir şekilde raporlayan bir dosyadır.
     *
     * Heap dump, programın çalışırken bellek kullanımıyla ilgili sorunlar yaşandığında, bu sorunları teşhis etmek için
     * kullanılır. Bir heap dump dosyası, programın o anki bellek durumunu gösterir: hangi nesnelerin bellekte olduğunu,
     * hangi sınıflardan olduklarını, ne kadar bellek kullandıklarını, ve bu nesneler arasındaki referansları (bağlantıları) içerir.
     *
     * Heap dump dosyası, özellikle bellek sızıntıları veya gereksiz bellek kullanımı gibi sorunları belirlemek için analiz
     * araçlarıyla incelenebilir. Bu dosya, hangi nesnelerin beklenmedik şekilde çok yer kapladığını veya ne zaman oluştuğunu anlamak için kullanılabilir.
     *
     * Özetle, "heap dump" terimi, programın bellek kullanımını incelemek için alınan detaylı bir anlık görüntüyü ifade eder.
     *
     *
     */

    /**
     * Java'da heap, bellekte nesnelerin dinamik olarak depolandığı bir alandır. JVM (Java Virtual Machine), bir Java programı çalıştırıldığında belleği stack ve heap olarak ikiye ayırır.
     *
     * Heap Belleğinin Özellikleri:
     *
     * Dinamik Hafıza Yönetimi: Heap belleği, nesnelerin ömrü boyunca dinamik olarak ayrılan ve yönetilen bellek alanıdır. Yeni nesneler oluşturulduğunda heap üzerinde yer kaplarlar.
     * Garbage Collection: JVM, kullanılmayan nesneleri otomatik olarak temizlemek için bir çöp toplayıcı (garbage collector) kullanır. Bu sayede programcıların belleği manuel olarak yönetmesi gerekmez.
     * Büyük Bellek Alanı: Stack'e kıyasla daha büyük bir bellek alanıdır ve büyük miktarda veri depolamaya uygundur.
     * Paylaşılan Bellek: Heap, uygulama boyunca paylaşılan bir bellek alanıdır ve birden fazla thread bu belleğe erişebilir. Bu nedenle, heap bellekteki verilere erişirken thread güvenliğini sağlamak önemlidir.
     * Yavaş Bellek Erişimi: Stack'e göre erişim hızı daha yavaştır çünkü heap, dinamik bellek yönetimi gerektirir.
     * Heap Belleği Kullanımı:
     *
     * Nesne Oluşturma: new anahtar kelimesi kullanılarak oluşturulan nesneler heap'te depolanır.
     * Class Düzeyindeki Değişkenler: Statik olmayan değişkenler (instance variables) heap bellekte saklanır.
     * Çok Büyük Veriler: Büyük veri yapılarını ve koleksiyonları depolamak için heap belleği kullanılır.
     * Örneğin:
     *
     * java
     * Kodu kopyala
     * public class Person {
     *     private String name;
     *
     *     public Person(String name) {
     *         this.name = name;
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Person person = new Person("John");
     *     }
     * }
     * Bu kodda, new Person("John") ifadesiyle oluşturulan Person nesnesi heap bellekte yer alır. person değişkeni ise stack bellekte depolanan bir referans değişkenidir ve heap'teki Person nesnesini işaret eder.
     */


    /**
     * Stack bellek ve heap bellek arasındaki farklar, bellek yönetimi, hız, yaşam süresi ve veri depolama şekilleri açısından çeşitlidir. İşte bu iki bellek türünün temel farkları:
     *
     * Stack Bellek
     * Bellek Yönetimi:
     *
     * Stack, LIFO (Last In First Out) ilkesine göre çalışır.
     * Bellek yönetimi otomatik ve sabit bir şekilde gerçekleşir. Fonksiyon çağrıldığında bellek tahsis edilir ve fonksiyon bittiğinde otomatik olarak serbest bırakılır.
     * Hız:
     *
     * Stack bellek, heap belleğe göre çok daha hızlıdır. Bellek tahsisi ve serbest bırakılması, stack pointer'ın hareketiyle gerçekleştirilir.
     * Yaşam Süresi:
     *
     * Stack'teki değişkenler, tanımlandıkları blok (genellikle bir fonksiyon) tamamlandığında otomatik olarak bellekten çıkarılır.
     * Kısa ömürlüdür, sadece fonksiyon veya blok süresince var olurlar.
     * Veri Depolama:
     *
     * Stack bellek, temel veri tiplerini (primitive types) ve fonksiyon çağrıları sırasında kullanılan yerel değişkenleri saklar.
     * Stack'teki veriler, fonksiyonlar arası geçici veri geçişleri için kullanılır.
     * Heap Bellek
     * Bellek Yönetimi:
     *
     * Heap, dinamik bellek tahsisi için kullanılır. Bellek tahsisi new anahtar kelimesi ile yapılır ve bellek serbest bırakılması garbage collector tarafından yönetilir.
     * Yönetim daha karmaşıktır ve programcı tarafından manuel olarak yapılmaz.
     * Hız:
     *
     * Heap bellek, stack belleğe göre daha yavaştır. Dinamik bellek tahsisi ve serbest bırakılması daha fazla zaman alır ve bellek parçalanması (fragmentation) meydana gelebilir.
     * Yaşam Süresi:
     *
     * Heap'teki nesneler, garbage collector tarafından temizlenene kadar var olmaya devam eder.
     * Daha uzun ömürlüdürler ve genellikle programın çalışma süresi boyunca var olurlar.
     * Veri Depolama:
     *
     * Heap bellek, nesneleri ve dinamik olarak oluşturulan veri yapılarını (örneğin, diziler, listeler, vb.) saklar.
     * Heap bellekte depolanan veriler, birden fazla fonksiyon veya thread tarafından erişilebilir ve kullanılabilir.
     * Özet Karşılaştırma
     * Özellik	Stack Bellek	Heap Bellek
     * Yönetim	Otomatik (LIFO)	Dinamik (Garbage Collector)
     * Hız	Çok hızlı	Daha yavaş
     * Yaşam Süresi	Kısa (fonksiyon veya blok süresi)	Uzun (garbage collector'a bağlı)
     * Veri Depolama	Temel veri tipleri ve yerel değişkenler	Nesneler ve dinamik veri yapıları
     * Bellek Alanı	Daha küçük	Daha büyük
     * Bellek Erişimi	Thread-safe	Thread güvenliği sağlanmalı
     * Her iki bellek türü de Java'da farklı amaçlar için kullanılır ve her ikisinin de avantajları ve dezavantajları vardır. Stack, hızlı ve geçici veri depolama için idealken, heap, büyük ve kalıcı nesneler için gereklidir.
     */


    /**
     * Java uygulamaları çalışırken, stack ve heap bellek birlikte çalışarak verimli bir bellek yönetimi sağlar.
     * Bu iki bellek bölgesinin nasıl etkileşime girdiğini ve nasıl birlikte çalıştığını anlamak için, bir Java programının çalışması sırasında neler olduğunu adım adım inceleyelim:
     *
     * 1. Program Başlangıcı
     * Bir Java programı çalıştırıldığında, JVM (Java Virtual Machine) başlatılır ve bellek yönetimini stack ve heap olarak ayırır.
     *
     * 2. Stack Belleğin Kullanımı
     * Metot Çağrıları ve Yerel Değişkenler: Her metot çağrıldığında stack bellekte bir "stack frame" oluşturulur. Bu stack frame, metotla ilgili yerel değişkenleri ve parametreleri içerir.
     * LIFO Düzeni: Metot tamamlandığında, o metotla ilgili stack frame otomatik olarak kaldırılır ve bellek serbest bırakılır.
     * 3. Heap Belleğin Kullanımı
     * Nesne Oluşturma: new anahtar kelimesi kullanılarak oluşturulan tüm nesneler heap bellekte saklanır. Bu nesneler, metotlar arasında paylaşılabilir ve metotların ötesinde bir ömre sahip olabilir.
     * Garbage Collection: Heap bellekteki kullanılmayan nesneler, JVM'nin çöp toplayıcısı tarafından otomatik olarak temizlenir. Bu işlem, heap belleğin verimli kullanılmasını sağlar.
     * 4. Stack ve Heap Arasındaki İlişki
     * Referanslar: Stack bellekte bulunan yerel değişkenler ve parametreler, heap bellekteki nesnelere referanslar içerir. Örneğin:
     * java
     * Kodu kopyala
     * public class Person {
     *     private String name;
     *
     *     public Person(String name) {
     *         this.name = name;
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Person person = new Person("John");
     *     }
     * }
     * Bu örnekte, person değişkeni stack bellekte depolanır, ancak new Person("John") ifadesiyle oluşturulan Person nesnesi heap bellekte yer alır. person değişkeni, heap'teki Person nesnesine bir referans içerir.
     * 5. Çoklu Thread ve Bellek Yönetimi
     * Stack Bellek: Her thread'in kendi stack belleği vardır. Bu, thread'ler arasında yerel değişkenlerin izole edilmesini sağlar.
     * Heap Bellek: Heap bellek, tüm thread'ler tarafından paylaşılır. Bu nedenle, heap bellekteki nesnelere erişim sırasında thread güvenliği sağlanmalıdır (örneğin, synchronized blokları kullanarak).
     * Örnek İş Akışı
     * Aşağıdaki örnek, stack ve heap belleğin birlikte nasıl çalıştığını gösterir:
     *
     * java
     * Kodu kopyala
     * public class Example {
     *     public static void main(String[] args) {
     *         int a = 10; // Stack bellekte depolanır
     *         Example example = new Example(); // Heap bellekte depolanır ve stack'teki 'example' referansı üzerinden erişilir
     *         example.doSomething();
     *     }
     *
     *     public void doSomething() {
     *         int b = 20; // Stack bellekte depolanır
     *         String message = "Hello, world!"; // Heap bellekte depolanır ve stack'teki 'message' referansı üzerinden erişilir
     *         System.out.println(message);
     *     }
     * }
     * main metodu çağrıldığında, stack bellekte a ve example değişkenleri için alan ayrılır.
     * new Example() ifadesi, heap bellekte yeni bir Example nesnesi oluşturur ve example referansı bu nesneyi işaret eder.
     * doSomething metodu çağrıldığında, stack bellekte b ve message değişkenleri için alan ayrılır.
     * message değişkeni heap bellekteki "Hello, world!" nesnesini işaret eder.
     * Özet
     * Stack: Metot çağrıları ve yerel değişkenler için hızlı ve geçici bellek.
     * Heap: Dinamik olarak oluşturulan nesneler için daha büyük ve kalıcı bellek.
     * Stack ve heap, referanslar aracılığıyla etkileşime girer. Stack'teki değişkenler, heap'teki nesnelere referanslar içerir.
     * Stack her thread için ayrıdır; heap ise tüm thread'ler tarafından paylaşılır.
     * Bu iş birliği, Java'nın bellek yönetimini verimli ve etkili bir şekilde yapmasını sağlar.
     */

/**
 * Java'da thread (iş parçacığı), bir programın aynı anda birden fazla işi gerçekleştirebilmesini sağlayan bir temel birimdir. Thread'ler, paralel işlem yapabilme ve aynı program içinde birden fazla işin eşzamanlı olarak yürütülebilmesi için kullanılır. Thread'ler, bir işlemi daha küçük parçalara bölerek, her bir parçanın ayrı bir thread olarak çalışmasını sağlar. Bu, programın performansını artırabilir ve belirli görevlerin daha hızlı tamamlanmasına yardımcı olabilir.
 *
 * Thread Nedir?
 * Thread, bir programın birden fazla iş yapabilmesini sağlayan hafif iş parçacıklarıdır. Java'da thread'ler, JVM (Java Virtual Machine) tarafından yönetilir ve programcıya, belirli görevleri paralel olarak yürütme yeteneği sağlar.
 *
 * Thread Kullanımı
 * Java'da thread oluşturmanın ve kullanmanın iki temel yolu vardır:
 *
 * Thread Sınıfını Genişletmek (Extending the Thread Class)
 * Runnable Arayüzünü Gerçekleştirmek (Implementing the Runnable Interface)
 * 1. Thread Sınıfını Genişletmek
 * Thread sınıfını genişleterek yeni bir thread oluşturabilirsiniz. Bu yöntemde, Thread sınıfını genişleten bir sınıf oluşturur ve run metodunu override edersiniz.
 *
 * java
 * Kodu kopyala
 * class MyThread extends Thread {
 *     public void run() {
 *         for (int i = 0; i < 5; i++) {
 *             System.out.println("Thread running: " + i);
 *             try {
 *                 Thread.sleep(500); // 500 milisaniye uyku
 *             } catch (InterruptedException e) {
 *                 System.out.println(e);
 *             }
 *         }
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         MyThread t1 = new MyThread();
 *         t1.start(); // Yeni bir thread başlat
 *     }
 * }
 * Bu örnekte, MyThread sınıfı Thread sınıfını genişletir ve run metodunu override eder. start metodu çağrıldığında, yeni bir thread başlatılır ve run metodu çalıştırılır.
 *
 * 2. Runnable Arayüzünü Gerçekleştirmek
 * Runnable arayüzünü gerçekleştirerek yeni bir thread oluşturabilirsiniz. Bu yöntemde, Runnable arayüzünü gerçekleştiren bir sınıf oluşturur ve run metodunu override edersiniz.
 *
 * java
 * Kodu kopyala
 * class MyRunnable implements Runnable {
 *     public void run() {
 *         for (int i = 0; i < 5; i++) {
 *             System.out.println("Runnable running: " + i);
 *             try {
 *                 Thread.sleep(500); // 500 milisaniye uyku
 *             } catch (InterruptedException e) {
 *                 System.out.println(e);
 *             }
 *         }
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         MyRunnable myRunnable = new MyRunnable();
 *         Thread t1 = new Thread(myRunnable);
 *         t1.start(); // Yeni bir thread başlat
 *     }
 * }
 * Bu örnekte, MyRunnable sınıfı Runnable arayüzünü gerçekleştirir ve run metodunu override eder. Thread sınıfı kullanılarak yeni bir thread oluşturulur ve start metodu çağrıldığında run metodu çalıştırılır.
 *
 * Thread'lerin İşlevi
 * Thread'ler, bir programın aynı anda birden fazla işlemi gerçekleştirebilmesini sağlar. Bu, özellikle uzun süren işlemler (örneğin, dosya okuma/yazma, ağ işlemleri) veya kullanıcı arayüzü güncellemeleri gibi işlemler için faydalıdır.
 *
 * Örnek Kullanım Alanları:
 *
 * Arka Plan İşlemleri: Uzun süren işlemleri arka planda çalıştırmak, böylece ana uygulama işlemlerini etkilememek.
 * Paralel Hesaplama: Büyük hesaplamaları küçük parçalara bölerek, her bir parçayı ayrı bir thread'de çalıştırmak ve hesaplamayı hızlandırmak.
 * Kullanıcı Arayüzü (UI): Kullanıcı arayüzünü dondurmadan arka planda işlemler gerçekleştirmek.
 * Sunucu Uygulamaları: Aynı anda birden fazla istemciden gelen istekleri işlemek.
 * Örnek: İki Thread'in Paralel Çalışması
 * java
 * Kodu kopyala
 * class MyThread extends Thread {
 *     private String threadName;
 *
 *     MyThread(String name) {
 *         this.threadName = name;
 *     }
 *
 *     public void run() {
 *         for (int i = 0; i < 5; i++) {
 *             System.out.println(threadName + " running: " + i);
 *             try {
 *                 Thread.sleep(500);
 *             } catch (InterruptedException e) {
 *                 System.out.println(e);
 *             }
 *         }
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         MyThread t1 = new MyThread("Thread 1");
 *         MyThread t2 = new MyThread("Thread 2");
 *         t1.start();
 *         t2.start();
 *     }
 * }
 * Bu örnekte, Thread 1 ve Thread 2 isimli iki thread paralel olarak çalıştırılır ve çıktılar karışık olarak ekrana yazdırılır. Bu, thread'lerin bağımsız olarak çalıştığını gösterir.
 *
 * Thread Yönetimi
 * Thread'leri yönetmek ve kontrol etmek için çeşitli yöntemler vardır:
 *
 * sleep(long millis): Thread'i belirli bir süre uyku moduna geçirir.
 * join(): Bir thread'in diğerinin bitmesini beklemesini sağlar.
 * interrupt(): Thread'i keser ve InterruptedException fırlatır.
 * synchronized: Thread'ler arası veri tutarlılığını sağlamak için kullanılır.
 * Thread'ler, Java'da paralel programlamanın temelini oluşturur ve doğru kullanıldıklarında uygulamaların performansını ve verimliliğini büyük ölçüde artırabilirler.
 */

/**
 * Stack ve heap belleklerinin thread'ler arasında farklı şekilde yönetilmesi, bellek yönetimi ve veri güvenliği açısından bazı kritik nedenlere dayanır. İşte yazılım açısından bu yaklaşımın mantığı ve avantajları:
 *
 * 1. Stack Bellek: Her Thread İçin Ayrı
 * Yerel Değişkenler ve Metot Çağrıları: Stack bellek, her thread için ayrı bir alan tahsis eder ve bu alan, thread'in yaşam süresi boyunca geçici veriler (yerel değişkenler, metot parametreleri, vb.)
 * için kullanılır. Bu, thread'lerin birbirlerinin yerel değişkenlerine erişememelerini sağlar ve veri bütünlüğünü korur.
 * Güvenlik ve İzolasyon: Her thread'in kendi stack belleğinin olması, thread'lerin birbirlerinin belleğine müdahale edememesi anlamına gelir. Bu, veri güvenliği ve izole edilmiş çalışma ortamı sağlar.
 * Hızlı Erişim: Stack bellek, LIFO (Last In First Out) yapısında çalıştığı için bellek tahsisi ve serbest bırakılması hızlıdır. Bu da stack belleğin performans açısından avantajlı olmasını sağlar.
 * 2. Heap Bellek: Tüm Thread'ler Tarafından Paylaşılır
 * Dinamik Bellek Tahsisi: Heap bellek, dinamik olarak tahsis edilen bellek blokları için kullanılır. Nesneler ve diğer dinamik veriler heap bellekte saklanır. Bu, uzun ömürlü verilerin ve büyük veri yapılarının thread'ler arasında paylaşılabilmesini sağlar.
 * Veri Paylaşımı: Thread'ler arası veri paylaşımı, heap bellek üzerinden gerçekleştirilir. Bu, ortak veri yapılarının (örneğin, paylaşılan nesneler) thread'ler arasında erişilebilir olmasını sağlar.
 * Esneklik: Heap bellek, dinamik ve esnek bellek yönetimi sunar. Bu sayede, ihtiyaç duyulan bellek miktarı program çalıştıkça değişebilir ve heap bellek bu değişikliklere uyum sağlayabilir.
 * Örnek: Thread'ler Arası Veri Paylaşımı
 * Aşağıdaki örnekte, iki thread'in heap bellekte paylaşılan bir nesneyi nasıl kullandığı gösterilmektedir:
 *
 * java
 * Kodu kopyala
 * class SharedResource {
 *     private int counter = 0;
 *
 *     public synchronized void increment() {
 *         counter++;
 *         System.out.println("Counter: " + counter);
 *     }
 * }
 *
 * class MyThread extends Thread {
 *     private SharedResource resource;
 *
 *     MyThread(SharedResource resource) {
 *         this.resource = resource;
 *     }
 *
 *     public void run() {
 *         for (int i = 0; i < 5; i++) {
 *             resource.increment();
 *             try {
 *                 Thread.sleep(100);
 *             } catch (InterruptedException e) {
 *                 System.out.println(e);
 *             }
 *         }
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         SharedResource sharedResource = new SharedResource();
 *         MyThread t1 = new MyThread(sharedResource);
 *         MyThread t2 = new MyThread(sharedResource);
 *         t1.start();
 *         t2.start();
 *     }
 * }
 * Açıklama:
 * SharedResource Sınıfı: Bu sınıf, thread'ler arasında paylaşılan bir kaynağı temsil eder. increment metodu, counter değişkenini artırır.
 * MyThread Sınıfı: Her thread, SharedResource nesnesine erişir ve increment metodunu çağırır.
 * Main Metodu: İki thread (t1 ve t2), aynı SharedResource nesnesini paylaşır ve her ikisi de bu nesne üzerinde işlem yapar.
 * Bu örnekte, SharedResource nesnesi heap bellekte saklanır ve her iki thread de bu nesneye erişebilir. synchronized anahtar kelimesi kullanılarak, thread'lerin aynı anda increment metodunu çağırması engellenir ve veri bütünlüğü korunur.
 *
 * Avantajlar:
 * Veri Güvenliği: Stack bellek izole edildiği için thread'ler arasında veri güvenliği sağlanır.
 * Veri Paylaşımı: Heap bellek, thread'ler arasında veri paylaşımı ve ortak veri yapılarının kullanılmasına olanak tanır.
 * Performans: Stack belleğin hızlı erişim özellikleri, metot çağrılarının ve yerel değişkenlerin yönetimini optimize ederken, heap bellek dinamik ve esnek bellek tahsisi sunar.
 * Bu yapı, thread'lerin hem izole edilmiş hem de birlikte çalışabilen veri yönetimi ihtiyaçlarını karşılar ve yazılımın daha güvenli, verimli ve esnek olmasını sağlar.
 */

  }


}
