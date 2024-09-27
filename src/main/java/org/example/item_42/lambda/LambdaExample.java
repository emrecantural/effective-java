package org.example.item_42.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {

  public String exampleFour()
  {
    return "Örnek 4";
  }

  public String exampleFour2()
  {
    return "Örnek 10";
  }

  public static void main(String[] args) {

    // lambda nedir
    /*
     * Kendi başına tanımlanabilen, parametre kabul eden ve döndürebilen
     * fonksiyondur.
     *
     * Kullanım şekli: (argument-list) -> {body}
     *
     *
     * item 24 içerisinde anonom sınıf örneği far bu da lambdanın öncesi
     */


    // ######1Functional Lambda
 Yazdır yazYeni = new Yazdır() { // Lambda olmasaydı.
   @Override
   public String yazdır() {
     String  a = "hello";
     return a;
   }
 };


    Yazdır y = () -> {
      return "yazdım";
    };
    System.out.println(y.yazdır());



    // ######2 Functional with param

    String param = "Parametre";
    // Lambda with parameter
    YazdırParametre y2 = (paramAlacak) -> {
      return paramAlacak + " selam";
    };
    System.out.println(y2.yazdırParametreyi(param));




    // ######3 Method referansları 43. bölümde detaylı işleyeceğiz burada giriş yaptım.
    LambdaExample le = new LambdaExample();

    Yazdır write = le::exampleFour2; //:: dediğinde tim lambda fonksiyonları gelir_
    System.out.println(write.yazdır());

    // @functionalinterface içinde sadece tek metod olması gerektiğinde bahset. implementasyon sıkıntısı cıkmasın diye..



  }

}