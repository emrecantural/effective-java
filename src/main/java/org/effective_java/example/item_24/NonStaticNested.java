package org.effective_java.example.item_24;

public class NonStaticNested {

  private String sözcük = "Sözcük";

  public class NonStaticNestedClass
  {

    public void yazBunu()
    {
      System.out.println(sözcük);
    }

  }

}