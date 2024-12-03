package org.effective_java.example.item_14;

import java.util.Comparator;

public class IsımKıyaslama implements Comparator<Kitap> {

  public int compare(Kitap m1, Kitap m2) {
    return m1.getIsim().compareTo(m2.getIsim());
  }

}