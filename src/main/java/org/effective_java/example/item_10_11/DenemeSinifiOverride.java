package org.effective_java.example.item_10_11;

import java.util.Objects;

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

  //Hash Code override ettikten sonra

//  @Override
//  public int hashCode() {
//    int result = Integer.hashCode(b);
//    result= 31*result +Integer.hashCode(a); //Sabit değerle çarpıp diğer hashkodu ekle //kafana göre bir sayı
//    return result;
//  }

  //Hash Code override ettikten sonra diğer yol çok kuulanışlı görülmez.


  /**
   * Kıtılama açma olduğu için yavaş. Boxing unboxing
   * @return
   */
  @Override
  public int hashCode() {
    return Objects.hash(a,b);
  }
}
