package org.example.item_13;

public class Item13Main {
  ////Shallow Copy -Deep Copy - Java Clone Metot
  public static void main(String[] args) {

    /**
     * Çok önerilmez
     *
     */


    //Shallow Copy

    Stack st = new Stack();
    Stack st1 = st;

    System.out.println(st == st1);//true

    /**
     * Shallow kopyde doğrudan aynı yere bakarlar. Biri değişse diğeri de değişmiş olur
     */


    //DEEP COPY

    /**
     * Farklı nesnelere değer kopyalamsı mevcut
     */

    // Deep Copy
    Stack stc = new Stack();
    stc.stackName = "furkan";

    Stack stc2 = new Stack();
    stc2.stackName = stc.stackName;


    /**
     * Kullanılmaz ve önerilmez.!!!!!
     */
  }
}
