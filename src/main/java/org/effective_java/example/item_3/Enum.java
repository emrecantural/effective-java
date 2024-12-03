package org.effective_java.example.item_3;

import java.util.HashMap;

public enum Enum implements Cache {
  // ; //Vermesek de olur ama INSTANCE yazmak iyi olur
  INSTANCE;

  /**
   * ENUM içerisinde constructor oluşturmaya gerek yok. -ECT
   */
  private HashMap<Object, Object> map = new HashMap<>();

  @Override
  public void put(Object key, Object value) {
    map = new HashMap<Object, Object>();

  }

  @Override
  public Object get(Object key) {
    return map.get(key);
  }
}
