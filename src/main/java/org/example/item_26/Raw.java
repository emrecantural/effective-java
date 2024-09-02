package org.example.item_26;

import java.util.*;

//Fails at runtime - unsafeAdd method uses a raw type (List)!  (Page 119)
public class Raw {

  public static void main(String[] args)
  {

    List<String> strings = new ArrayList<>();
    unsafeAdd(strings, Integer.valueOf(42));



    String s = strings.get(0); // Has compiler-generated cast
    //Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
  }

  private static void unsafeAdd(List list, Object o)
  {
    list.add(o);
  }

}