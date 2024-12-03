package org.effective_java.example.item_44;

import java.util.function.BinaryOperator;

public class Item44Main {
  /**
   * 45. Supplier Interface, BinaryOperator Interface (Elde Varsa Yenisini Yazma)
   */


  public static void main(String[] args) {

    BinaryOperator<Integer> op =
            BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

    System.out.println(op.apply(98, 11));


    Integer.sum(3, 5);



    KıyaslaBuyuguAl operasyon = (a, b) -> (a>b)? a: b;
    System.out.println(operasyon.kıyaslaBuyuguAl(5,7)); //7


  }
}
