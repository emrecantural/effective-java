package org.example.item_20_21;

public interface ŞarkıYazarı {

  public void şarkıYaz();

  default boolean şiirYazabiliyormusun()
  {

    return true;
  }

}