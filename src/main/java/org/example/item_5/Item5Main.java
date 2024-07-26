package org.example.item_5;

import java.util.Map;
import java.util.function.Supplier;

public class Item5Main {


  public static void main(String[] args) {


    /**
     * Dependency Injection
     *
     * Sorunumu neyle çözmeliyim?
     */


    // Utility
    YaziAnaliziUtility.isValid(); //dediğimizde sadece türkçe için çalışacak zaten mantıksız

    //Singleton
    YazilimAnaliziSingleton.INSTANCE.isValid(); //Yine esnekliği yok

    //Dependency Injection
    YaziAnaliziDependencyInjection a = new YaziAnaliziDependencyInjection(new Sozluk("Emre")); //Daha esnek hal aldı


    //Supplier
    Supplier<String> item = () -> "Emre"; //Bir interface ve değer döner;

    System.out.println(item.get());



    //Artısı olur mu bilemeyiz ama şu şekilde yapabiliriz.

    Supplier<Sozluk> turkce = () -> new Sozluk("Türkçe");
    //YaziAnaliziDependencyInjection a = new YaziAnaliziDependencyInjection(turkce); //Daha esnek hal aldı --Tipi de suplier olacak;


    //Lambda için kullanım örneği
    YaziAnaliziUtility.enUzunKelimerlerleOlusturulmusBirMetotAdiOldugunuHayalEdiyoruz();

    //bunun yerine suplier
    Supplier<String> dahaKisa =()-> YaziAnaliziUtility.enUzunKelimerlerleOlusturulmusBirMetotAdiOldugunuHayalEdiyoruz();

    System.out.println(dahaKisa.get()); //
    System.out.println(dahaKisa);



    //randomsayi

    double randomSayi = Math.random();
    System.out.println(randomSayi);
    System.out.println(randomSayi);

    Supplier<Double> random = () -> Math.random();
    System.out.println(random.get());
    System.out.println(random.get());


  }



}
