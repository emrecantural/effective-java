package org.example.item_12;

public class Item12Main {
  /**
   * //Java to String metodu
   */

  public static void main(String[] args) {
    /**
     * Kullanımı equals hashcode kadar kritik değil ama çok sık kullanılır ve tercih edilir
     */


    Request as = new Request();

    as.setBody("gövde");
    as.setHeader("kafa");

    System.out.println(as); //org.example.item_12.Request@4dd8dc3 -> 4dd8dc3 alanı hash kodununn hexadecimal karşılığı


    /**
     * İstediğimiz tarzda bir toString kullanalım. Override edelim
     *
     */


    System.out.println(as);  //Request: [header =kafa, body= gövde]


    /**
     * Otomatik Jsona çevirme ->google ile
     */
    System.out.println(as);  //Request: [header =kafa, body= gövde]

  }
}

