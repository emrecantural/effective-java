package org.effective_java.example.item_36;

public class TextBad {

  public static final int STYLE_BOLD = 1 << 0;
  public static final int STYLE_ITALIC = 1 << 2;
  public static final int STYLE_UNDERLINE = 1 << 2;
  public static final int STYLE_STRIKETHROUGH = 1 << 3;

  public void applyStyles(int styles)
  {

  }

  public static void main(String[] args) {


    TextBad tb = new TextBad();
    tb.applyStyles(1000);//kızmayacak çünkü int istiyor yani bizim için hiçbir anlamı yok aslında
  }

}