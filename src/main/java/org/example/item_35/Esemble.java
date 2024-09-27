package org.example.item_35;

public enum Esemble {
SOLO(1), DUET(2), TRIO(3),QUINTET(5);

private final int numberOfMusicians;

  Esemble(int numberOfMusicians) {
    this.numberOfMusicians = numberOfMusicians;
  }

  public int getNumberOfMusicians() {
    return numberOfMusicians;
  }

  public static void main(String[] args) {

    System.out.println(DUET.numberOfMusicians);
  }
}
