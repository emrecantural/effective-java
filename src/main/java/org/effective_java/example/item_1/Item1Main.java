package org.effective_java.example.item_1;

public class Item1Main {
  public static void main(String[] args) {

    //Static Factory Metot ve Constructor
    //Factory metotların özelliği -> AYNI SINIFTAN DÖNMELİLER örneğin yemek dönmeli
    //Özellik 1 istediğiniz ismi vermek gibi bir seçeneğiniz yok.

    /**
     * Constructor oluşturduğunda
     */
    // Yemek yemek = new Yemek() //-> parametre alıyor ve ne aldığını bilmek mümkün değil

    /**
     * Static metot kullandığında
     */
    // Yemek yemek = Yemek.sicakYemek() //-> artık daha belirli ve bir ismi var


    //ÖZELLİK 2 -> Constructor ile alt tipte veya farklı tipte bir obje üretemiyoruz.

    Yemek yemek = Yemek.sicakYemek("Sicak");
    Yemek yemek2 = Yemek.sogukYemek("Soguk");

    //Anlaşılacağı gibi dondurma tipi de döner, pide tipi de yani iki farklı obje dönebilirsin


    //Newleyerek üretmek memoryde yeni alan açmanı gerektirir. Ama static faktoryde zaten yeri ayrılmış olacak


    Galatasaray galatasaray = new Galatasaray("Emre", 21);
    Galatasaray galatasaray2 = new Galatasaray("Can", 21);

    //Her yeni üreteceğinde 21 21 yazmak zorunda kalıyoruz. yerine


    Galatasaray galatasaray3 = Galatasaray.yeniFutbolcu("Emre"); //NEWLEMEYE DE GEREK KALMADI


    //OverRide yaptığımızda ise
    // Galatasaray galatasaray4 = new Galatasaray() // Burada hangisini çağıracağımız karışıyor

    //Gereksiz kullanımlardan kaçın. Tüm yemekler aynı özellikteyse mesela constructor işi çözer

  }


}
