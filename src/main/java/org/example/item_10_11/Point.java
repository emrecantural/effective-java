package org.example.item_10_11;

public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }


  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Point))
      return false;

    Point p = (Point) obj;
    return p.x == x && p.y == y;
  }
}
