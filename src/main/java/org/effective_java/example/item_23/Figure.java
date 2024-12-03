package org.effective_java.example.item_23;

//Tagged class - vastly inferior to a class hierarchy! (Page 109)
class Figure {

  enum Shape {
    RECTANGLE, CIRCLE
  };

  // Tag field - the shape of this figure
  final Shape shape;

  // These fields are used only if shape is RECTANGLE
  double length;
  double width;

  // This field is used only if shape is CIRCLE
  double radius;

  // Constructor for circle
  Figure(double radius) {
    shape = Shape.CIRCLE;
    this.radius = radius;
  }

  // Constructor for rectangle
  Figure(double length, double width) {
    shape = Shape.RECTANGLE;
    this.length = length;
    this.width = width;
  }

  double area() {
    /**
     * Kötü bir kullanım yarın bir gün ekleme yapıldığında tekrar tekrar değişim gerekli
     *
     * SOLID e ters. Bir sınıfın bir görevi olsun.
     */
    switch (shape) {
      case RECTANGLE:
        return length * width;
      case CIRCLE:
        return Math.PI * (radius * radius);
      default:
        throw new AssertionError(shape);
    }
  }

}