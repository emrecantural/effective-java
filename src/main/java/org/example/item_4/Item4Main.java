package org.example.item_4;

import java.util.Collections;
import java.util.Deque;

public class Item4Main {

  public static void main(String[] args) {

    /**
     * UTILITY Class ve Abstract Utily e neden ihtiyaç duyarız
     *
     * Uygulamanın  bir çok yerinde kullandığımız ortak metotları bir yerde toplayabilmek için kullanılır.
     */

    //Örneğin sadece metotlarını kullanacağın şeyi initilaze etmemek adına private constructer ve static metotlar
    //Collections.sort();
//
//
//    Abstract dene2 = new Abstract(); -> Abstract olduğu için erişemezsin
//
//    AbstractDene dene  = new AbstractDene(); -> Ama extend almış sınıfa eriebilirsin. Bu da yanlış yönlendirebilir.



    //Enum da yapabilirsim
    Enum.topla();
    System.out.println(Enum.topla());


    /**
     * ÖZETLE
     *
     * Utility olarak private constructor ve statik metotlar kullanarak yapılabilir. Tanıma initilaze a gerek kalmada doğrudan kullanabilirsim.
     * Abstract class kullanılabilir ancak extend almış sınıflara doğrudan erişilebildiği için önerilmez.
     * Enum kullanılıp  statik  kullanrak constructor ve benzeri işe gerek kalmadan kullanılabilir
     */

  }
}
