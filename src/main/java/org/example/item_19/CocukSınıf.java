package org.example.item_19;

public class CocukSınıf extends AnaSınıf{

  final int deger;

  public CocukSınıf(int deger) {
    this.deger = deger;
  }

  @Override
  void overrideMe() {
    // TODO Auto-generated method stub
    System.out.println(deger);
  }


  public static void main(String[] args) {

    CocukSınıf cocuk = new CocukSınıf(42); //0
    /**
     * İLk başta ana sınıfın construcktorunun çalıştığını unutmamaka lazım.
     */




  }




}