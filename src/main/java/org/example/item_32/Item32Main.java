package org.example.item_32;

public class Item32Main {
  /**
   * 32. Java Varargs - Generic & Varargs
   */

  static void sum(int ... a){
    for (int i : a) {
      System.out.println(a);
      System.out.println(i);
    }
  }
  public static void main(String[] args) {

    /**
     * çok parametreli ve geldiği kadarını topla gibi
     * Varargs -> java 5 tn sonra geldi
     */

    sum(86,25,34,47);
    /**
     * [I@58372a00
     * 86
     * [I@58372a00
     * 25
     * [I@58372a00
     * 34
     * [I@58372a00
     * 47
     */


  //  static void sum( int ... a, String b){} -> yanlış kullanım
  //  static void sum(String b, int ... a){} -> doğru kullanım


  }


}
