package org.effective_java.example.item_28;

public class Item28Main {
  /**
   * Array vs Generic? - Array vs List? - (Listeleri Arraylere Tercih Edin!)
   */


  	public static void main(String[] args) {

        //POCE-YOKE hatayı olmadan engelle
      /**
       * Siparişlerin kağıda not alınması gibi isimle birlikte
       */

//		Object[] objectArray = new Long[1];
//		objectArray[0] = true; //Farklı türde de atabiliyorum


//		List<Object> ol = new ArrayList<Long>(); // Uyumsuz türler.
//		ol.add(1L);


		/**
		 * Dizilerde Object[] -> Long[] 'un süper sınıfıdır.
		 * Ancak List<Object> -> List<String> arasında böyle bir bağlantı söz konusu olamaz. Generic bizi kurtarıyor!
		 *
		 * Genericleri arraylere tercih etmek bizi kurtarır.
		 */


  // arrayler -> run time da tür güvenliği ancak derlemede sağlamaz
  // genericlerde bunun tam tersi geçerli.
  // Listleri tercih etmeliyiz.

    }
}
