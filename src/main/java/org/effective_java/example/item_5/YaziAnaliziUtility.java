package org.effective_java.example.item_5;

public class YaziAnaliziUtility {

  private final static Sozluk turkce = new Sozluk("Türkçe");

  private YaziAnaliziUtility() { //Utility de direk yazıyorum çünkü  initilaze istemiyorum
    //Çünkü gerek yok
  }

  public static boolean isValid() {
    return true;
  }

  //Lambda için eklendi

  public static String enUzunKelimerlerleOlusturulmusBirMetotAdiOldugunuHayalEdiyoruz() {
    return "Selam";
  }


}
