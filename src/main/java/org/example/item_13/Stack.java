package org.example.item_13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public String stackName;

  public String getStackName() {
    return stackName;
  }


  public void setStackName(String stackName) {
    this.stackName = stackName;
  }


  public Stack() {
    this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }


  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() {
    if (size == 0)
      throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  // Ensure space for at least one more element.
  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }

  // Clone method for class with references to mutable state
  @Override
  public Stack clone() {
    //Elemanları da kopyalıyor
    try {
      Stack result = (Stack) super.clone();
      result.elements = elements.clone();
      return result;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }


  public static void main(String[] args) throws CloneNotSupportedException {

    Stack stack = new Stack();

    String[] numaralar = {"1", "2", "3", "4"};
    for (String arg : numaralar)
      stack.push(arg);

    Stack copy = (Stack) stack.clone();


    while (!stack.isEmpty())
      System.out.print(stack.pop() + " ");

    System.out.println();

    while (!copy.isEmpty())
      System.out.print(copy.pop() + " ");
  }


  /**
   * Exception in thread "main" java.lang.CloneNotSupportedException: org.example.item_13.Stack
   * doğrudan override etmeden clone kullandığımızda
   */
  /**
   * Çözüm impelements Cloneable
   */


  /**
   * Eklediğimizde çalıştı. Ancak çıktı:
   *
   * 4 3 2 1
   * null null null null
   */
  /**
   * İki metodunda hash kodu farklı olmasına rağmen clone içerisindeki değerler de siliniyor,
   *
   * SHALLOW COPY GİVİ
   */
  /**
   * ADIM 3
   *
   * clone override etmek
   */
  /**
  *Override sonrası çıktı:
 * 4 3 2 1
 * 4 3 2 1
 */


}
