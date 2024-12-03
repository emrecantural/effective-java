package org.effective_java.example.Item_6;

import java.util.regex.Pattern;

public class RegexExample {

//  public static boolean isRomanNumeral(String s) {
//
//    return s.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"); //Metot dilini buluyot
//  }
//
//  /**
//   * Ancak, s.maches işini takip edersen bir sürü adım olduğunu ve tanım yaptığını göreceksin.
//   * Bu istenilen bişey değil
//   *
//   *
//   */

  //ÇÖZÜM

  private static final Pattern roman = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
  //ÜRetme işleminden böylece kurtulmuş oluyoruz

  static  boolean isNonNumeral (String  s){
    return roman.matcher(s).matches();
  }

  //YERİ VE ZAMANINA GÖRE KULLANILIR NEDEN YAPTIĞINI GÖZLE

}
