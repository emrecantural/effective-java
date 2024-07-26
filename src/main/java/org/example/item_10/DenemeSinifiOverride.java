package org.example.item_10;

public class DenemeSinifiOverride {

  private int a, b;

  public DenemeSinifiOverride(int a, int b) {
    this.a = a;
    this.b = b;
  }

//Part 2


  @Override //Defaut gelen equals ezilir
  public boolean equals(Object obj) {
    if (obj == this){
      return true;
    }
    if (!(obj instanceof DenemeSinifiOverride))
      return false;

    DenemeSinifiOverride c = (DenemeSinifiOverride) obj;
    return Integer.compare(a, c.a) == 0 && Integer.compare(b, c.b) ==0;


  }
}
