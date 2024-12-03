package org.effective_java.example.item_17;

public class Mutable extends Immutable {

private  int realValue;

  public Mutable(int value) {
    super(value);
    this.realValue = value;
  }

  public int getValue() {
    return realValue;
  }

  public void setRealValue(int realValue) {
    this.realValue = realValue;
  }

  public static void main(String[] args) {
    Mutable obj = new Mutable(4);
    Immutable imObj = (Immutable) obj;
    System.out.println(imObj.getValue()); //4
    obj.setRealValue(8);
    System.out.println(imObj.getValue()); //8
    /**
     * Değer değiştirildi
     */
  }
}
