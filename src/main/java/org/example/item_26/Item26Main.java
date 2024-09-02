package org.example.item_26;

import java.util.*;

public class Item26Main {
  /**
   * 26. Java Raw Types - Raw Type Kullanmayın!
   *
   *
   *
   * Parameterized Type -> List<String>
   *  Raw Type -> List
   */

  public static void main(String[] args) {


      List<String> isimListesi = new ArrayList<>();
      isimListesi.add("Furkan");
      isimListesi.add("James");


      String isimAl = isimListesi.get(1);

      System.out.println(isimAl);
    }

}
