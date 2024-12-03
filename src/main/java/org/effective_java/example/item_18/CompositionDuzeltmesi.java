package org.effective_java.example.item_18;

import java.util.HashSet;
import java.util.Set;

public class CompositionDuzeltmesi {


private static Set<String > set = new HashSet<>();

  /**
   * extends etmiyorum da alan olarak kullanıyorum.
   * @param args
   */
  public static void main(String[] args) {
    set.add("Kötü");
    set.forEach(System.out::println);
  }
}
