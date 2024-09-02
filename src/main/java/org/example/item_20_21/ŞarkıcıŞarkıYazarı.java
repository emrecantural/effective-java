package org.example.item_20_21;

public interface ŞarkıcıŞarkıYazarı extends Şarkıcı, ŞarkıYazarı {

  /**
   * Bazı şarkıcılar hem şarkı yazar hem şarkı söyler
   *
   *
   * Kontrollü kulnamak lazım. Çünkü kullanılmayacak bir metot olursa override etmen lazım
   */
  public void çalBirşeyler();

}
