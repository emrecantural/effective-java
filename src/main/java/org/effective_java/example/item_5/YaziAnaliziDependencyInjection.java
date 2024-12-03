package org.effective_java.example.item_5;

public class YaziAnaliziDependencyInjection {

  private final Sozluk sozluk;

  public YaziAnaliziDependencyInjection(Sozluk sozluk){
    this.sozluk = sozluk;
  }

  public  boolean isValid() {
    return true;
  }
}
