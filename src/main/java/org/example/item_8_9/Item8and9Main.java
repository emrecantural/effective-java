package org.example.item_8_9;

import java.io.*;

public class Item8and9Main {

  //Try Catch Finally vs Try With Resource -Java Finalizers ve Cleaners


  /**
   * ITEM-8
   *
   * Finalizers and cleaners
   *
   * Finalizers -> tahmin edilemez tehlikeli -> java 9 da kalktı
   *
   * Cleaners geldi -> Yine tahmin edilemez
   *
   * Java kütüphaneleri kullansın. Sen kullanma tehlikeli
   */


  /**
   * ITEM-9
   */

//TRY-CATCH-FINALLY
  static String firstLineOfFile(String path, String defaultValue) throws IOException {


    BufferedReader br2 = new BufferedReader(new FileReader(path));
    try {
      return br2.readLine();
    } finally {
      br2.close();
    }
  }


  //TRY WITH RESOURCE
  static String firstLineOfFile2(String path, String defaultValue) throws IOException {


    try (BufferedReader br2 = new BufferedReader(new FileReader(path))) {  //Artısı  olarak finally yazmana gerek kalmadan dosya kapanmış oluyor
      return br2.readLine();
    } catch (IOException e){
    return defaultValue;
  }
}


//  static String firstLineOfFile3(String src, String dest) throws IOException {
//
//try(InputStream in = new FileInputStream(src);
//    OutputStream out = new FileOutputStream(dest) { //Bu şekilde de iki işi açıp kapatabilirsin
///****
// *
// */
//
//}
//}

static void finallyHataAtarsaTryinIcındekiHatayıGoremezssin ()
{
  try {

  } catch (Exception e)
  {

  }finally {
    /**
     * Buradaki bir hata try ın içindeki hatayı  ezer. Catch e düşmez
     */
  }

}





}