package org.example.item_15;

public class GuvenliKod {

  //ADIM 1
  private void mesaj(){
    System.out.println("Merhaba");
  }

  private String asd = ""; //Sadece bu metot içerisinde erişilebilir



  //ADIM 2
  public  void mesaj2(){ //Başka paketlerden de erişim sağlanır
    System.out.println("PUBLİC");
  }

  public int a = 5;




  //ADIM 3
  protected   void mesaj3(){ //Başka paketlerden de erişim sağlanamaz kendi paketinden sağlanır
    //Başka paketten erişim için exteds alınır
    System.out.println("PUBLİC");
  }

  //ADIM 4
  void mesaj4(){ //Başka paketlerden de erişim sağlanamaz kendi paketinden sağlanır
    //Başka paketten erişim sağlanamaz
    System.out.println("PUBLİC");
  }

  //ADIM 5 - PARAMETRELER
  public static  String ab = "ba";
  public static final   String cd = "dc"; //Bir paremetre final ,ise başka değer atanamaz.
  /**
   *   Eğer metot final ise override edilemez.
   *   Sınıf final ise sınıf extend edilemez
    */

  /**
   * Abstract sınıfların nesnesi oluşturulamaz newlenemez
   * Abstract metodun gövdesi olmaz
   * Extend edilebilir ve sınıflar override ile eklenmelidir
   */

  /**
   *String array olduğunda içerisindeki değerleri final olmasına rağmen değiştirebiliyoruz. Bu nedenle, güvenlik açığı oluşuyor.
   *
   * private static final yerine private yap ve Collections.unmpdifiableList veya clone ile al
   */

}
