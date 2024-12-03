package org.effective_java.example.item_18;

import java.util.HashSet;

public class KotuBirKalitimOrnegi extends HashSet<Object> {

  /**
   * HashSet içindeki tüm metotlara ulaşabilirsin. Sırf add için ekledik ama tüm nesnelere gereksiz erişmiş oluyoruz.
   * @param args
   */

  public static void main(String[] args) {
     KotuBirKalitimOrnegi kotuOrnek = new KotuBirKalitimOrnegi();
      kotuOrnek.add("kötü");
      kotuOrnek.forEach(System.out::println);
  }

}
