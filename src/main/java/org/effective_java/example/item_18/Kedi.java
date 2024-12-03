package org.effective_java.example.item_18;

public class Kedi extends Hayvan{
  String hayvanTipi ="Kedi";

  public static void main(String[] args) {
    Kedi kedi = new Kedi();
    System.out.println(kedi.hayvanIsmi);
    System.out.println(kedi.hayvanTipi);
  }
}
