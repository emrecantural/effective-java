package org.example.item_1;

public class Yemek {

String  name;

//
//  private Yemek(boolean soguk) { //-> Constructor ile
//  }

  public static Yemek sogukYemek(String name){
  return new Dondurma();
}


public static Yemek sicakYemek(String name){

  return new Pide();
}

}
