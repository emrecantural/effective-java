package org.effective_java.example.item_38;

//Emulated extensible enum using an interface (Page 176)
public interface Operation {

  double apply(double x, double y);

}