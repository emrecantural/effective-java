package org.effective_java.example.item_31;

import java.util.*;

//Generic union method with wildcard types for enhanced flexibility (Pages 142-3)
public class Union {

  public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> result = new HashSet<E>(s1);
    result.addAll(s2);
    return result;
  }


  // Simple program to exercise flexible generic staticfactory
  public static void main(String[] args) {

    Set<Integer> integers = new HashSet<>();
    integers.add(1);
    integers.add(3);
    integers.add(5);

    Set<Double> doubles = new HashSet<>();
    doubles.add(2.0);
    doubles.add(4.0);
    doubles.add(6.0);
    Set<String> Türkiye = Set.of("Uğur Boral", "Hasan Şaş", "Burak", "Rüştü");


    Set<Number> numbers = union(integers, doubles);
    //Set<Number> numbers2 = union(integers, Türkiye); //Buna yine kızacak çünkü numberin içiden biri olması lazım

//   // Explicit type parameter - required prior to Java 8
//   Set<Number> numbers = Union.<Number>union(integers, doubles);

    System.out.println(numbers);
  }
}