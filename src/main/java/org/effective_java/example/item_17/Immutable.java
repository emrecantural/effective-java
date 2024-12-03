package org.effective_java.example.item_17;

public class Immutable {
  private final int value;

  public Immutable(int value) {
    this.value = value;
  }

  //Readonly
  public int getValue() {
    return value;
  }
}
