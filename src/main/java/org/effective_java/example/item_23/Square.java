package org.effective_java.example.item_23;

//Class hierarchy replacement for a tagged class  (Page 110-11)
class Square extends Rectangle {

  Square(double side) {
    super(side, side);
  }

}